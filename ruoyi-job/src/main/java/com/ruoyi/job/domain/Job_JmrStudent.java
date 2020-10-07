package com.ruoyi.job.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生信息查询对象 jmr_student
 * 
 * @author 李佳鹏
 * @date 2020-09-27
 */
public class Job_JmrStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生id */
    private Long sId;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String sName;

    /** 学生身份证号 */
    @Excel(name = "学生身份证号")
    private String sIdCard;

    /** 性别(0男 1女) */
    @Excel(name = "性别(0男 1女)")
    private Integer sSex;

    /** 出生年月 */
    @Excel(name = "出生年月")
    private String sBirthday;

    /** 毕业院校 */
    @Excel(name = "毕业院校")
    private String sCollege;

    /** 毕业院校层次(0:985 1:211 2一批本科 3 二批本科 4专科 5高职) */
    @Excel(name = "毕业院校层次(0:985 1:211 2一批本科 3 二批本科 4专科 5高职)")
    private Integer sCLevel;

    /** 专业 */
    @Excel(name = "专业")
    private Integer sProfession;
    private Job_JmrProfession jobJmrProfession;

    /** 学历(0博士 1硕士 2本科 3专科) */
    @Excel(name = "学历(0博士 1硕士 2本科 3专科)")
    private Integer sEHistory;

    /** 籍贯-省份 */
    @Excel(name = "籍贯-省份")
    private String sNProvince;

    /** 籍贯-地级市 */
    @Excel(name = "籍贯-地级市")
    private String sNCity;

    /** 外语水平(0英语四级 1英语6级 2日语二级 3日语三级 4无) */
    @Excel(name = "外语水平(0英语四级 1英语6级 2日语二级 3日语三级 4无)")
    private Integer sFLanguage;

    /** 期望薪资范围 */
    @Excel(name = "期望薪资范围")
    private Integer sSRange;


    /** 期望岗位 */
    @Excel(name = "期望岗位")
    private Long sEPosition;
    private Job_JmrPosition jobJmrPosition;
    /** 就业意向地 */
    @Excel(name = "就业意向地")
    private Integer sECity;

    /** 毕业时间 */
    @Excel(name = "毕业时间")
    private String sGTime;

    /** 电话 */
    @Excel(name = "电话")
    private String sTelephone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String sEmail;

    /** 成绩单附件地址 */
    @Excel(name = "成绩单附件地址")
    private String sSAttachment;

    /** 是否就业 */
    @Excel(name = "是否就业")
    private Integer sIfWork;

    /** 就业地-地级市 */
    @Excel(name = "就业地-地级市")
    private String sWCity;

    /** 就业的企业 */
    @Excel(name = "就业的企业")
    private String sCompany;

    public void setsId(Long sId) 
    {
        this.sId = sId;
    }

    public Long getsId() 
    {
        return sId;
    }
    public void setsName(String sName) 
    {
        this.sName = sName;
    }

    public String getsName() 
    {
        return sName;
    }
    public void setsIdCard(String sIdCard) 
    {
        this.sIdCard = sIdCard;
    }

    public String getsIdCard() 
    {
        return sIdCard;
    }
    public void setsSex(Integer sSex) 
    {
        this.sSex = sSex;
    }

    public Integer getsSex() 
    {
        return sSex;
    }
    public void setsBirthday(String sBirthday) 
    {
        this.sBirthday = sBirthday;
    }

    public String getsBirthday() 
    {
        return sBirthday;
    }
    public void setsCollege(String sCollege) 
    {
        this.sCollege = sCollege;
    }

    public String getsCollege() 
    {
        return sCollege;
    }
    public void setsCLevel(Integer sCLevel) 
    {
        this.sCLevel = sCLevel;
    }

    public Integer getsCLevel()
    {
        return sCLevel;
    }

    public Integer getsProfession() {
        return sProfession;
    }

    public void setsProfession(Integer sProfession) {
        this.sProfession = sProfession;
    }

    public Job_JmrProfession getJobJmrProfession() {
        return jobJmrProfession;
    }

    public void setJobJmrProfession(Job_JmrProfession jobJmrProfession) {
        this.jobJmrProfession = jobJmrProfession;
    }

    public void setsEHistory(Integer sEHistory)
    {
        this.sEHistory = sEHistory;
    }

    public Integer getsEHistory() 
    {
        return sEHistory;
    }
    public void setsNProvince(String sNProvince) 
    {
        this.sNProvince = sNProvince;
    }

    public String getsNProvince() 
    {
        return sNProvince;
    }
    public void setsNCity(String sNCity) 
    {
        this.sNCity = sNCity;
    }

    public String getsNCity() 
    {
        return sNCity;
    }
    public void setsFLanguage(Integer sFLanguage) 
    {
        this.sFLanguage = sFLanguage;
    }

    public Integer getsFLanguage() 
    {
        return sFLanguage;
    }
    public void setsSRange(Integer sSRange) 
    {
        this.sSRange = sSRange;
    }

    public Integer getsSRange() 
    {
        return sSRange;
    }



    public void setsEPosition(Long sEPosition)
    {
        this.sEPosition = sEPosition;
    }

    public Long getsEPosition() 
    {
        return sEPosition;
    }
    public Job_JmrPosition getJobJmrPosition() {
        return jobJmrPosition;
    }

    public void setJobJmrPosition(Job_JmrPosition jobJmrPosition) {
        this.jobJmrPosition = jobJmrPosition;
    }
    public void setsECity(Integer sECity) 
    {
        this.sECity = sECity;
    }

    public Integer getsECity() 
    {
        return sECity;
    }
    public void setsGTime(String sGTime) 
    {
        this.sGTime = sGTime;
    }

    public String getsGTime() 
    {
        return sGTime;
    }
    public void setsTelephone(String sTelephone) 
    {
        this.sTelephone = sTelephone;
    }

    public String getsTelephone() 
    {
        return sTelephone;
    }
    public void setsEmail(String sEmail) 
    {
        this.sEmail = sEmail;
    }

    public String getsEmail() 
    {
        return sEmail;
    }
    public void setsSAttachment(String sSAttachment) 
    {
        this.sSAttachment = sSAttachment;
    }

    public String getsSAttachment() 
    {
        return sSAttachment;
    }
    public void setsIfWork(Integer sIfWork) 
    {
        this.sIfWork = sIfWork;
    }

    public Integer getsIfWork() 
    {
        return sIfWork;
    }
    public void setsWCity(String sWCity) 
    {
        this.sWCity = sWCity;
    }

    public String getsWCity() 
    {
        return sWCity;
    }
    public void setsCompany(String sCompany) 
    {
        this.sCompany = sCompany;
    }

    public String getsCompany() 
    {
        return sCompany;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("sName", getsName())
            .append("sIdCard", getsIdCard())
            .append("sSex", getsSex())
            .append("sBirthday", getsBirthday())
            .append("sCollege", getsCollege())
            .append("sCLevel", getsCLevel())
            .append("sProfession", getJobJmrProfession())
            .append("sEHistory", getsEHistory())
            .append("sNProvince", getsNProvince())
            .append("sNCity", getsNCity())
            .append("sFLanguage", getsFLanguage())
            .append("sSRange", getsSRange())
            .append("sEPosition", getsEPosition())
            .append("sECity", getsECity())
            .append("sGTime", getsGTime())
            .append("sTelephone", getsTelephone())
            .append("sEmail", getsEmail())
            .append("sSAttachment", getsSAttachment())
            .append("sIfWork", getsIfWork())
            .append("sWCity", getsWCity())
            .append("sCompany", getsCompany())
            .toString();
    }
}
