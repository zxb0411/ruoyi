package com.ruoyi.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.company.mapper.Company_JmrPositionMapper;
import com.ruoyi.company.domain.Company_JmrPosition;
import com.ruoyi.company.service.Company_IJmrPositionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 岗位信息管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
@Service("Company_JmrPositionServiceImplCompany")
public class Company_JmrPositionServiceImplCompany implements Company_IJmrPositionService
{
    @Autowired
    private Company_JmrPositionMapper companyJmrPositionMapper;

    /**
     * 查询岗位信息管理
     * 
     * @param pId 岗位信息管理ID
     * @return 岗位信息管理
     */
    @Override
    public Company_JmrPosition selectJmrPositionById(Long pId)
    {
        return companyJmrPositionMapper.selectJmrPositionById(pId);
    }

    /**
     * 查询岗位信息管理列表
     * 
     * @param companyJmrPosition 岗位信息管理
     * @return 岗位信息管理
     */
    @Override
    public List<Company_JmrPosition> selectJmrPositionList(Company_JmrPosition companyJmrPosition)
    {
        return companyJmrPositionMapper.selectJmrPositionList(companyJmrPosition);
    }

    /**
     * 新增岗位信息管理
     * 
     * @param companyJmrPosition 岗位信息管理
     * @return 结果
     */
    @Override
    public int insertJmrPosition(Company_JmrPosition companyJmrPosition)
    {
        return companyJmrPositionMapper.insertJmrPosition(companyJmrPosition);
    }

    /**
     * 修改岗位信息管理
     * 
     * @param companyJmrPosition 岗位信息管理
     * @return 结果
     */
    @Override
    public int updateJmrPosition(Company_JmrPosition companyJmrPosition)
    {
        return companyJmrPositionMapper.updateJmrPosition(companyJmrPosition);
    }

    /**
     * 删除岗位信息管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrPositionByIds(String ids)
    {
        return companyJmrPositionMapper.deleteJmrPositionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除岗位信息管理信息
     * 
     * @param pId 岗位信息管理ID
     * @return 结果
     */
    @Override
    public int deleteJmrPositionById(Long pId)
    {
        return companyJmrPositionMapper.deleteJmrPositionById(pId);
    }
}
