package com.ruoyi.student.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 存储专业信息对象 jmr_profession
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public class JmrProfession extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 专业id */
    private Long pId;

    /** 专业大类 */
    @Excel(name = "专业大类")
    private String pMClass;

    /** 专业小类 */
    @Excel(name = "专业小类")
    private String pSClass;

    public void setpId(Long pId) 
    {
        this.pId = pId;
    }

    public Long getpId() 
    {
        return pId;
    }
    public void setpMClass(String pMClass) 
    {
        this.pMClass = pMClass;
    }

    public String getpMClass() 
    {
        return pMClass;
    }
    public void setpSClass(String pSClass) 
    {
        this.pSClass = pSClass;
    }

    public String getpSClass() 
    {
        return pSClass;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pId", getpId())
            .append("pMClass", getpMClass())
            .append("pSClass", getpSClass())
            .toString();
    }
}
