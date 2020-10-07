package com.ruoyi.job.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 企业信息查询对象 jmr_company
 * 
 * @author gaofeng
 * @date 2020-09-27
 */
public class Job_JmrCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 企业id */
    private Long cId;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String cName;

    /** 企业密码 */
    @Excel(name = "企业密码")
    private String cPassword;

    /** 统一社会信用代码 */
    @Excel(name = "统一社会信用代码")
    private String cSCode;

    /** 企业简介 */
    @Excel(name = "企业简介")
    private String cDescription;

    /** 联系人 */
    @Excel(name = "联系人")
    private String cContact;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String cTelephone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String cEmail;

    public void setcId(Long cId) 
    {
        this.cId = cId;
    }

    public Long getcId() 
    {
        return cId;
    }
    public void setcName(String cName) 
    {
        this.cName = cName;
    }

    public String getcName() 
    {
        return cName;
    }
    public void setcPassword(String cPassword) 
    {
        this.cPassword = cPassword;
    }

    public String getcPassword() 
    {
        return cPassword;
    }
    public void setcSCode(String cSCode) 
    {
        this.cSCode = cSCode;
    }

    public String getcSCode() 
    {
        return cSCode;
    }
    public void setcDescription(String cDescription) 
    {
        this.cDescription = cDescription;
    }

    public String getcDescription() 
    {
        return cDescription;
    }
    public void setcContact(String cContact) 
    {
        this.cContact = cContact;
    }

    public String getcContact() 
    {
        return cContact;
    }
    public void setcTelephone(String cTelephone) 
    {
        this.cTelephone = cTelephone;
    }

    public String getcTelephone() 
    {
        return cTelephone;
    }
    public void setcEmail(String cEmail) 
    {
        this.cEmail = cEmail;
    }

    public String getcEmail() 
    {
        return cEmail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cId", getcId())
            .append("cName", getcName())
            .append("cPassword", getcPassword())
            .append("cSCode", getcSCode())
            .append("cDescription", getcDescription())
            .append("cContact", getcContact())
            .append("cTelephone", getcTelephone())
            .append("cEmail", getcEmail())
            .toString();
    }
}
