package com.ruoyi.job.controller;

import java.util.List;

import com.ruoyi.job.domain.Job_JmrCompany;
import com.ruoyi.job.domain.Job_JmrJob;
import com.ruoyi.job.service.Job_IJmrCompanyService;
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
import com.ruoyi.job.service.Job_IJmrJobService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 岗位信息查询Controller
 * 
 * @author 李佳鹏
 * @date 2020-09-28
 */
@Controller
@RequestMapping("/job/work")
public class Job_JmrJobController extends BaseController
{
    private String prefix = "job/work";

    @Autowired
    private Job_IJmrJobService jmrJobService;
    @Autowired
    private Job_IJmrCompanyService jmrCompanyService;

    @RequiresPermissions("job:work:view")
    @GetMapping()
    public String work()
    {
        return prefix + "/work";
    }

    /**
     * 查询岗位信息查询列表
     */
    @RequiresPermissions("job:work:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Job_JmrJob jobJmrJob)
    {
        startPage();
        List<Job_JmrJob> list = jmrJobService.selectJmrJobList(jobJmrJob);
        return getDataTable(list);
    }

    /**
     * 导出岗位信息查询列表
     */
    @RequiresPermissions("job:work:export")
    @Log(title = "岗位信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Job_JmrJob jobJmrJob)
    {
        List<Job_JmrJob> list = jmrJobService.selectJmrJobList(jobJmrJob);
        ExcelUtil<Job_JmrJob> util = new ExcelUtil<Job_JmrJob>(Job_JmrJob.class);
        return util.exportExcel(list, "work");
    }

    /**
     * 新增岗位信息查询
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存岗位信息查询
     */
    @RequiresPermissions("job:work:add")
    @Log(title = "岗位信息查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Job_JmrJob jobJmrJob)
    {
        return toAjax(jmrJobService.insertJmrJob(jobJmrJob));
    }

    /**
     * 公司详情
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long jCId, ModelMap mmap)
    {

        Job_JmrCompany jobJmrCompany = jmrCompanyService.selectJmrCompanyById(jCId);
        /*System.out.println(jobJmrCompany);*/
        mmap.put("jmrJob", jobJmrCompany);
        return prefix + "/edit";
    }

    /**
     * 修改保存岗位信息查询
     */
    @RequiresPermissions("job:work:edit")
    @Log(title = "岗位信息查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Job_JmrJob jobJmrJob)
    {
        return toAjax(jmrJobService.updateJmrJob(jobJmrJob));
    }

    /**
     * 删除岗位信息查询
     */
    @RequiresPermissions("job:work:remove")
    @Log(title = "岗位信息查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrJobService.deleteJmrJobByIds(ids));
    }
}
