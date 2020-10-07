package com.ruoyi.student.domain;

import com.ruoyi.common.core.domain.BaseEntity;

//岗位简略信息表
public class JmrCompany extends BaseEntity {
    private static final long serialVersionUID = 1L;
    //主键id
    private int cId;

    //企业名称
    private String cName;

    //企业社会信用代码
    private String cSCode;

    //企业简介
    private String cDescription;

    //联系人
    private String cContact;

    //联系人电话
    private String cTelephone;

    //邮箱
    private String cEmail;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcSCode() {
        return cSCode;
    }

    public void setcSCode(String cSCode) {
        this.cSCode = cSCode;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public String getcContact() {
        return cContact;
    }

    public void setcContact(String cContact) {
        this.cContact = cContact;
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    @Override
    public String toString() {
        return "jmrCompany{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cSCode='" + cSCode + '\'' +
                ", cDescription='" + cDescription + '\'' +
                ", cContact='" + cContact + '\'' +
                ", cTelephone='" + cTelephone + '\'' +
                ", cEmail='" + cEmail + '\'' +
                '}';
    }
}
