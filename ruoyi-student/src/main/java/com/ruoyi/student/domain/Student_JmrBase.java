package com.ruoyi.student.domain;

import com.ruoyi.common.core.domain.BaseEntity;

public class Student_JmrBase extends BaseEntity {
    //匹配信息表jmr_base全是0，1值
    private static final long serialVersionUID = 1L;

    //匹配结果数据id主键
    private int jmrBId;
    //性别匹配值
    private int jmrSexValue;
    //学校层次匹配值
    private int jmrLevelValue;
    //专业匹配值
    private int jmrProfessionValue;
    //学历匹配值
    private int jmrHistoryValue;
    //外语水平匹配值
    private int jmrLanguageValue;
    //期望薪资范围匹配值
    private int jmrRangeValue;
    //期望岗位匹配值
    private int jmrPositionValue;
    //就业意向地匹配值
    private int jmrCityValue;


    public int getJmrBId() {
        return jmrBId;
    }

    public void setJmrBId(int jmrBId) {
        this.jmrBId = jmrBId;
    }

    public int getJmrSexValue() {
        return jmrSexValue;
    }

    public void setJmrSexValue(int jmrSexValue) {
        this.jmrSexValue = jmrSexValue;
    }

    public int getJmrLevelValue() {
        return jmrLevelValue;
    }

    public void setJmrLevelValue(int jmrLevelValue) {
        this.jmrLevelValue = jmrLevelValue;
    }

    public int getJmrProfessionValue() {
        return jmrProfessionValue;
    }

    public void setJmrProfessionValue(int jmrProfessionValue) {
        this.jmrProfessionValue = jmrProfessionValue;
    }

    public int getJmrHistoryValue() {
        return jmrHistoryValue;
    }

    public void setJmrHistoryValue(int jmrHistoryValue) {
        this.jmrHistoryValue = jmrHistoryValue;
    }

    public int getJmrLanguageValue() {
        return jmrLanguageValue;
    }

    public void setJmrLanguageValue(int jmrLanguageValue) {
        this.jmrLanguageValue = jmrLanguageValue;
    }

    public int getJmrRangeValue() {
        return jmrRangeValue;
    }

    public void setJmrRangeValue(int jmrRangeValue) {
        this.jmrRangeValue = jmrRangeValue;
    }

    public int getJmrPositionValue() {
        return jmrPositionValue;
    }

    public void setJmrPositionValue(int jmrPositionValue) {
        this.jmrPositionValue = jmrPositionValue;
    }

    public int getJmrCityValue() {
        return jmrCityValue;
    }

    public void setJmrCityValue(int jmrCityValue) {
        this.jmrCityValue = jmrCityValue;
    }
    @Override
    public String toString() {
        return "JmrBase{" +
                "jmrBId=" + jmrBId +
                ", jmrSexValue=" + jmrSexValue +
                ", jmrLevelValue=" + jmrLevelValue +
                ", jmrProfessionValue=" + jmrProfessionValue +
                ", jmrHistoryValue=" + jmrHistoryValue +
                ", jmrLanguageValue=" + jmrLanguageValue +
                ", jmrRangeValue=" + jmrRangeValue +
                ", jmrPositionValue=" + jmrPositionValue +
                ", jmrCityValue=" + jmrCityValue +
                '}';
    }
}
