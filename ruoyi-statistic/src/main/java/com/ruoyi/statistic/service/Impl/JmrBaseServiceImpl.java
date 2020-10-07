package com.ruoyi.statistic.service.Impl;

import com.ruoyi.statistic.domain.JmrBase;
import com.ruoyi.statistic.mapper.JmrBaseMapper;
import com.ruoyi.statistic.service.IJmrBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 存储匹配好的岗位信息（面向学生端）的依赖数据Service业务层处理
 * 
 * @author 王德勇
 * @date 2020-09-29
 */
@Service
public class JmrBaseServiceImpl implements IJmrBaseService 
{
    @Autowired
    private JmrBaseMapper jmrBaseMapper;

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBId 存储匹配好的岗位信息（面向学生端）的依赖数据ID
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @Override
    public JmrBase selectJmrBaseById(Long jmrBId)
    {
        return jmrBaseMapper.selectJmrBaseById(jmrBId);
    }

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据列表
     * 
     * @param jmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @Override
    public List<JmrBase> selectJmrBaseList(JmrBase jmrBase)
    {
        return jmrBaseMapper.selectJmrBaseList(jmrBase);
    }

    /**
     * 新增存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 结果
     */

}
