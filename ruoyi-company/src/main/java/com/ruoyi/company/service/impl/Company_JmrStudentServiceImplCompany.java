package com.ruoyi.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.company.mapper.Company_JmrStudentMapper;
import com.ruoyi.company.domain.Company_JmrStudent;
import com.ruoyi.company.service.Company_IJmrStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 存储学生信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class Company_JmrStudentServiceImplCompany implements Company_IJmrStudentService
{
    @Autowired
    private Company_JmrStudentMapper comCompanyJmrStudentMapper;

    /**
     * 查询存储学生信息
     * 
     * @param sId 存储学生信息ID
     * @return 存储学生信息
     */
    @Override
    public Company_JmrStudent selectJmrStudentById(Long sId)
    {
        return comCompanyJmrStudentMapper.selectJmrStudentById(sId);
    }

    /**
     * 查询存储学生信息列表
     * 
     * @param comCompanyJmrStudent 存储学生信息
     * @return 存储学生信息
     */
    @Override
    public List<Company_JmrStudent> selectJmrStudentList(Company_JmrStudent comCompanyJmrStudent)
    {
        return comCompanyJmrStudentMapper.selectJmrStudentList(comCompanyJmrStudent);
    }

    /**
     * 新增存储学生信息
     * 
     * @param comCompanyJmrStudent 存储学生信息
     * @return 结果
     */
    @Override
    public int insertJmrStudent(Company_JmrStudent comCompanyJmrStudent)
    {
        return comCompanyJmrStudentMapper.insertJmrStudent(comCompanyJmrStudent);
    }

    /**
     * 修改存储学生信息
     * 
     * @param comCompanyJmrStudent 存储学生信息
     * @return 结果
     */
    @Override
    public int updateJmrStudent(Company_JmrStudent comCompanyJmrStudent)
    {
        return comCompanyJmrStudentMapper.updateJmrStudent(comCompanyJmrStudent);
    }

    /**
     * 删除存储学生信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrStudentByIds(String ids)
    {
        return comCompanyJmrStudentMapper.deleteJmrStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储学生信息信息
     * 
     * @param sId 存储学生信息ID
     * @return 结果
     */
    @Override
    public int deleteJmrStudentById(Long sId)
    {
        return comCompanyJmrStudentMapper.deleteJmrStudentById(sId);
    }
}
