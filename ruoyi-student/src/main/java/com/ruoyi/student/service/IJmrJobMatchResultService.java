package com.ruoyi.student.service;

import com.ruoyi.student.domain.JmrJobMatchResult;

import java.util.List;

/**
 * 存储匹配好的岗位信息（面向学生端）Service接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface IJmrJobMatchResultService 
{
    /**
     * 查询存储匹配好的岗位信息（面向学生端）
     * 
     * @param jmrId 存储匹配好的岗位信息（面向学生端）ID
     * @return 存储匹配好的岗位信息（面向学生端）
     */
    public JmrJobMatchResult selectJmrJobMatchResultById(Long jmrId);

    /**
     * 查询存储匹配好的岗位信息（面向学生端）列表
     * 
     * @param jmrJobMatchResult 存储匹配好的岗位信息（面向学生端）
     * @return 存储匹配好的岗位信息（面向学生端）集合
     */
    public List<JmrJobMatchResult> selectJmrJobMatchResultList(JmrJobMatchResult jmrJobMatchResult);

    /**
     * 新增存储匹配好的岗位信息（面向学生端）
     * 
     * @param jmrJobMatchResult 存储匹配好的岗位信息（面向学生端）
     * @return 结果
     */
    public int insertJmrJobMatchResult(JmrJobMatchResult jmrJobMatchResult);

    /*
     * 根据学生id删除表中数据
     * */
    public int deleteJmrJobMatchResultBySId(Long jmrSId);

    /*
    * 删除表中数据
    * */
    public int deleteJmrJobMatchResult();
}
