package com.ruoyi.company.mapper;

import java.util.List;
import com.ruoyi.company.domain.Company_JmrStudentMatchResult;

/**
 * 存储匹配好的岗位信息（面向学生端)Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface Company_JmrStudentMatchResultMapper
{
    /**
     * 查询存储匹配好的岗位信息（面向学生端)
     * 
     * @param smrId 存储匹配好的岗位信息（面向学生端)ID
     * @return 存储匹配好的岗位信息（面向学生端)
     */
    public Company_JmrStudentMatchResult selectJmrStudentMatchResultById(Long smrId);

    /**
     * 查询存储匹配好的岗位信息（面向学生端)列表
     * 
     * @param companyJmrStudentMatchResult 存储匹配好的岗位信息（面向学生端)
     * @return 存储匹配好的岗位信息（面向学生端)集合
     */
    public List<Company_JmrStudentMatchResult> selectJmrStudentMatchResultList(Company_JmrStudentMatchResult companyJmrStudentMatchResult);

    /**
     * 新增存储匹配好的岗位信息（面向学生端)
     * 
     * @param companyJmrStudentMatchResult 存储匹配好的岗位信息（面向学生端)
     * @return 结果
     */
    public int insertJmrStudentMatchResult(Company_JmrStudentMatchResult companyJmrStudentMatchResult);

    /**
     * 修改存储匹配好的岗位信息（面向学生端)
     * 
     * @param companyJmrStudentMatchResult 存储匹配好的岗位信息（面向学生端)
     * @return 结果
     */
    public int updateJmrStudentMatchResult(Company_JmrStudentMatchResult companyJmrStudentMatchResult);

    /**
     * 删除存储匹配好的岗位信息（面向学生端)
     * 
     * @param smrId 存储匹配好的岗位信息（面向学生端)ID
     * @return 结果
     */
    public int deleteJmrStudentMatchResultById(Long smrId);

    /**
     * 批量删除存储匹配好的岗位信息（面向学生端)
     * 
     * @param smrIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrStudentMatchResultByIds(String[] smrIds);
}
