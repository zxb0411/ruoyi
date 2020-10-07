package com.ruoyi.student.mapper;

import com.ruoyi.student.domain.JmrResume;

import java.util.List;

/**
 * 存储学生保持的简历信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public interface JmrResumeMapper 
{
    /**
     * 查询存储学生保持的简历信息
     * 
     * @param rId 存储学生保持的简历信息ID
     * @return 存储学生保持的简历信息
     */
    public JmrResume selectJmrResumeById(Long rId);

    /**
     * 查询存储学生保持的简历信息列表
     * 
     * @param jmrResume 存储学生保持的简历信息
     * @return 存储学生保持的简历信息集合
     */
    public List<JmrResume> selectJmrResumeList(JmrResume jmrResume);

    /**
     * 新增存储学生保持的简历信息
     * 
     * @param jmrResume 存储学生保持的简历信息
     * @return 结果
     */
    public int insertJmrResume(JmrResume jmrResume);

    /**
     * 修改存储学生保持的简历信息
     * 
     * @param jmrResume 存储学生保持的简历信息
     * @return 结果
     */
    public int updateJmrResume(JmrResume jmrResume);

    /**
     * 删除存储学生保持的简历信息
     * 
     * @param rId 存储学生保持的简历信息ID
     * @return 结果
     */
    public int deleteJmrResumeById(Long rId);

    /**
     * 批量删除存储学生保持的简历信息
     * 
     * @param rIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrResumeByIds(String[] rIds);
}
