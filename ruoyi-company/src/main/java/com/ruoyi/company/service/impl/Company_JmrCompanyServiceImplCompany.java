package com.ruoyi.company.service.impl;

import java.util.List;

import com.ruoyi.company.domain.Company_JmrCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.company.mapper.Company_JmrCompanyMapper;
import com.ruoyi.company.service.Company_IJmrCompanyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 存储企业信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
@Service("JmrCompanyService")
public class Company_JmrCompanyServiceImplCompany implements Company_IJmrCompanyService
{
    @Autowired
    private Company_JmrCompanyMapper companyJmrCompanyMapper;

    /**
     * 查询存储企业信息
     * 
     * @param cId 存储企业信息ID
     * @return 存储企业信息
     */
    @Override
    public Company_JmrCompany selectJmrCompanyById(Long cId)
    {
        return companyJmrCompanyMapper.selectJmrCompanyById(cId);
    }
    /**
     * 查询存储企业保存的岗位信息根据电话号码
     *
     */
    @Override
    public Company_JmrCompany selectJmrCompanyByPhone(String jId) {
        return companyJmrCompanyMapper.selectJmrCompanyByPhone(jId);
    }


    /**
     * 查询存储企业信息列表
     * 
     * @param companyJmrCompany 存储企业信息
     * @return 存储企业信息
     */
    @Override
    public List<Company_JmrCompany> selectJmrCompanyList(Company_JmrCompany companyJmrCompany)
    {
        return companyJmrCompanyMapper.selectJmrCompanyList(companyJmrCompany);
    }

    /**
     * 新增存储企业信息
     * 
     * @param companyJmrCompany 存储企业信息
     * @return 结果
     */
    @Override
    public int insertJmrCompany(Company_JmrCompany companyJmrCompany)
    {
        return companyJmrCompanyMapper.insertJmrCompany(companyJmrCompany);
    }

    /**
     * 修改存储企业信息
     * 
     * @param companyJmrCompany 存储企业信息
     * @return 结果
     */
    @Override
    public int updateJmrCompany(Company_JmrCompany companyJmrCompany)
    {
        return companyJmrCompanyMapper.updateJmrCompany(companyJmrCompany);
    }

    /**
     * 删除存储企业信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrCompanyByIds(String ids)
    {
        return companyJmrCompanyMapper.deleteJmrCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储企业信息信息
     * 
     * @param cId 存储企业信息ID
     * @return 结果
     */
    @Override
    public int deleteJmrCompanyById(Long cId)
    {
        return companyJmrCompanyMapper.deleteJmrCompanyById(cId);
    }
}
