package com.ruoyi.student.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 存储匹配好的岗位信息（面向学生端）对象 jmr_job_match_result
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public class JmrJobMatchResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 匹配岗位结果id,主键 */
    private Long jmrId;

    /** 学生id 对应学生表（jmr_student）主键*/
    @Excel(name = "学生id")
    private Long jmrSId;

    //学生类用于存储学生姓名
    private JmrStudent jmrStudents;

    /** 企业id 对应企业表（jmr_company）id*/
    @Excel(name = "企业id")
    private Long jmrCId;

    //企业类用于存储企业名称
    private JmrCompany jmrCompanySave;

    /** 岗位id 对应岗位表（jmr_job）id*/
    @Excel(name = "岗位id")
    private Long jmrJId;

    //岗位类用于岗位名称
    private JmrPosition position;

    /** 匹配数据表（jmr_base）id */
    @Excel(name = "匹配数据表id")
    private Long jmrBId;

    /** 匹配数值 */
    @Excel(name = "匹配数值")
    private Long jmrValue;

    public void setJmrId(Long jmrId) 
    {
        this.jmrId = jmrId;
    }

    public Long getJmrId() 
    {
        return jmrId;
    }
    public void setJmrSId(Long jmrSId) 
    {
        this.jmrSId = jmrSId;
    }

    public Long getJmrSId() 
    {
        return jmrSId;
    }
    public void setJmrCId(Long jmrCId) 
    {
        this.jmrCId = jmrCId;
    }

    public Long getJmrCId() 
    {
        return jmrCId;
    }
    public void setJmrJId(Long jmrJId) 
    {
        this.jmrJId = jmrJId;
    }

    public Long getJmrJId() 
    {
        return jmrJId;
    }
    public void setJmrBId(Long jmrBId) 
    {
        this.jmrBId = jmrBId;
    }

    public Long getJmrBId() 
    {
        return jmrBId;
    }
    public void setJmrValue(Long jmrValue) 
    {
        this.jmrValue = jmrValue;
    }

    public Long getJmrValue() 
    {
        return jmrValue;
    }

    public JmrStudent getJmrStudents() {
        return jmrStudents;
    }

    public void setJmrStudents(JmrStudent jmrStudents) {
        this.jmrStudents = jmrStudents;
    }

    public JmrCompany getJmrCompanySave() {
        return jmrCompanySave;
    }

    public void setJmrCompanySave(JmrCompany jmrCompanySave) {
        this.jmrCompanySave = jmrCompanySave;
    }

    public JmrPosition getPosition() {
        return position;
    }

    public void setPosition(JmrPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("jmrId", getJmrId())
            .append("jmrSId", getJmrSId())
            .append("jmrCId", getJmrCId())
            .append("jmrJId", getJmrJId())
            .append("jmrBId", getJmrBId())
            .append("jmrValue", getJmrValue())
            .toString();
    }
}
