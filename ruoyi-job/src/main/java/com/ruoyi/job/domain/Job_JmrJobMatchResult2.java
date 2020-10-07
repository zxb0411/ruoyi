package com.ruoyi.job.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 匹配信息查询对象 jmr_job_match_result
 *
 * @author 李佳鹏
 * @date 2020-09-29
 */
public class Job_JmrJobMatchResult2 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 匹配岗位结果id */
    private Long jmrId;

    /** 学生id */
    @Excel(name = "学生id")
    private Long jmrSId;
    private String jmrSName;

    /** 企业id */
    @Excel(name = "企业id")
    private Long jmrCId;
    private String jmrCName;


    /** 岗位id */
    @Excel(name = "岗位id")
    private Long jmrJId;
    private String jmrJName;


    /** 匹配数值 */
    @Excel(name = "匹配数值")
    private Long jmrValue;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getJmrId() {
        return jmrId;
    }

    public void setJmrId(Long jmrId) {
        this.jmrId = jmrId;
    }

    public Long getJmrSId() {
        return jmrSId;
    }

    public void setJmrSId(Long jmrSId) {
        this.jmrSId = jmrSId;
    }

    public String getJmrSName() {
        return jmrSName;
    }

    public void setJmrSName(String jmrSName) {
        this.jmrSName = jmrSName;
    }

    public Long getJmrCId() {
        return jmrCId;
    }

    public void setJmrCId(Long jmrCId) {
        this.jmrCId = jmrCId;
    }

    public String getJmrCName() {
        return jmrCName;
    }

    public void setJmrCName(String jmrCName) {
        this.jmrCName = jmrCName;
    }

    public Long getJmrJId() {
        return jmrJId;
    }

    public void setJmrJId(Long jmrJId) {
        this.jmrJId = jmrJId;
    }

    public String getJmrJName() {
        return jmrJName;
    }

    public void setJmrJName(String jmrJName) {
        this.jmrJName = jmrJName;
    }

    public Long getJmrValue() {
        return jmrValue;
    }

    public void setJmrValue(Long jmrValue) {
        this.jmrValue = jmrValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("jmrId", getJmrId())
                .append("jmrSId", getJmrSId())
                .append("jmrCId", getJmrCId())
                .append("jmrJId", getJmrJId())
                .append("jmrValue", getJmrValue())
                .toString();
    }
}
