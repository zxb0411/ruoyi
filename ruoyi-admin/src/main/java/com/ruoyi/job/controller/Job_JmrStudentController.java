package com.ruoyi.job.controller;

import java.util.List;

import com.ruoyi.job.domain.Job_JmrStudent;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.job.service.Job_IJmrStudentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生信息查询Controller
 * 
 * @author 李佳鹏
 * @date 2020-09-27
 */
@Controller
@RequestMapping("/job/student")
public class Job_JmrStudentController extends BaseController
{
    private String prefix = "job/student";

    @Autowired
    private Job_IJmrStudentService jmrStudentService;

    @RequiresPermissions("job:student:view")
    @GetMapping()
    public String student()
    {
        return prefix + "/student";
    }

    /**
     * 查询学生信息查询列表
     */
    @RequiresPermissions("job:student:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Job_JmrStudent jobJmrStudent)
    {
        startPage();
        List<Job_JmrStudent> list = jmrStudentService.selectJmrStudentList(jobJmrStudent);

        return getDataTable(list);
    }

    /**
     * 导出学生信息查询列表
     */
    @RequiresPermissions("job:student:export")
    @Log(title = "学生信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Job_JmrStudent jobJmrStudent)
    {
        List<Job_JmrStudent> list = jmrStudentService.selectJmrStudentList(jobJmrStudent);
        ExcelUtil<Job_JmrStudent> util = new ExcelUtil<Job_JmrStudent>(Job_JmrStudent.class);
        return util.exportExcel(list, "student");
    }

    /**
     * 新增学生信息查询
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生信息查询
     */
    @RequiresPermissions("job:student:add")
    @Log(title = "学生信息查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Job_JmrStudent jobJmrStudent)
    {
        return toAjax(jmrStudentService.insertJmrStudent(jobJmrStudent));
    }

    /**
     * 修改学生信息查询
     */
    @GetMapping("/edit/{sId}")
    public String edit(@PathVariable("sId") Long sId, ModelMap mmap)
    {
        Job_JmrStudent jobJmrStudent = jmrStudentService.selectJmrStudentById(sId);
        mmap.put("jmrStudent", jobJmrStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生信息查询
     */
    @RequiresPermissions("job:student:edit")
    @Log(title = "学生信息查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Job_JmrStudent jobJmrStudent)
    {
        return toAjax(jmrStudentService.updateJmrStudent(jobJmrStudent));
    }

    /**
     * 删除学生信息查询
     */
    @RequiresPermissions("job:student:remove")
    @Log(title = "学生信息查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrStudentService.deleteJmrStudentByIds(ids));
    }
}
