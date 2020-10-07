package com.ruoyi.student.service;

import com.ruoyi.student.domain.Student_JmrBase;

import java.util.List;

/**
 * 存储匹配好的岗位信息（面向学生端）的依赖数据Service接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface IStudentJmrBaseService
{
    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBId 存储匹配好的岗位信息（面向学生端）的依赖数据ID
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    public Student_JmrBase selectJmrBaseById(Integer jmrBId);

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据列表
     * 
     * @param studentJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据集合
     */
    public List<Student_JmrBase> selectJmrBaseList(Student_JmrBase studentJmrBase);

    /**
     * 新增存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param studentJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 结果
     */
    public int insertJmrBase(Student_JmrBase studentJmrBase);
}
