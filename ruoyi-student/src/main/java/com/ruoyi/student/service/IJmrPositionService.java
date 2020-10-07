package com.ruoyi.student.service;

import com.ruoyi.student.domain.JmrPosition;

import java.util.List;

/**
 * 存储岗位信息Service接口
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public interface IJmrPositionService 
{
    /**
     * 查询存储岗位信息
     * 
     * @param pId 存储岗位信息ID
     * @return 存储岗位信息
     */
    public JmrPosition selectJmrPositionById(Long pId);

    /**
     * 查询存储岗位信息列表
     * 
     * @param jmrPosition 存储岗位信息
     * @return 存储岗位信息集合
     */
    public List<JmrPosition> selectJmrPositionList(JmrPosition jmrPosition);

    /**
     * 新增存储岗位信息
     * 
     * @param jmrPosition 存储岗位信息
     * @return 结果
     */
    public int insertJmrPosition(JmrPosition jmrPosition);

    /**
     * 修改存储岗位信息
     * 
     * @param jmrPosition 存储岗位信息
     * @return 结果
     */
    public int updateJmrPosition(JmrPosition jmrPosition);

    /**
     * 批量删除存储岗位信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrPositionByIds(String ids);

    /**
     * 删除存储岗位信息信息
     * 
     * @param pId 存储岗位信息ID
     * @return 结果
     */
    public int deleteJmrPositionById(Long pId);
}
