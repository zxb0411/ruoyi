package com.ruoyi.student.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.student.domain.JmrResume;
import com.ruoyi.student.mapper.JmrResumeMapper;
import com.ruoyi.student.service.IJmrResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 存储学生保持的简历信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
@Service
public class JmrResumeServiceImpl implements IJmrResumeService 
{
    @Autowired
    private JmrResumeMapper jmrResumeMapper;

    /**
     * 查询存储学生保持的简历信息
     * 
     * @param rId 存储学生保持的简历信息ID
     * @return 存储学生保持的简历信息
     */
    @Override
    public JmrResume selectJmrResumeById(Long rId)
    {
        return jmrResumeMapper.selectJmrResumeById(rId);
    }

    /**
     * 查询存储学生保持的简历信息列表
     * 
     * @param jmrResume 存储学生保持的简历信息
     * @return 存储学生保持的简历信息
     */
    @Override
    public List<JmrResume> selectJmrResumeList(JmrResume jmrResume)
    {
        return jmrResumeMapper.selectJmrResumeList(jmrResume);
    }

    /**
     * 新增存储学生保持的简历信息
     * 
     * @param jmrResume 存储学生保持的简历信息
     * @return 结果
     */
    @Override
    public int insertJmrResume(JmrResume jmrResume)
    {
        return jmrResumeMapper.insertJmrResume(jmrResume);
    }

    /**
     * 修改存储学生保持的简历信息
     * 
     * @param jmrResume 存储学生保持的简历信息
     * @return 结果
     */
    @Override
    public int updateJmrResume(JmrResume jmrResume)
    {
        return jmrResumeMapper.updateJmrResume(jmrResume);
    }

    /**
     * 删除存储学生保持的简历信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrResumeByIds(String ids)
    {
        return jmrResumeMapper.deleteJmrResumeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储学生保持的简历信息信息
     * 
     * @param rId 存储学生保持的简历信息ID
     * @return 结果
     */
    @Override
    public int deleteJmrResumeById(Long rId)
    {
        return jmrResumeMapper.deleteJmrResumeById(rId);
    }
}
