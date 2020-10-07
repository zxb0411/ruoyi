package com.ruoyi.statistic.service;

import com.ruoyi.statistic.domain.JmrBase;

import java.util.List;

/**
 * 存储匹配好的岗位信息（面向学生端）的依赖数据Service接口
 * 
 * @author 王德勇
 * @date 2020-09-29
 */
public interface IJmrBaseService 
{
    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBId 存储匹配好的岗位信息（面向学生端）的依赖数据ID
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    public JmrBase selectJmrBaseById(Long jmrBId);

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据列表
     * 
     * @param jmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据集合
     */
    public List<JmrBase> selectJmrBaseList(JmrBase jmrBase);

    /**
     * 新增存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 结果
     */

}
