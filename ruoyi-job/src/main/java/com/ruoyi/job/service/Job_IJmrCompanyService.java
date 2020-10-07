package com.ruoyi.job.service;

import java.util.List;
import com.ruoyi.job.domain.Job_JmrCompany;

/**
 * 企业信息查询Service接口
 * 
 * @author gaofeng
 * @date 2020-09-27
 */

public interface Job_IJmrCompanyService
{
    /**
     * 查询企业信息查询
     * 
     * @param cId 企业信息查询ID
     * @return 企业信息查询
     */
    public Job_JmrCompany selectJmrCompanyById(Long cId);

    /**
     * 查询企业信息查询列表
     * 
     * @param jobJmrCompany 企业信息查询
     * @return 企业信息查询集合
     */
    public List<Job_JmrCompany> selectJmrCompanyList(Job_JmrCompany jobJmrCompany);

    /**
     * 新增企业信息查询
     * 
     * @param jobJmrCompany 企业信息查询
     * @return 结果
     */
    public int insertJmrCompany(Job_JmrCompany jobJmrCompany);

    /**
     * 修改企业信息查询
     * 
     * @param jobJmrCompany 企业信息查询
     * @return 结果
     */
    public int updateJmrCompany(Job_JmrCompany jobJmrCompany);

    /**
     * 批量删除企业信息查询
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrCompanyByIds(String ids);

    /**
     * 删除企业信息查询信息
     * 
     * @param cId 企业信息查询ID
     * @return 结果
     */
    public int deleteJmrCompanyById(Long cId);
}
