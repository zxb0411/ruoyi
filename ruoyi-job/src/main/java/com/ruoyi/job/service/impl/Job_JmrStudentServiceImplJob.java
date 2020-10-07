package com.ruoyi.job.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.job.mapper.Job_JmrStudentMapper;
import com.ruoyi.job.domain.Job_JmrStudent;
import com.ruoyi.job.service.Job_IJmrStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生信息查询Service业务层处理
 * 
 * @author 李佳鹏
 * @date 2020-09-27
 */
@Service("stuService")
public class Job_JmrStudentServiceImplJob implements Job_IJmrStudentService
{
    @Autowired
    private Job_JmrStudentMapper jobJmrStudentMapper;

    /**
     * 查询学生信息查询
     * 
     * @param sId 学生信息查询ID
     * @return 学生信息查询
     */
    @Override
    public Job_JmrStudent selectJmrStudentById(Long sId)
    {
        return jobJmrStudentMapper.selectJmrStudentById(sId);
    }

    /**
     * 查询学生信息查询列表
     * 
     * @param jobJmrStudent 学生信息查询
     * @return 学生信息查询
     */
    @Override
    public List<Job_JmrStudent> selectJmrStudentList(Job_JmrStudent jobJmrStudent)
    {
        return jobJmrStudentMapper.selectJmrStudentList(jobJmrStudent);
    }

    /**
     * 新增学生信息查询
     * 
     * @param jobJmrStudent 学生信息查询
     * @return 结果
     */
    @Override
    public int insertJmrStudent(Job_JmrStudent jobJmrStudent)
    {
        return jobJmrStudentMapper.insertJmrStudent(jobJmrStudent);
    }

    /**
     * 修改学生信息查询
     * 
     * @param jobJmrStudent 学生信息查询
     * @return 结果
     */
    @Override
    public int updateJmrStudent(Job_JmrStudent jobJmrStudent)
    {
        return jobJmrStudentMapper.updateJmrStudent(jobJmrStudent);
    }

    /**
     * 删除学生信息查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrStudentByIds(String ids)
    {
        return jobJmrStudentMapper.deleteJmrStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生信息查询信息
     * 
     * @param sId 学生信息查询ID
     * @return 结果
     */
    @Override
    public int deleteJmrStudentById(Long sId)
    {
        return jobJmrStudentMapper.deleteJmrStudentById(sId);
    }
}
