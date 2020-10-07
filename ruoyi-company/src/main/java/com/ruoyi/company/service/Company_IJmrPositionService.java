package com.ruoyi.company.service;

import java.util.List;

import com.ruoyi.company.domain.Company_JmrPosition;

/**
 * 岗位信息管理Service接口
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
public interface Company_IJmrPositionService
{
    /**
     * 查询岗位信息管理
     * 
     * @param pId 岗位信息管理ID
     * @return 岗位信息管理
     */
    public Company_JmrPosition selectJmrPositionById(Long pId);

    /**
     * 查询岗位信息管理列表
     * 
     * @param companyJmrPosition 岗位信息管理
     * @return 岗位信息管理集合
     */
    public List<Company_JmrPosition> selectJmrPositionList(Company_JmrPosition companyJmrPosition);

    /**
     * 新增岗位信息管理
     * 
     * @param companyJmrPosition 岗位信息管理
     * @return 结果
     */
    public int insertJmrPosition(Company_JmrPosition companyJmrPosition);

    /**
     * 修改岗位信息管理
     * 
     * @param companyJmrPosition 岗位信息管理
     * @return 结果
     */
    public int updateJmrPosition(Company_JmrPosition companyJmrPosition);

    /**
     * 批量删除岗位信息管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrPositionByIds(String ids);

    /**
     * 删除岗位信息管理信息
     * 
     * @param pId 岗位信息管理ID
     * @return 结果
     */
    public int deleteJmrPositionById(Long pId);
}
