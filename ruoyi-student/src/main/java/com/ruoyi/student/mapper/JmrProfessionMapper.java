package com.ruoyi.student.mapper;

import com.ruoyi.student.domain.JmrProfession;

import java.util.List;

/**
 * 存储专业信息Mapper接口
 *
 * @author ruoyi
 * @date 2020-09-29
 */
public interface JmrProfessionMapper {
    /**
     * 查询存储专业信息
     *
     * @param pId 存储专业信息ID
     * @return 存储专业信息
     */
    public JmrProfession selectJmrProfessionById(Long pId);

    /**
     * 查询存储专业信息列表
     *
     * @param jmrProfession 存储专业信息
     * @return 存储专业信息集合
     */
    public List<JmrProfession> selectJmrProfessionList(JmrProfession jmrProfession);

    /*
     * 查询所有专业小类信息
     * */
    public List<JmrProfession> selectJmrProfessionListShort(JmrProfession jmrProfession);

    /**
     * 新增存储专业信息
     *
     * @param jmrProfession 存储专业信息
     * @return 结果
     */
    public int insertJmrProfession(JmrProfession jmrProfession);

    /**
     * 修改存储专业信息
     *
     * @param jmrProfession 存储专业信息
     * @return 结果
     */
    public int updateJmrProfession(JmrProfession jmrProfession);

    /**
     * 删除存储专业信息
     *
     * @param pId 存储专业信息ID
     * @return 结果
     */
    public int deleteJmrProfessionById(Long pId);

    /**
     * 批量删除存储专业信息
     *
     * @param pIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrProfessionByIds(String[] pIds);
}
