package com.ruoyi.job.service.impl;

import java.util.List;

import com.ruoyi.job.domain.Job_JmrJobMatchResult2;
import com.ruoyi.job.domain.Job_JmrStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.job.mapper.Job_JmrJobMatchResultMapper;
import com.ruoyi.job.service.Job_IJmrJobMatchResultService;
import com.ruoyi.common.core.text.Convert;

/**
 * 匹配信息查询Service业务层处理
 * 
 * @author 李佳鹏
 * @date 2020-09-29
 */
@Service("matchService")
public class Job_JmrJobMatchResultServiceImplJob implements Job_IJmrJobMatchResultService
{
    @Autowired
    private Job_JmrJobMatchResultMapper jobJmrJobMatchResultMapper;

    /**
     * 查询匹配信息查询
     * 
     * @param jmrId 匹配信息查询ID
     * @return 匹配信息查询
     */
    @Override
    public Job_JmrJobMatchResult2 selectJmrJobMatchResultById(Long jmrId)
    {
        return jobJmrJobMatchResultMapper.selectJmrJobMatchResultById(jmrId);
    }

    /**
     * 查询匹配信息查询列表
     * 
     * @param jmrJobMatchResult 匹配信息查询
     * @return 匹配信息查询
     */
    @Override
    public List<Job_JmrJobMatchResult2> selectJmrJobMatchResultList(Job_JmrJobMatchResult2 jmrJobMatchResult)
    {
        return jobJmrJobMatchResultMapper.selectJmrJobMatchResultList(jmrJobMatchResult);
    }

    public List<Job_JmrJobMatchResult2> selectJmrStudentName(Job_JmrStudent jobJmrStudent){
        return jobJmrJobMatchResultMapper.selectJmrStudentName(jobJmrStudent);
    }


    /**
     * 新增匹配信息查询
     * 
     * @param jmrJobMatchResult 匹配信息查询
     * @return 结果
     */
    @Override
    public int insertJmrJobMatchResult(Job_JmrJobMatchResult2 jmrJobMatchResult)
    {
        return jobJmrJobMatchResultMapper.insertJmrJobMatchResult(jmrJobMatchResult);
    }

    /**
     * 修改匹配信息查询
     * 
     * @param jmrJobMatchResult 匹配信息查询
     * @return 结果
     */
    @Override
    public int updateJmrJobMatchResult(Job_JmrJobMatchResult2 jmrJobMatchResult)
    {
        return jobJmrJobMatchResultMapper.updateJmrJobMatchResult(jmrJobMatchResult);
    }

    /**
     * 删除匹配信息查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrJobMatchResultByIds(String ids)
    {
        return jobJmrJobMatchResultMapper.deleteJmrJobMatchResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除匹配信息查询信息
     * 
     * @param jmrId 匹配信息查询ID
     * @return 结果
     */
    @Override
    public int deleteJmrJobMatchResultById(Long jmrId)
    {
        return jobJmrJobMatchResultMapper.deleteJmrJobMatchResultById(jmrId);
    }
}
