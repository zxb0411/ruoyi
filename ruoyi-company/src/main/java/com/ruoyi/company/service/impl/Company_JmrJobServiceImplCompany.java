package com.ruoyi.company.service.impl;

import java.util.List;

import com.ruoyi.company.domain.Company_JmrJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.company.mapper.Company_JmrJobMapper;
import com.ruoyi.company.service.Company_IJmrJobService;
import com.ruoyi.common.core.text.Convert;

/**
 * 企业岗位管理3.0Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
@Service
public class Company_JmrJobServiceImplCompany implements Company_IJmrJobService
{
    @Autowired
    private Company_JmrJobMapper companyJmrJobMapper;

    /**
     * 查询企业岗位管理3.0
     * 
     * @param jId 企业岗位管理3.0ID
     * @return 企业岗位管理3.0
     */
    @Override
    public Company_JmrJob selectJmrJobById(Integer jId)
    {
        return companyJmrJobMapper.selectJmrJobById(jId);
    }

    /**
     * 查询企业岗位管理3.0列表
     * 
     * @param companyJmrJob 企业岗位管理3.0
     * @return 企业岗位管理3.0
     */
    @Override
    public List<Company_JmrJob> selectJmrJobList(Company_JmrJob companyJmrJob)
    {
        return companyJmrJobMapper.selectJmrJobList(companyJmrJob);
    }

    /**
     * 新增企业岗位管理3.0
     * 
     * @param companyJmrJob 企业岗位管理3.0
     * @return 结果
     */
    @Override
    public int insertJmrJob(Company_JmrJob companyJmrJob)
    {
        return companyJmrJobMapper.insertJmrJob(companyJmrJob);
    }

    /**
     * 修改企业岗位管理3.0
     * 
     * @param companyJmrJob 企业岗位管理3.0
     * @return 结果
     */
    @Override
    public int updateJmrJob(Company_JmrJob companyJmrJob)
    {
        return companyJmrJobMapper.updateJmrJob(companyJmrJob);
    }

    /**
     * 删除企业岗位管理3.0对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrJobByIds(String ids)
    {
        return companyJmrJobMapper.deleteJmrJobByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业岗位管理3.0信息
     * 
     * @param jId 企业岗位管理3.0ID
     * @return 结果
     */
    @Override
    public int deleteJmrJobById(Integer jId)
    {
        return companyJmrJobMapper.deleteJmrJobById(jId);
    }
}
