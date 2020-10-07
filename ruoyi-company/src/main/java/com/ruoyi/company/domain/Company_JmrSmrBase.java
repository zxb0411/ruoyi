package com.ruoyi.company.domain;

public class Company_JmrSmrBase {

    private Integer smr_b_id;
    private Integer smr_sex_value;//性别匹配值
    private Integer smr_level_value;//学校层次匹配值
    private Integer smr_profession_value;//专业匹配值
    private Integer smr_history_value;//学历匹配值
    private Integer smr_language_value;//外语水平匹配值
    private Integer smr_range_value;//期望薪资范围匹配值
    private Integer smr_position_value;//期望岗位匹配值
    private Integer jmr_city_value;//就业意向地匹配值

    @Override
    public String toString() {
        return "JmrStudentMatchResult{" +
                "smr_b_id=" + smr_b_id +
                ", smr_sex_value=" + smr_sex_value +
                ", smr_level_value=" + smr_level_value +
                ", smr_profession_value=" + smr_profession_value +
                ", smr_history_value=" + smr_history_value +
                ", smr_language_value=" + smr_language_value +
                ", smr_range_value=" + smr_range_value +
                ", smr_position_value=" + smr_position_value +
                ", jmr_city_value=" + jmr_city_value +
                '}';
    }

    public Company_JmrSmrBase() {
    }

    public Integer getSmr_b_id() {
        return smr_b_id;
    }

    public void setSmr_b_id(Integer smr_b_id) {
        this.smr_b_id = smr_b_id;
    }

    public Integer getSmr_sex_value() {
        return smr_sex_value;
    }

    public void setSmr_sex_value(Integer smr_sex_value) {
        this.smr_sex_value = smr_sex_value;
    }

    public Integer getSmr_level_value() {
        return smr_level_value;
    }

    public void setSmr_level_value(Integer smr_level_value) {
        this.smr_level_value = smr_level_value;
    }

    public Integer getSmr_profession_value() {
        return smr_profession_value;
    }

    public void setSmr_profession_value(Integer smr_profession_value) {
        this.smr_profession_value = smr_profession_value;
    }

    public Integer getSmr_history_value() {
        return smr_history_value;
    }

    public void setSmr_history_value(Integer smr_history_value) {
        this.smr_history_value = smr_history_value;
    }

    public Integer getSmr_language_value() {
        return smr_language_value;
    }

    public void setSmr_language_value(Integer smr_language_value) {
        this.smr_language_value = smr_language_value;
    }

    public Integer getSmr_range_value() {
        return smr_range_value;
    }

    public void setSmr_range_value(Integer smr_range_value) {
        this.smr_range_value = smr_range_value;
    }

    public Integer getSmr_position_value() {
        return smr_position_value;
    }

    public void setSmr_position_value(Integer smr_position_value) {
        this.smr_position_value = smr_position_value;
    }

    public Integer getJmr_city_value() {
        return jmr_city_value;
    }

    public void setJmr_city_value(Integer jmr_city_value) {
        this.jmr_city_value = jmr_city_value;
    }

    public Company_JmrSmrBase(Integer smr_b_id, Integer smr_sex_value, Integer smr_level_value, Integer smr_profession_value, Integer smr_history_value, Integer smr_language_value, Integer smr_range_value, Integer smr_position_value, Integer jmr_city_value) {
        this.smr_b_id = smr_b_id;
        this.smr_sex_value = smr_sex_value;
        this.smr_level_value = smr_level_value;
        this.smr_profession_value = smr_profession_value;
        this.smr_history_value = smr_history_value;
        this.smr_language_value = smr_language_value;
        this.smr_range_value = smr_range_value;
        this.smr_position_value = smr_position_value;
        this.jmr_city_value = jmr_city_value;
    }
}
