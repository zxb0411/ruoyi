package com.ruoyi.job.service.impl;

import java.util.List;

import com.ruoyi.job.domain.Job_JmrCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.job.mapper.Job_JmrCompanyMapper;
import com.ruoyi.job.service.Job_IJmrCompanyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 企业信息查询Service业务层处理
 * 
 * @author gaofeng
 * @date 2020-09-27
 */
@Service
public class Job_JmrCompanyServiceImplJob implements Job_IJmrCompanyService
{
    @Autowired
    private Job_JmrCompanyMapper jobJmrCompanyMapper;

    /**
     * 查询企业信息查询
     * 
     * @param cId 企业信息查询ID
     * @return 企业信息查询
     */
    @Override
    public Job_JmrCompany selectJmrCompanyById(Long cId)
    {
        return jobJmrCompanyMapper.selectJmrCompanyById(cId);
    }

    /**
     * 查询企业信息查询列表
     * 
     * @param jobJmrCompany 企业信息查询
     * @return 企业信息查询
     */
    @Override
    public List<Job_JmrCompany> selectJmrCompanyList(Job_JmrCompany jobJmrCompany)
    {
        return jobJmrCompanyMapper.selectJmrCompanyList(jobJmrCompany);
    }

    /**
     * 新增企业信息查询
     * 
     * @param jobJmrCompany 企业信息查询
     * @return 结果
     */
    @Override
    public int insertJmrCompany(Job_JmrCompany jobJmrCompany)
    {
        return jobJmrCompanyMapper.insertJmrCompany(jobJmrCompany);
    }

    /**
     * 修改企业信息查询
     * 
     * @param jobJmrCompany 企业信息查询
     * @return 结果
     */
    @Override
    public int updateJmrCompany(Job_JmrCompany jobJmrCompany)
    {
        return jobJmrCompanyMapper.updateJmrCompany(jobJmrCompany);
    }

    /**
     * 删除企业信息查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrCompanyByIds(String ids)
    {
        return jobJmrCompanyMapper.deleteJmrCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业信息查询信息
     * 
     * @param cId 企业信息查询ID
     * @return 结果
     */
    @Override
    public int deleteJmrCompanyById(Long cId)
    {
        return jobJmrCompanyMapper.deleteJmrCompanyById(cId);
    }
}
