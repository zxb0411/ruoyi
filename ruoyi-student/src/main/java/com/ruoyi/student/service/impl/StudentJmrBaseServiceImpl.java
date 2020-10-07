package com.ruoyi.student.service.impl;

import com.ruoyi.student.domain.Student_JmrBase;
import com.ruoyi.student.mapper.Student_JmrBaseMapper;
import com.ruoyi.student.service.IStudentJmrBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 存储匹配好的岗位信息（面向学生端）的依赖数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class StudentJmrBaseServiceImpl implements IStudentJmrBaseService
{
    @Autowired
    private Student_JmrBaseMapper studentJmrBaseMapper;

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBId 存储匹配好的岗位信息（面向学生端）的依赖数据ID
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @Override
    public Student_JmrBase selectJmrBaseById(Integer jmrBId)
    {
        return studentJmrBaseMapper.selectJmrBaseById(jmrBId);
    }

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据列表
     * 
     * @param studentJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @Override
    public List<Student_JmrBase> selectJmrBaseList(Student_JmrBase studentJmrBase)
    {
        return studentJmrBaseMapper.selectJmrBaseList(studentJmrBase);
    }

    /**
     * 新增存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param studentJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 结果
     */
    @Override
    public int insertJmrBase(Student_JmrBase studentJmrBase)
    {
        return studentJmrBaseMapper.insertJmrBase(studentJmrBase);
    }
}
