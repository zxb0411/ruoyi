package com.ruoyi.job.service.impl;

import java.util.List;

import com.ruoyi.job.domain.Job_JmrJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.job.mapper.Job_JmrJobMapper;
import com.ruoyi.job.service.Job_IJmrJobService;
import com.ruoyi.common.core.text.Convert;

/**
 * 岗位信息查询Service业务层处理
 * 
 * @author 李佳鹏
 * @date 2020-09-28
 */
@Service("jobService")
public class Job_JmrJobServiceImplJob implements Job_IJmrJobService
{
    @Autowired
    private Job_JmrJobMapper jobJmrJobMapper;

    /**
     * 查询岗位信息查询
     * 
     * @param jCId 岗位信息查询ID
     * @return 岗位信息查询
     */
    @Override
    public List<Job_JmrJob> selectJmrJobById(Integer jCId)
    {
        return jobJmrJobMapper.selectJmrJobById(jCId);
    }

    /**
     * 查询岗位信息查询列表
     * 
     * @param jobJmrJob 岗位信息查询
     * @return 岗位信息查询
     */
    @Override
    public List<Job_JmrJob> selectJmrJobList(Job_JmrJob jobJmrJob)
    {
        return jobJmrJobMapper.selectJmrJobList(jobJmrJob);
    }

    /**
     * 新增岗位信息查询
     * 
     * @param jobJmrJob 岗位信息查询
     * @return 结果
     */
    @Override
    public int insertJmrJob(Job_JmrJob jobJmrJob)
    {
        return jobJmrJobMapper.insertJmrJob(jobJmrJob);
    }

    /**
     * 修改岗位信息查询
     * 
     * @param jobJmrJob 岗位信息查询
     * @return 结果
     */
    @Override
    public int updateJmrJob(Job_JmrJob jobJmrJob)
    {
        return jobJmrJobMapper.updateJmrJob(jobJmrJob);
    }

    /**
     * 删除岗位信息查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrJobByIds(String ids)
    {
        return jobJmrJobMapper.deleteJmrJobByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除岗位信息查询信息
     * 
     * @param jId 岗位信息查询ID
     * @return 结果
     */
    @Override
    public int deleteJmrJobById(Integer jId)
    {
        return jobJmrJobMapper.deleteJmrJobById(jId);
    }
}
