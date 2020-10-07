package com.ruoyi.student.service.impl;

import com.ruoyi.student.domain.JmrJobMatchResult;
import com.ruoyi.student.mapper.JmrJobMatchResultMapper;
import com.ruoyi.student.service.IJmrJobMatchResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 存储匹配好的岗位信息（面向学生端）Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class JmrJobMatchResultServiceImpl implements IJmrJobMatchResultService 
{
    @Autowired
    private JmrJobMatchResultMapper jmrJobMatchResultMapper;

    /**
     * 查询存储匹配好的岗位信息（面向学生端）
     * 
     * @param jmrId 存储匹配好的岗位信息（面向学生端）ID
     * @return 存储匹配好的岗位信息（面向学生端）
     */
    @Override
    public JmrJobMatchResult selectJmrJobMatchResultById(Long jmrId)
    {
        return jmrJobMatchResultMapper.selectJmrJobMatchResultById(jmrId);
    }

    /**
     * 查询存储匹配好的岗位信息（面向学生端）列表
     * 
     * @param jmrJobMatchResult 存储匹配好的岗位信息（面向学生端）
     * @return 存储匹配好的岗位信息（面向学生端）
     */
    @Override
    public List<JmrJobMatchResult> selectJmrJobMatchResultList(JmrJobMatchResult jmrJobMatchResult)
    {
        return jmrJobMatchResultMapper.selectJmrJobMatchResultList(jmrJobMatchResult);
    }

    /**
     * 新增存储匹配好的岗位信息（面向学生端）
     * 
     * @param jmrJobMatchResult 存储匹配好的岗位信息（面向学生端）
     * @return 结果
     */
    @Override
    public int insertJmrJobMatchResult(JmrJobMatchResult jmrJobMatchResult)
    {
        return jmrJobMatchResultMapper.insertJmrJobMatchResult(jmrJobMatchResult);
    }

    @Override
    public int deleteJmrJobMatchResultBySId(Long jmrSId) {
        return jmrJobMatchResultMapper.deleteJmrJobMatchResultBySId(jmrSId);
    }

    @Override
    public int deleteJmrJobMatchResult() {
        return jmrJobMatchResultMapper.deleteJmrJobMatchResult();
    }
}
