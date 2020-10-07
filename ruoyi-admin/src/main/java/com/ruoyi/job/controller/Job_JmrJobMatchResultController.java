package com.ruoyi.job.controller;

import java.util.List;

import com.ruoyi.job.domain.Job_JmrJobMatchResult2;
import com.ruoyi.job.domain.Job_JmrStudent;
import com.ruoyi.job.service.Job_IJmrStudentService;
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
import com.ruoyi.job.service.Job_IJmrJobMatchResultService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 匹配信息查询Controller
 * 
 * @author 李佳鹏
 * @date 2020-09-29
 */
@Controller
@RequestMapping("/job/result")
public class Job_JmrJobMatchResultController extends BaseController
{
    private String prefix = "job/result";

    @Autowired
    private Job_IJmrJobMatchResultService jmrJobMatchResultService;
    @Autowired
    private Job_IJmrStudentService jmrStudentService;


    @RequiresPermissions("job:result:view")
    @GetMapping()
    public String result()
    {
        return prefix + "/result";
    }

    /**
     * 查询匹配信息查询列表
     */
    /*@RequiresPermissions("job:result:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrJobMatchResult jmrJobMatchResult)
    {

        startPage();
        List<JmrJobMatchResult> list = jmrJobMatchResultService.selectJmrJobMatchResultList(jmrJobMatchResult);
        return getDataTable(list);
    }*/
    @RequiresPermissions("job:result:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Job_JmrJobMatchResult2 jmrJobMatchResult)
    {

        startPage();
        List<Job_JmrJobMatchResult2> list = jmrJobMatchResultService.selectJmrJobMatchResultList(jmrJobMatchResult);
//        System.out.println(list);
        return getDataTable(list);
    }

    /**
     * 导出匹配信息查询列表
     */
    @RequiresPermissions("job:result:export")
    @Log(title = "匹配信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Job_JmrJobMatchResult2 jmrJobMatchResult)
    {
        List<Job_JmrJobMatchResult2> list = jmrJobMatchResultService.selectJmrJobMatchResultList(jmrJobMatchResult);
        ExcelUtil<Job_JmrJobMatchResult2> util = new ExcelUtil<Job_JmrJobMatchResult2>(Job_JmrJobMatchResult2.class);
        return util.exportExcel(list, "result");
    }

    /**
     * 新增匹配信息查询
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存匹配信息查询
     */
    @RequiresPermissions("job:result:add")
    @Log(title = "匹配信息查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Job_JmrJobMatchResult2 jmrJobMatchResult)
    {
        return toAjax(jmrJobMatchResultService.insertJmrJobMatchResult(jmrJobMatchResult));
    }

    /**
     * 修改匹配信息查询
     */
    @GetMapping("/edit/{jmrId}")
    public String edit(@PathVariable("jmrId") Long jmrId, ModelMap mmap)
    {
        Job_JmrStudent jobJmrStudent = jmrStudentService.selectJmrStudentById(jmrId);
        mmap.put("jmrStudent", jobJmrStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存匹配信息查询
     */
    @RequiresPermissions("job:result:edit")
    @Log(title = "匹配信息查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Job_JmrJobMatchResult2 jmrJobMatchResult)
    {
        return toAjax(jmrJobMatchResultService.updateJmrJobMatchResult(jmrJobMatchResult));
    }

    /**
     * 删除匹配信息查询
     */
    @RequiresPermissions("job:result:remove")
    @Log(title = "匹配信息查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrJobMatchResultService.deleteJmrJobMatchResultByIds(ids));
    }
}
