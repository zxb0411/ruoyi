package com.ruoyi.job.mapper;

import java.util.List;

import com.ruoyi.job.domain.Job_JmrJobMatchResult2;
import com.ruoyi.job.domain.Job_JmrStudent;

/**
 * 匹配信息查询Mapper接口
 * 
 * @author 李佳鹏
 * @date 2020-09-29
 */
public interface Job_JmrJobMatchResultMapper
{
    /**
     * 查询匹配信息查询
     * 
     * @param jmrId 匹配信息查询ID
     * @return 匹配信息查询
     */
    public Job_JmrJobMatchResult2 selectJmrJobMatchResultById(Long jmrId);

    /**
     * 查询匹配信息查询列表
     * 
     * @param jmrJobMatchResult 匹配信息查询
     * @return 匹配信息查询集合
     */
    public List<Job_JmrJobMatchResult2> selectJmrJobMatchResultList(Job_JmrJobMatchResult2 jmrJobMatchResult);

    public List<Job_JmrJobMatchResult2> selectJmrStudentName(Job_JmrStudent jobJmrStudent);
    /**
     * 新增匹配信息查询
     * 
     * @param jmrJobMatchResult 匹配信息查询
     * @return 结果
     */
    public int insertJmrJobMatchResult(Job_JmrJobMatchResult2 jmrJobMatchResult);

    /**
     * 修改匹配信息查询
     * 
     * @param jmrJobMatchResult 匹配信息查询
     * @return 结果
     */
    public int updateJmrJobMatchResult(Job_JmrJobMatchResult2 jmrJobMatchResult);

    /**
     * 删除匹配信息查询
     * 
     * @param jmrId 匹配信息查询ID
     * @return 结果
     */
    public int deleteJmrJobMatchResultById(Long jmrId);

    /**
     * 批量删除匹配信息查询
     * 
     * @param jmrIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrJobMatchResultByIds(String[] jmrIds);
}
