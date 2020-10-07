package com.ruoyi.statistic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 存储匹配好的岗位信息（面向学生端）的依赖数据对象 jmr_base
 * 
 * @author
 * @date 2020-09-29
 */
public class JmrBase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 匹配结果数据的id */
    private Long jmrBId;

    /** 性别匹配值 */
    @Excel(name = "性别匹配值")
    private Long jmrSexValue;

    /** 学校层次匹配值 */
    @Excel(name = "学校层次匹配值")
    private Long jmrLevelValue;

    /** 专业匹配值 */
    @Excel(name = "专业匹配值")
    private Long jmrProfessionValue;

    /** 学历匹配值 */
    @Excel(name = "学历匹配值")
    private Long jmrHistoryValue;

    /** 外语水平匹配值 */
    @Excel(name = "外语水平匹配值")
    private Long jmrLanguageValue;

    /** 期望薪资范围匹配值 */
    @Excel(name = "期望薪资范围匹配值")
    private Long jmrRangeValue;

    /** 期望岗位匹配值 */
    @Excel(name = "期望岗位匹配值")
    private Long jmrPositionValue;

    /** 就业意向地匹配值 */
    @Excel(name = "就业意向地匹配值")
    private Long jmrCityValue;

    public void setJmrBId(Long jmrBId) 
    {
        this.jmrBId = jmrBId;
    }

    public Long getJmrBId() 
    {
        return jmrBId;
    }
    public void setJmrSexValue(Long jmrSexValue) 
    {
        this.jmrSexValue = jmrSexValue;
    }

    public Long getJmrSexValue() 
    {
        return jmrSexValue;
    }
    public void setJmrLevelValue(Long jmrLevelValue) 
    {
        this.jmrLevelValue = jmrLevelValue;
    }

    public Long getJmrLevelValue() 
    {
        return jmrLevelValue;
    }
    public void setJmrProfessionValue(Long jmrProfessionValue) 
    {
        this.jmrProfessionValue = jmrProfessionValue;
    }

    public Long getJmrProfessionValue() 
    {
        return jmrProfessionValue;
    }
    public void setJmrHistoryValue(Long jmrHistoryValue) 
    {
        this.jmrHistoryValue = jmrHistoryValue;
    }

    public Long getJmrHistoryValue() 
    {
        return jmrHistoryValue;
    }
    public void setJmrLanguageValue(Long jmrLanguageValue) 
    {
        this.jmrLanguageValue = jmrLanguageValue;
    }

    public Long getJmrLanguageValue() 
    {
        return jmrLanguageValue;
    }
    public void setJmrRangeValue(Long jmrRangeValue) 
    {
        this.jmrRangeValue = jmrRangeValue;
    }

    public Long getJmrRangeValue() 
    {
        return jmrRangeValue;
    }
    public void setJmrPositionValue(Long jmrPositionValue) 
    {
        this.jmrPositionValue = jmrPositionValue;
    }

    public Long getJmrPositionValue() 
    {
        return jmrPositionValue;
    }
    public void setJmrCityValue(Long jmrCityValue) 
    {
        this.jmrCityValue = jmrCityValue;
    }

    public Long getJmrCityValue() 
    {
        return jmrCityValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("jmrBId", getJmrBId())
            .append("jmrSexValue", getJmrSexValue())
            .append("jmrLevelValue", getJmrLevelValue())
            .append("jmrProfessionValue", getJmrProfessionValue())
            .append("jmrHistoryValue", getJmrHistoryValue())
            .append("jmrLanguageValue", getJmrLanguageValue())
            .append("jmrRangeValue", getJmrRangeValue())
            .append("jmrPositionValue", getJmrPositionValue())
            .append("jmrCityValue", getJmrCityValue())
            .toString();
    }
}
