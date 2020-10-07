package com.ruoyi.student.service;

import com.ruoyi.student.domain.JmrStudent;

import java.util.List;

/**
 * 存储学生信息Service接口
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public interface IJmrStudentService 
{
    /**
     * 查询存储学生信息
     * 
     * @param sId 存储学生信息ID
     * @return 存储学生信息
     */
    public JmrStudent selectJmrStudentById(Long sId);

    /**
     * 查询存储学生信息列表
     * 
     * @param jmrStudent 存储学生信息
     * @return 存储学生信息集合
     */
    public List<JmrStudent> selectJmrStudentList(JmrStudent jmrStudent);

    /**
     * 新增存储学生信息
     * 
     * @param jmrStudent 存储学生信息
     * @return 结果
     */
    public int insertJmrStudent(JmrStudent jmrStudent);

    /**
     * 修改存储学生信息
     * 
     * @param jmrStudent 存储学生信息
     * @return 结果
     */
    public int updateJmrStudent(JmrStudent jmrStudent);

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

    /*
    * 根据电话号码查询学生信息
    * */
    public JmrStudent selectJmrStudentByPhone(String phoneNumber);
}
