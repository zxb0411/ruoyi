package com.ruoyi.web.controller.company;

import java.util.List;
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
import com.ruoyi.company.domain.Company_JmrPosition;
import com.ruoyi.company.service.Company_IJmrPositionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 岗位信息管理Controller
 * 
 * @author ruoyi
 * @date 2020-09-27
 */

@Controller
@RequestMapping("/company/position")
public class JmrPositionController extends BaseController
{
    private String prefix = "company/position";

    @Autowired
    private Company_IJmrPositionService jmrPositionService;

    @RequiresPermissions("company:position:view")
    @GetMapping()
    public String position()
    {
        return prefix + "/position";
    }

    /**
     * 查询岗位信息管理列表
     */
    @RequiresPermissions("company:position:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Company_JmrPosition companyJmrPosition)
    {
        startPage();
        List<Company_JmrPosition> list = jmrPositionService.selectJmrPositionList(companyJmrPosition);
        return getDataTable(list);
    }



    /**
     * 导出岗位信息管理列表
     */
    @RequiresPermissions("company:position:export")
    @Log(title = "岗位信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Company_JmrPosition companyJmrPosition)
    {
        List<Company_JmrPosition> list = jmrPositionService.selectJmrPositionList(companyJmrPosition);
        ExcelUtil<Company_JmrPosition> util = new ExcelUtil<Company_JmrPosition>(Company_JmrPosition.class);
        return util.exportExcel(list, "position");
    }

    /**
     * 新增岗位信息管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存岗位信息管理
     */
    @RequiresPermissions("company:position:add")
    @Log(title = "岗位信息管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Company_JmrPosition companyJmrPosition)
    {
        return toAjax(jmrPositionService.insertJmrPosition(companyJmrPosition));
    }

    /**
     * 修改岗位信息管理
     */
    @GetMapping("/edit/{pId}")
    public String edit(@PathVariable("pId") Long pId, ModelMap mmap)
    {
        Company_JmrPosition companyJmrPosition = jmrPositionService.selectJmrPositionById(pId);
        mmap.put("jmrPosition", companyJmrPosition);
        return prefix + "/edit";
    }

    /**
     * 修改保存岗位信息管理
     */
    @RequiresPermissions("company:position:edit")
    @Log(title = "岗位信息管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Company_JmrPosition companyJmrPosition)
    {
        return toAjax(jmrPositionService.updateJmrPosition(companyJmrPosition));
    }

    /**
     * 删除岗位信息管理
     */
    @RequiresPermissions("company:position:remove")
    @Log(title = "岗位信息管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrPositionService.deleteJmrPositionByIds(ids));
    }
}
