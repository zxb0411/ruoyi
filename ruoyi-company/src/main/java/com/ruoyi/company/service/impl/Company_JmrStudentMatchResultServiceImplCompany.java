package com.ruoyi.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.company.mapper.Company_JmrStudentMatchResultMapper;
import com.ruoyi.company.domain.Company_JmrStudentMatchResult;
import com.ruoyi.company.service.Company_IJmrStudentMatchResultService;
import com.ruoyi.common.core.text.Convert;

/**
 * 存储匹配好的岗位信息（面向学生端)Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class Company_JmrStudentMatchResultServiceImplCompany implements Company_IJmrStudentMatchResultService
{
    @Autowired
    private Company_JmrStudentMatchResultMapper companyJmrStudentMatchResultMapper;

    /**
     * 查询存储匹配好的岗位信息（面向学生端)
     * 
     * @param smrId 存储匹配好的岗位信息（面向学生端)ID
     * @return 存储匹配好的岗位信息（面向学生端)
     */
    @Override
    public Company_JmrStudentMatchResult selectJmrStudentMatchResultById(Long smrId)
    {
        return companyJmrStudentMatchResultMapper.selectJmrStudentMatchResultById(smrId);
    }

    /**
     * 查询存储匹配好的岗位信息（面向学生端)列表
     * 
     * @param companyJmrStudentMatchResult 存储匹配好的岗位信息（面向学生端)
     * @return 存储匹配好的岗位信息（面向学生端)
     */
    @Override
    public List<Company_JmrStudentMatchResult> selectJmrStudentMatchResultList(Company_JmrStudentMatchResult companyJmrStudentMatchResult)
    {
        return companyJmrStudentMatchResultMapper.selectJmrStudentMatchResultList(companyJmrStudentMatchResult);
    }

    /**
     * 新增存储匹配好的岗位信息（面向学生端)
     * 
     * @param companyJmrStudentMatchResult 存储匹配好的岗位信息（面向学生端)
     * @return 结果
     */
    @Override
    public int insertJmrStudentMatchResult(Company_JmrStudentMatchResult companyJmrStudentMatchResult)
    {
        return companyJmrStudentMatchResultMapper.insertJmrStudentMatchResult(companyJmrStudentMatchResult);
    }

    /**
     * 修改存储匹配好的岗位信息（面向学生端)
     * 
     * @param companyJmrStudentMatchResult 存储匹配好的岗位信息（面向学生端)
     * @return 结果
     */
    @Override
    public int updateJmrStudentMatchResult(Company_JmrStudentMatchResult companyJmrStudentMatchResult)
    {
        return companyJmrStudentMatchResultMapper.updateJmrStudentMatchResult(companyJmrStudentMatchResult);
    }

    /**
     * 删除存储匹配好的岗位信息（面向学生端)对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrStudentMatchResultByIds(String ids)
    {
        return companyJmrStudentMatchResultMapper.deleteJmrStudentMatchResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储匹配好的岗位信息（面向学生端)信息
     * 
     * @param smrId 存储匹配好的岗位信息（面向学生端)ID
     * @return 结果
     */
    @Override
    public int deleteJmrStudentMatchResultById(Long smrId)
    {
        return companyJmrStudentMatchResultMapper.deleteJmrStudentMatchResultById(smrId);
    }
}
