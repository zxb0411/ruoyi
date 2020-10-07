package com.ruoyi.web.controller.resume;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.student.domain.JmrResume;
import com.ruoyi.student.domain.JmrStudent;
import com.ruoyi.student.service.IJmrResumeService;
import com.ruoyi.student.service.IJmrStudentService;
import com.ruoyi.system.domain.SysUser;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 存储学生保持的简历信息Controller
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
@Controller
@RequestMapping("/student/resume")
public class JmrResumeController extends BaseController
{
    private String prefix = "student/resume";
    @Autowired
    private IJmrStudentService iJmrStudentService;

    @Autowired
    private IJmrResumeService jmrResumeService;

    @RequiresPermissions("student:resume:view")
    @GetMapping()
    public String resume()
    {
        return prefix + "/resume";
    }

    /**
     * 查询存储学生保持的简历信息列表
     */
    @RequiresPermissions("student:resume:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrResume jmrResume)
    {
        // 获取当前的用户信息
        SysUser user = ShiroUtils.getSysUser();
        // 获取当前的用户名称，相当于student表中的s_telephone
        String userName = user.getLoginName();
        if(userName.equals("admin") || "admin"==userName){
            List<JmrResume> list = jmrResumeService.selectJmrResumeList(jmrResume);
            return getDataTable(list);
        }else {
            JmrStudent jmrStudent = iJmrStudentService.selectJmrStudentByPhone(userName);
            if(jmrStudent==null || ("".equals(jmrStudent))){
                return null;
            }else {
                jmrResume.setrSId(jmrStudent.getsId());
                startPage();
                List<JmrResume> list = jmrResumeService.selectJmrResumeList(jmrResume);
                return getDataTable(list);
            }
        }

    }

    /**
     * 导出存储学生保持的简历信息列表
     */
    @RequiresPermissions("student:resume:export")
    @Log(title = "存储学生保持的简历信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrResume jmrResume)
    {
        List<JmrResume> list = jmrResumeService.selectJmrResumeList(jmrResume);
        ExcelUtil<JmrResume> util = new ExcelUtil<JmrResume>(JmrResume.class);
        return util.exportExcel(list, "resume");
    }

    /**
     * 新增存储学生保持的简历信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存存储学生保持的简历信息
     */
    @RequiresPermissions("student:resume:add")
    @Log(title = "存储学生保持的简历信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrResume jmrResume)
    {
        // 获取当前的用户信息
        SysUser user = ShiroUtils.getSysUser();
        // 获取当前的用户名称，相当于student表中的s_telephone
        String userName = user.getLoginName();
        //根据userName查出来student表中的id
        JmrStudent jmrStudent = iJmrStudentService.selectJmrStudentByPhone(userName);
        Long sid = jmrStudent.getsId();
        if(sid==null || ("".equals(sid)) || sid==0){
            return null;
        }else {
            jmrResume.setrSId(sid);
            return toAjax(jmrResumeService.insertJmrResume(jmrResume));
        }
    }

    /**
     * 修改存储学生保持的简历信息
     */
    @GetMapping("/edit/{rId}")
    public String edit(@PathVariable("rId") Long rId, ModelMap mmap)
    {
        JmrResume jmrResume = jmrResumeService.selectJmrResumeById(rId);
        mmap.put("jmrResume", jmrResume);
        return prefix + "/edit";
    }

    /**
     * 修改保存存储学生保持的简历信息
     */
    @RequiresPermissions("student:resume:edit")
    @Log(title = "存储学生保持的简历信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrResume jmrResume)
    {
        return toAjax(jmrResumeService.updateJmrResume(jmrResume));
    }

    /**
     * 删除存储学生保持的简历信息
     */
    @RequiresPermissions("student:resume:remove")
    @Log(title = "存储学生保持的简历信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrResumeService.deleteJmrResumeByIds(ids));
    }
}
