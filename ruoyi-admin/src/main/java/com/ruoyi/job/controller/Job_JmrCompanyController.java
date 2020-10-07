package com.ruoyi.job.controller;

import java.util.List;

import com.ruoyi.job.domain.Job_JmrCompany;
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
import com.ruoyi.job.service.Job_IJmrCompanyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 企业信息查询Controller
 * 
 * @author gaofeng
 * @date 2020-09-27
 */
@Controller
@RequestMapping("/job/company")
public class Job_JmrCompanyController extends BaseController
{
    private String prefix = "job/company";

    @Autowired
    private Job_IJmrCompanyService jmrCompanyService;

    @RequiresPermissions("job:company:view")
    @GetMapping()
    public String company()
    {
        return prefix + "/company";
    }

    /**
     * 查询企业信息查询列表
     */
    @RequiresPermissions("job:company:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Job_JmrCompany jobJmrCompany)
    {
        startPage();
        List<Job_JmrCompany> list = jmrCompanyService.selectJmrCompanyList(jobJmrCompany);
        return getDataTable(list);
    }

    /**
     * 导出企业信息查询列表
     */
    @RequiresPermissions("job:company:export")
    @Log(title = "企业信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Job_JmrCompany jobJmrCompany)
    {
        List<Job_JmrCompany> list = jmrCompanyService.selectJmrCompanyList(jobJmrCompany);
        ExcelUtil<Job_JmrCompany> util = new ExcelUtil<Job_JmrCompany>(Job_JmrCompany.class);
        return util.exportExcel(list, "company");
    }

    /**
     * 新增企业信息查询
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业信息查询
     */
    @RequiresPermissions("job:company:add")
    @Log(title = "企业信息查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Job_JmrCompany jobJmrCompany)
    {
        return toAjax(jmrCompanyService.insertJmrCompany(jobJmrCompany));
    }

    /**
     * 修改企业信息查询
     */
    @GetMapping("/edit/{cId}")
    public String edit(@PathVariable("cId") Long cId, ModelMap mmap)
    {
        Job_JmrCompany jobJmrCompany = jmrCompanyService.selectJmrCompanyById(cId);
        mmap.put("jmrCompany", jobJmrCompany);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业信息查询
     */
    @RequiresPermissions("job:company:edit")
    @Log(title = "企业信息查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Job_JmrCompany jobJmrCompany)
    {
        return toAjax(jmrCompanyService.updateJmrCompany(jobJmrCompany));
    }

    /**
     * 删除企业信息查询
     */
    @RequiresPermissions("job:company:remove")
    @Log(title = "企业信息查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrCompanyService.deleteJmrCompanyByIds(ids));
    }
}
