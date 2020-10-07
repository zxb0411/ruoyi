package com.ruoyi.student.mapper;

import java.util.List;
import com.ruoyi.student.domain.JmrPosition;

/**
 * 存储岗位信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public interface JmrPositionMapper 
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
     * 删除存储岗位信息
     * 
     * @param pId 存储岗位信息ID
     * @return 结果
     */
    public int deleteJmrPositionById(Long pId);

    /**
     * 批量删除存储岗位信息
     * 
     * @param pIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrPositionByIds(String[] pIds);
}
