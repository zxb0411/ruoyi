package com.ruoyi.company.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 存储匹配好的岗位信息（面向学生端)对象 jmr_student_match_result
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public class Company_JmrStudentMatchResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 简历匹配结果id */
    private Integer smrId;

    /** 企业id */
    @Excel(name = "企业id")
    private Integer smrCId;

    /** 岗位id */
    @Excel(name = "岗位id")
    private Integer smrJId;

    /** 学生id */
    @Excel(name = "学生id")
    private Integer smrSId;

    /** 简历id */
    @Excel(name = "简历id")
    private Integer smrRId;

    /** 匹配数据表id */
    @Excel(name = "匹配数据表id")
    private Integer smrBId;

    /** 匹配数值 */
    @Excel(name = "匹配数值")
    private Integer smrValue;

    private Company_JmrStudent jmr_student;

    public Company_JmrStudent getJmr_student() {
        return jmr_student;
    }

    public void setJmr_student(Company_JmrStudent jmr_student) {
        this.jmr_student = jmr_student;
    }

    @Override
    public String toString() {
        return "JmrStudentMatchResult{" +
                "smrId=" + smrId +
                ", smrCId=" + smrCId +
                ", smrJId=" + smrJId +
                ", smrSId=" + smrSId +
                ", smrRId=" + smrRId +
                ", smrBId=" + smrBId +
                ", smrValue=" + smrValue +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSmrId() {
        return smrId;
    }

    public void setSmrId(Integer smrId) {
        this.smrId = smrId;
    }

    public Integer getSmrCId() {
        return smrCId;
    }

    public void setSmrCId(Integer smrCId) {
        this.smrCId = smrCId;
    }

    public Integer getSmrJId() {
        return smrJId;
    }

    public void setSmrJId(Integer smrJId) {
        this.smrJId = smrJId;
    }

    public Integer getSmrSId() {
        return smrSId;
    }

    public void setSmrSId(Integer smrSId) {
        this.smrSId = smrSId;
    }

    public Integer getSmrRId() {
        return smrRId;
    }

    public void setSmrRId(Integer smrRId) {
        this.smrRId = smrRId;
    }

    public Integer getSmrBId() {
        return smrBId;
    }

    public void setSmrBId(Integer smrBId) {
        this.smrBId = smrBId;
    }

    public Integer getSmrValue() {
        return smrValue;
    }

    public void setSmrValue(Integer smrValue) {
        this.smrValue = smrValue;
    }

    public Company_JmrStudentMatchResult() {
    }

    public Company_JmrStudentMatchResult(Integer smrId, Integer smrCId, Integer smrJId, Integer smrSId, Integer smrRId, Integer smrBId, Integer smrValue) {
        this.smrId = smrId;
        this.smrCId = smrCId;
        this.smrJId = smrJId;
        this.smrSId = smrSId;
        this.smrRId = smrRId;
        this.smrBId = smrBId;
        this.smrValue = smrValue;
    }
}
