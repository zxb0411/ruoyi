package com.ruoyi.web.controller.student;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.student.domain.JmrStudent;
import com.ruoyi.student.service.IJmrStudentService;
import com.ruoyi.system.domain.SysUser;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

/**
 * 存储学生信息Controller
 *
 * @author ruoyi
 * @date 2020-09-29
 */
@Controller
@RequestMapping("/student/student")
public class JmrStudentController extends BaseController {
    private String prefix = "student/student";

    @Autowired
    private IJmrStudentService jmrStudentService;

    @RequiresPermissions("student:student:view")
    @GetMapping()
    public String student(HttpServletRequest request) {
        return prefix + "/student";
    }

    /**
     * 查询存储学生信息列表
     */
    @RequiresPermissions("student:student:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrStudent jmrStudent, HttpServletRequest request, HttpServletResponse response) {
        // 获取当前的用户信息
        SysUser user = ShiroUtils.getSysUser();
        // 获取当前的用户名称
        String userName = user.getLoginName();
        startPage();
        System.out.println(userName);
        JmrStudent bean = jmrStudentService.selectJmrStudentByPhone(userName);
        HttpSession session = request.getSession();
        if(userName.equals("admin") || "admin"==userName){
            List<JmrStudent> list = jmrStudentService.selectJmrStudentList(jmrStudent);
            return getDataTable(list);
        }else {
            if(Objects.isNull(bean)){
                session.setAttribute("message","yes");
            }else {
                session.setAttribute("message","no");
            }
            jmrStudent.setsTelephone(userName);
            List<JmrStudent> list = jmrStudentService.selectJmrStudentList(jmrStudent);
            return getDataTable(list);
        }

    }


    /**
     * 导出存储学生信息列表
     */
    @RequiresPermissions("student:student:export")
    @Log(title = "存储学生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrStudent jmrStudent) {
        List<JmrStudent> list = jmrStudentService.selectJmrStudentList(jmrStudent);
        ExcelUtil<JmrStudent> util = new ExcelUtil<JmrStudent>(JmrStudent.class);
        return util.exportExcel(list, "student");
    }

    /**
     * 新增存储学生信息
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存存储学生信息
     */
    @RequiresPermissions("student:student:add")
    @Log(title = "存储学生信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrStudent jmrStudent) {
        // 获取当前的用户信息
        SysUser user = ShiroUtils.getSysUser();
        // 获取当前的用户名称
        String userName = user.getLoginName();
        jmrStudent.setsTelephone(userName);
        return toAjax(jmrStudentService.insertJmrStudent(jmrStudent));
    }

    /**
     * 修改存储学生信息
     */
    @GetMapping("/edit/{sId}")
    public String edit(@PathVariable("sId") Long sId, ModelMap mmap) {
        JmrStudent jmrStudent = jmrStudentService.selectJmrStudentById(sId);
        mmap.put("jmrStudent", jmrStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存存储学生信息
     */
    @RequiresPermissions("student:student:edit")
    @Log(title = "存储学生信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrStudent jmrStudent) {
        return toAjax(jmrStudentService.updateJmrStudent(jmrStudent));
    }

    /**
     * 删除存储学生信息
     */
    @RequiresPermissions("student:student:remove")
    @Log(title = "存储学生信息", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(jmrStudentService.deleteJmrStudentByIds(ids));
    }
}
