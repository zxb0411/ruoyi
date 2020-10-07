package com.ruoyi.student.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.student.domain.JmrProfession;
import com.ruoyi.student.mapper.JmrProfessionMapper;
import com.ruoyi.student.service.IJmrProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 存储专业信息Service业务层处理
 *
 * @author ruoyi
 * @date 2020-09-29
 */
@Service("Student_JmrProfessionServiceImpl")
public class JmrProfessionServiceImpl implements IJmrProfessionService {
    @Autowired
    private JmrProfessionMapper jmrProfessionMapper;

    /**
     * 查询存储专业信息
     *
     * @param pId 存储专业信息ID
     * @return 存储专业信息
     */
    @Override
    public JmrProfession selectJmrProfessionById(Long pId) {
        return jmrProfessionMapper.selectJmrProfessionById(pId);
    }

    /**
     * 查询存储专业信息列表
     *
     * @param jmrProfession 存储专业信息
     * @return 存储专业信息
     */
    @Override
    public List<JmrProfession> selectJmrProfessionList(JmrProfession jmrProfession) {
        return jmrProfessionMapper.selectJmrProfessionList(jmrProfession);
    }

    /*
     * 查出所有专业小类信息
     * */
    @Override
    public List<JmrProfession> selectJmrProfessionListShort(JmrProfession jmrProfession) {
        return jmrProfessionMapper.selectJmrProfessionListShort(jmrProfession);
    }

    /**
     * 新增存储专业信息
     *
     * @param jmrProfession 存储专业信息
     * @return 结果
     */
    @Override
    public int insertJmrProfession(JmrProfession jmrProfession) {
        return jmrProfessionMapper.insertJmrProfession(jmrProfession);
    }

    /**
     * 修改存储专业信息
     *
     * @param jmrProfession 存储专业信息
     * @return 结果
     */
    @Override
    public int updateJmrProfession(JmrProfession jmrProfession) {
        return jmrProfessionMapper.updateJmrProfession(jmrProfession);
    }

    /**
     * 删除存储专业信息对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrProfessionByIds(String ids) {
        return jmrProfessionMapper.deleteJmrProfessionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储专业信息信息
     *
     * @param pId 存储专业信息ID
     * @return 结果
     */
    @Override
    public int deleteJmrProfessionById(Long pId) {
        return jmrProfessionMapper.deleteJmrProfessionById(pId);
    }
}
