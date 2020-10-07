package com.ruoyi.student.domain;

import com.ruoyi.common.core.domain.BaseEntity;

//岗位表jmr_job
public class JmrJob extends BaseEntity {
    private static final long serialVersionUID = 1L;

    //岗位id主键
    private int jId;

    //招聘岗位
    private int jPoId;

    //性别要求
    private int jSex;

    //学历要求
    private int jEHistory;

    //招聘学校层次
    private int jCLevel;

    //外语水平
    private int jFLanguage;

    //专业要求
    private int jPrId;

    //薪资范围
    private int jSRange;

    //就业意向地
    private int jECity;

    //企业id
    private int jCId;

    //企业外键
    private JmrCompany company;

    public JmrCompany getCompany() {
        return company;
    }

    public void setCompany(JmrCompany company) {
        this.company = company;
    }

    public int getjCId() {
        return jCId;
    }

    public void setjCId(int jCId) {
        this.jCId = jCId;
    }

    public int getjId() {
        return jId;
    }

    public void setjId(int jId) {
        this.jId = jId;
    }

    public int getjPoId() {
        return jPoId;
    }

    public void setjPoId(int jPoId) {
        this.jPoId = jPoId;
    }

    public int getjSex() {
        return jSex;
    }

    public void setjSex(int jSex) {
        this.jSex = jSex;
    }

    public int getjEHistory() {
        return jEHistory;
    }

    public void setjEHistory(int jEHistory) {
        this.jEHistory = jEHistory;
    }

    public int getjCLevel() {
        return jCLevel;
    }

    public void setjCLevel(int jCLevel) {
        this.jCLevel = jCLevel;
    }

    public int getjFLanguage() {
        return jFLanguage;
    }

    public void setjFLanguage(int jFLanguage) {
        this.jFLanguage = jFLanguage;
    }

    public int getjPrId() {
        return jPrId;
    }

    public void setjPrId(int jPrId) {
        this.jPrId = jPrId;
    }

    public int getjSRange() {
        return jSRange;
    }

    public void setjSRange(int jSRange) {
        this.jSRange = jSRange;
    }

    public int getjECity() {
        return jECity;
    }

    public void setjECity(int jECity) {
        this.jECity = jECity;
    }

    @Override
    public String toString() {
        return "CompanyJob{" +
                "jId=" + jId +
                ", jPoId=" + jPoId +
                ", jSex=" + jSex +
                ", jEHistory=" + jEHistory +
                ", jCLevel=" + jCLevel +
                ", jFLanguage=" + jFLanguage +
                ", jPrId=" + jPrId +
                ", jSRange=" + jSRange +
                ", jECity=" + jECity +
                '}';
    }
}
