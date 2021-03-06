package com.ruoyi.company.service;

import java.util.List;
import com.ruoyi.company.domain.Company_JmrStudent;

/**
 * 存储学生信息Service接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface Company_IJmrStudentService
{
    /**
     * 查询存储学生信息
     * 
     * @param sId 存储学生信息ID
     * @return 存储学生信息
     */
    public Company_JmrStudent selectJmrStudentById(Long sId);

    /**
     * 查询存储学生信息列表
     * 
     * @param comCompanyJmrStudent 存储学生信息
     * @return 存储学生信息集合
     */
    public List<Company_JmrStudent> selectJmrStudentList(Company_JmrStudent comCompanyJmrStudent);

    /**
     * 新增存储学生信息
     * 
     * @param comCompanyJmrStudent 存储学生信息
     * @return 结果
     */
    public int insertJmrStudent(Company_JmrStudent comCompanyJmrStudent);

    /**
     * 修改存储学生信息
     * 
     * @param comCompanyJmrStudent 存储学生信息
     * @return 结果
     */
    public int updateJmrStudent(Company_JmrStudent comCompanyJmrStudent);

    /**
     * 批量删除存储学生信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrStudentByIds(String ids);

    /**
     * 删除存储学生信息信息
     * 
     * @param sId 存储学生信息ID
     * @return 结果
     */
    public int deleteJmrStudentById(Long sId);
}
