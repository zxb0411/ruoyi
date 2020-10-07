package com.ruoyi.student.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 存储学生保持的简历信息对象 jmr_resume
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public class JmrResume extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 简历id */
    private Long rId;

    /** 主修课程 */
    @Excel(name = "主修课程")
    private String rMCourse;

    /** 掌握技能 */
    @Excel(name = "掌握技能")
    private String rSkill;

    /** 专业技能证书 */
    @Excel(name = "专业技能证书")
    private String rSCertificate;

    /** 获得荣誉/奖项 */
    @Excel(name = "获得荣誉/奖项")
    private String rHonor;

    /** 实习（工作）经历 */
    @Excel(name = "实习", readConverterExp = "工=作")
    private String rCareer;

    /** 项目经验 */
    @Excel(name = "项目经验")
    private String rPExperience;

    /** 自我评价 */
    @Excel(name = "自我评价")
    private String rSEvaluate;

    /** 备注 */
    @Excel(name = "备注")
    private String rRemark;

    /** 学生id */
    @Excel(name = "学生id")
    private Long rSId;

    //学生类对应学生姓名
    private JmrStudent student;

    public JmrStudent getStudent() {
        return student;
    }

    public void setStudent(JmrStudent student) {
        this.student = student;
    }

    public void setrId(Long rId)
    {
        this.rId = rId;
    }

    public Long getrId() 
    {
        return rId;
    }
    public void setrMCourse(String rMCourse) 
    {
        this.rMCourse = rMCourse;
    }

    public String getrMCourse() 
    {
        return rMCourse;
    }
    public void setrSkill(String rSkill) 
    {
        this.rSkill = rSkill;
    }

    public String getrSkill() 
    {
        return rSkill;
    }
    public void setrSCertificate(String rSCertificate) 
    {
        this.rSCertificate = rSCertificate;
    }

    public String getrSCertificate() 
    {
        return rSCertificate;
    }
    public void setrHonor(String rHonor) 
    {
        this.rHonor = rHonor;
    }

    public String getrHonor() 
    {
        return rHonor;
    }
    public void setrCareer(String rCareer) 
    {
        this.rCareer = rCareer;
    }

    public String getrCareer() 
    {
        return rCareer;
    }
    public void setrPExperience(String rPExperience) 
    {
        this.rPExperience = rPExperience;
    }

    public String getrPExperience() 
    {
        return rPExperience;
    }
    public void setrSEvaluate(String rSEvaluate) 
    {
        this.rSEvaluate = rSEvaluate;
    }

    public String getrSEvaluate() 
    {
        return rSEvaluate;
    }
    public void setrRemark(String rRemark) 
    {
        this.rRemark = rRemark;
    }

    public String getrRemark() 
    {
        return rRemark;
    }
    public void setrSId(Long rSId) 
    {
        this.rSId = rSId;
    }

    public Long getrSId() 
    {
        return rSId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rId", getrId())
            .append("rMCourse", getrMCourse())
            .append("rSkill", getrSkill())
            .append("rSCertificate", getrSCertificate())
            .append("rHonor", getrHonor())
            .append("rCareer", getrCareer())
            .append("rPExperience", getrPExperience())
            .append("rSEvaluate", getrSEvaluate())
            .append("rRemark", getrRemark())
            .append("rSId", getrSId())
            .toString();
    }
}
