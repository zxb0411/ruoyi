package com.ruoyi.company.mapper;

import java.util.List;

import com.ruoyi.company.domain.Company_JmrCompany;

/**
 * 存储企业信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-27
 */

public interface Company_JmrCompanyMapper
{
    /**
     * 查询存储企业信息
     * 
     * @param cId 存储企业信息ID
     * @return 存储企业信息
     */
    public Company_JmrCompany selectJmrCompanyById(Long cId);
    /**
     * 查询存储企业信息根据联系方式
     *
     *
     */
    public Company_JmrCompany selectJmrCompanyByPhone(String jId);
    /**
     * 查询存储企业信息列表
     * 
     * @param companyJmrCompany 存储企业信息
     * @return 存储企业信息集合
     */
    public List<Company_JmrCompany> selectJmrCompanyList(Company_JmrCompany companyJmrCompany);

    /**
     * 新增存储企业信息
     * 
     * @param companyJmrCompany 存储企业信息
     * @return 结果
     */
    public int insertJmrCompany(Company_JmrCompany companyJmrCompany);

    /**
     * 修改存储企业信息
     * 
     * @param companyJmrCompany 存储企业信息
     * @return 结果
     */
    public int updateJmrCompany(Company_JmrCompany companyJmrCompany);

    /**
     * 删除存储企业信息
     * 
     * @param cId 存储企业信息ID
     * @return 结果
     */
    public int deleteJmrCompanyById(Long cId);

    /**
     * 批量删除存储企业信息
     * 
     * @param cIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrCompanyByIds(String[] cIds);
}
