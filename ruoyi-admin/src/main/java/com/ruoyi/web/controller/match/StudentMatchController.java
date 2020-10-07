package com.ruoyi.web.controller.match;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.student.domain.Student_JmrBase;
import com.ruoyi.student.domain.JmrJob;
import com.ruoyi.student.domain.JmrJobMatchResult;
import com.ruoyi.student.domain.JmrStudent;
import com.ruoyi.student.service.IStudentJmrBaseService;
import com.ruoyi.student.service.IJmrJobMatchResultService;
import com.ruoyi.student.service.IJmrJobService;
import com.ruoyi.student.service.IJmrStudentService;
import com.ruoyi.system.domain.SysUser;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student/match")
public class StudentMatchController extends BaseController {
    @Autowired
    private IJmrStudentService iJmrStudentService;

    @Autowired
    private IJmrJobService iJmrJobService;

    @Autowired
    private IStudentJmrBaseService iStudentJmrBaseService;

    @Autowired
    private IJmrJobMatchResultService jmrJobMatchResultService;

    @RequiresPermissions("student:match:view")
    @GetMapping()
    public String match(HttpServletRequest request) {
        return  "redirect:/student/match/matching";
    }

    @RequestMapping("/matching")
    public String matching() {
        // 获取当前的用户信息
        SysUser user = ShiroUtils.getSysUser();
        // 获取当前的用户名称
        String userName = user.getLoginName();
        //如果是系统用户则不需要匹配 直接查询表中数据进行显示
        if(userName.equals("admin") || "admin"==userName){
            return "student/match/match";
        }
        //查询当前学生信息
        JmrStudent jmrStudent = iJmrStudentService.selectJmrStudentByPhone(userName);
        if(jmrStudent==null || "".equals(jmrStudent)){
            return "student/match/error";
        }
        //根据学生id删除表中数据防止 多次刷新导致数据重复
        jmrJobMatchResultService.deleteJmrJobMatchResultBySId(jmrStudent.getsId());
        //查询所有企业岗位信息
        ArrayList<JmrJob> jmrJobs = (ArrayList<JmrJob>) iJmrJobService.selectList();
        //进行匹配
        for (int i = 0; i < jmrJobs.size(); i++) {
            //取每一个岗位信息
            JmrJob jmrJob = jmrJobs.get(i);
            //匹配结果表jmr_base表
            Student_JmrBase studentJmrBaseResult = new Student_JmrBase();
            //匹配结果统计表jmr_job_match_result表
            JmrJobMatchResult jmrJobMatchResult = new JmrJobMatchResult();
            //计分器，默认0
            int num = 0;
            if ((jmrJob.getjPoId()) == jmrStudent.getsEPosition().intValue()) {//判断岗位
                studentJmrBaseResult.setJmrPositionValue(1);
                num += 10;
            } else {
                studentJmrBaseResult.setJmrPositionValue(0);
            }
            if (jmrJob.getjSex() == jmrStudent.getsSex()) {//判断性别
                studentJmrBaseResult.setJmrSexValue(1);
                num += 10;
            } else {
                studentJmrBaseResult.setJmrSexValue(0);
            }
            if (jmrJob.getjEHistory() == jmrStudent.getsEHistory()) {//判断学历
                studentJmrBaseResult.setJmrHistoryValue(1);
                num += 10;
            } else {
                studentJmrBaseResult.setJmrHistoryValue(0);
            }
            if (jmrJob.getjCLevel() == jmrStudent.getsCLevel()) {//判断学校层次
                studentJmrBaseResult.setJmrLevelValue(1);
                num += 10;
            } else {
                studentJmrBaseResult.setJmrLevelValue(0);
            }
            if (jmrJob.getjFLanguage() == jmrStudent.getsFLanguage()) {//判断外语水平
                studentJmrBaseResult.setJmrLanguageValue(1);
                num += 10;
            } else {
                studentJmrBaseResult.setJmrLanguageValue(0);
            }
            if (jmrJob.getjPrId() == jmrStudent.getsProfession()) {//判断专业
                studentJmrBaseResult.setJmrProfessionValue(1);
                num += 10;
            } else {
                studentJmrBaseResult.setJmrProfessionValue(0);
            }
            if (jmrJob.getjSRange() == jmrStudent.getsSRange()) {//判断薪资水平
                studentJmrBaseResult.setJmrRangeValue(1);
                num += 10;
            } else {
                studentJmrBaseResult.setJmrRangeValue(0);
            }
            if (jmrJob.getjECity() == jmrStudent.getsECity()) {//判断就业意向地
                studentJmrBaseResult.setJmrCityValue(1);
                num += 10;
            } else {
                studentJmrBaseResult.setJmrCityValue(0);
            }
            iStudentJmrBaseService.insertJmrBase(studentJmrBaseResult);
            //插入学生id对应jmr_student表id
            jmrJobMatchResult.setJmrSId(jmrStudent.getsId());
            //插入岗位id对应jmr_job表id
            jmrJobMatchResult.setJmrJId(Long.valueOf(jmrJob.getjId()));
            //插入匹配数据表id,jmrBId
            jmrJobMatchResult.setJmrBId(Long.valueOf(studentJmrBaseResult.getJmrBId()));
            //插入匹配值
            jmrJobMatchResult.setJmrValue(Long.valueOf(num));
            //插入企业id
            jmrJobMatchResult.setJmrCId(Long.valueOf(jmrJob.getjCId()));
            jmrJobMatchResultService.insertJmrJobMatchResult(jmrJobMatchResult);
        }
        return "student/match/match";
    }

    //查询匹配信息列表
    @RequiresPermissions("student:match:list")
    @RequestMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrJobMatchResult jmrJobMatchResult){
        // 获取当前的用户信息
        SysUser user = ShiroUtils.getSysUser();
        // 获取当前的用户名称
        String userName = user.getLoginName();
        JmrStudent bean = iJmrStudentService.selectJmrStudentByPhone(userName);
        startPage();
        System.out.println(userName);
        if(userName.equals("admin") || "admin"==userName){
            List<JmrJobMatchResult> list = jmrJobMatchResultService.selectJmrJobMatchResultList(jmrJobMatchResult);
            return getDataTable(list);
        }else {
            jmrJobMatchResult.setJmrSId(bean.getsId());
            List<JmrJobMatchResult> list = jmrJobMatchResultService.selectJmrJobMatchResultList(jmrJobMatchResult);
            return getDataTable(list);
        }
    }
}
