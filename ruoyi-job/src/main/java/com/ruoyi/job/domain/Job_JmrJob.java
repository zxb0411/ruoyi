package com.ruoyi.job.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 岗位信息查询对象 jmr_job
 * 
 * @author 李佳鹏
 * @date 2020-09-28
 */
public class Job_JmrJob extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 岗位id */
    private Integer jId;

    /** 招聘岗位 */
    @Excel(name = "招聘岗位")
    private Integer jPoId;
    private Job_JmrPosition jobJmrPosition;

    /** 性别要求 */
    @Excel(name = "性别要求")
    private Integer jSex;

    /** 学历要求 */
    @Excel(name = "学历要求")
    private Integer jEHistory;

    /** 招聘院校层次 */
    @Excel(name = "招聘院校层次")
    private Integer jCLevel;

    /** 外语水平 */
    @Excel(name = "外语水平")
    private Integer jFLanguage;

    /** 专业要求 */
    @Excel(name = "专业要求")
    private Integer jPrId;
    private Job_JmrProfession jobJmrProfession;

    /** 薪资范围 */
    @Excel(name = "薪资范围")
    private Integer jSRange;

    /** 就业意向地 */
    @Excel(name = "就业意向地")
    private Integer jECity;

    /** 岗位要求 */
    @Excel(name = "岗位要求")
    private String jPRequire;

    /** 福利待遇 */
    @Excel(name = "福利待遇")
    private String jWelfare;

    /** 需求人数 */
    @Excel(name = "需求人数")
    private Long jNeedNumber;

    /** 备注 */
    @Excel(name = "备注")
    private String jRemark;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jBegin;

    /** 过期时间 */
    @Excel(name = "过期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jExpire;

    /** 企业id */
    @Excel(name = "企业id")
    private Integer jCId;

    public void setjId(Integer jId) 
    {
        this.jId = jId;
    }

    public Integer getjId() 
    {
        return jId;
    }
    public void setjPoId(Integer jPoId) 
    {
        this.jPoId = jPoId;
    }

    public Integer getjPoId() 
    {
        return jPoId;
    }

    public Job_JmrPosition getJobJmrPosition() {
        return jobJmrPosition;
    }

    public void setJobJmrPosition(Job_JmrPosition jobJmrPosition) {
        this.jobJmrPosition = jobJmrPosition;
    }

    public void setjSex(Integer jSex)
    {
        this.jSex = jSex;
    }

    public Integer getjSex() 
    {
        return jSex;
    }
    public void setjEHistory(Integer jEHistory) 
    {
        this.jEHistory = jEHistory;
    }

    public Integer getjEHistory() 
    {
        return jEHistory;
    }
    public void setjCLevel(Integer jCLevel) 
    {
        this.jCLevel = jCLevel;
    }

    public Integer getjCLevel() 
    {
        return jCLevel;
    }
    public void setjFLanguage(Integer jFLanguage) 
    {
        this.jFLanguage = jFLanguage;
    }

    public Integer getjFLanguage() 
    {
        return jFLanguage;
    }

    public Job_JmrProfession getJobJmrProfession() {
        return jobJmrProfession;
    }

    public void setJobJmrProfession(Job_JmrProfession jobJmrProfession) {
        this.jobJmrProfession = jobJmrProfession;
    }

    public void setjPrId(Integer jPrId)
    {
        this.jPrId = jPrId;
    }

    public Integer getjPrId() 
    {
        return jPrId;
    }
    public void setjSRange(Integer jSRange) 
    {
        this.jSRange = jSRange;
    }

    public Integer getjSRange() 
    {
        return jSRange;
    }
    public void setjECity(Integer jECity) 
    {
        this.jECity = jECity;
    }

    public Integer getjECity() 
    {
        return jECity;
    }
    public void setjPRequire(String jPRequire) 
    {
        this.jPRequire = jPRequire;
    }

    public String getjPRequire() 
    {
        return jPRequire;
    }
    public void setjWelfare(String jWelfare) 
    {
        this.jWelfare = jWelfare;
    }

    public String getjWelfare() 
    {
        return jWelfare;
    }
    public void setjNeedNumber(Long jNeedNumber) 
    {
        this.jNeedNumber = jNeedNumber;
    }

    public Long getjNeedNumber() 
    {
        return jNeedNumber;
    }
    public void setjRemark(String jRemark) 
    {
        this.jRemark = jRemark;
    }

    public String getjRemark() 
    {
        return jRemark;
    }
    public void setjBegin(Date jBegin) 
    {
        this.jBegin = jBegin;
    }

    public Date getjBegin() 
    {
        return jBegin;
    }
    public void setjExpire(Date jExpire) 
    {
        this.jExpire = jExpire;
    }

    public Date getjExpire() 
    {
        return jExpire;
    }
    public void setjCId(Integer jCId)
    {
        this.jCId = jCId;
    }

    public Integer getjCId()
    {
        return jCId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("jId", getjId())
            .append("jPoId", getjPoId())
            .append("jSex", getjSex())
            .append("jEHistory", getjEHistory())
            .append("jCLevel", getjCLevel())
            .append("jFLanguage", getjFLanguage())
            .append("jPrId", getjPrId())
            .append("jSRange", getjSRange())
            .append("jECity", getjECity())
            .append("jPRequire", getjPRequire())
            .append("jWelfare", getjWelfare())
            .append("jNeedNumber", getjNeedNumber())
            .append("jRemark", getjRemark())
            .append("jBegin", getjBegin())
            .append("jExpire", getjExpire())
            .append("jCId", getjCId())
            .toString();
    }
}
