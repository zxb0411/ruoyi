package com.ruoyi.student.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.student.domain.JmrPosition;
import com.ruoyi.student.mapper.JmrPositionMapper;
import com.ruoyi.student.service.IJmrPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 存储岗位信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
@Service("JmrPositionServiceImpl")
public class JmrPositionServiceImpl implements IJmrPositionService 
{
    @Autowired
    private JmrPositionMapper jmrPositionMapper;

    /**
     * 查询存储岗位信息
     * 
     * @param pId 存储岗位信息ID
     * @return 存储岗位信息
     */
    @Override
    public JmrPosition selectJmrPositionById(Long pId)
    {
        return jmrPositionMapper.selectJmrPositionById(pId);
    }

    /**
     * 查询存储岗位信息列表
     * 
     * @param jmrPosition 存储岗位信息
     * @return 存储岗位信息
     */
    @Override
    public List<JmrPosition> selectJmrPositionList(JmrPosition jmrPosition)
    {
        return jmrPositionMapper.selectJmrPositionList(jmrPosition);
    }

    /**
     * 新增存储岗位信息
     * 
     * @param jmrPosition 存储岗位信息
     * @return 结果
     */
    @Override
    public int insertJmrPosition(JmrPosition jmrPosition)
    {
        return jmrPositionMapper.insertJmrPosition(jmrPosition);
    }

    /**
     * 修改存储岗位信息
     * 
     * @param jmrPosition 存储岗位信息
     * @return 结果
     */
    @Override
    public int updateJmrPosition(JmrPosition jmrPosition)
    {
        return jmrPositionMapper.updateJmrPosition(jmrPosition);
    }

    /**
     * 删除存储岗位信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrPositionByIds(String ids)
    {
        return jmrPositionMapper.deleteJmrPositionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储岗位信息信息
     * 
     * @param pId 存储岗位信息ID
     * @return 结果
     */
    @Override
    public int deleteJmrPositionById(Long pId)
    {
        return jmrPositionMapper.deleteJmrPositionById(pId);
    }
}
