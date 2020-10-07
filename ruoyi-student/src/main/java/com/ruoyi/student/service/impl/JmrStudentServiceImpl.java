package com.ruoyi.student.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.student.domain.JmrStudent;
import com.ruoyi.student.mapper.JmrStudentMapper;
import com.ruoyi.student.service.IJmrStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 存储学生信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
@Service("JmrStudentServiceImpl")
public class JmrStudentServiceImpl implements IJmrStudentService 
{
    @Autowired
    private JmrStudentMapper jmrStudentMapper;

    /**
     * 查询存储学生信息
     * 
     * @param sId 存储学生信息ID
     * @return 存储学生信息
     */
    @Override
    public JmrStudent selectJmrStudentById(Long sId)
    {
        return jmrStudentMapper.selectJmrStudentById(sId);
    }

    /**
     * 查询存储学生信息列表
     * 
     * @param jmrStudent 存储学生信息
     * @return 存储学生信息
     */
    @Override
    public List<JmrStudent> selectJmrStudentList(JmrStudent jmrStudent)
    {
        return jmrStudentMapper.selectJmrStudentList(jmrStudent);
    }

    /**
     * 新增存储学生信息
     * 
     * @param jmrStudent 存储学生信息
     * @return 结果
     */
    @Override
    public int insertJmrStudent(JmrStudent jmrStudent)
    {
        return jmrStudentMapper.insertJmrStudent(jmrStudent);
    }

    /**
     * 修改存储学生信息
     * 
     * @param jmrStudent 存储学生信息
     * @return 结果
     */
    @Override
    public int updateJmrStudent(JmrStudent jmrStudent)
    {
        return jmrStudentMapper.updateJmrStudent(jmrStudent);
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
        return jmrStudentMapper.deleteJmrStudentByIds(Convert.toStrArray(ids));
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
        return jmrStudentMapper.deleteJmrStudentById(sId);
    }

    @Override
    public JmrStudent selectJmrStudentByPhone(String phoneNumber) {
        return jmrStudentMapper.selectJmrStudentByPhone(phoneNumber);
    }
}
