package com.ruoyi.company.mapper;

import com.ruoyi.company.domain.Company_JmrProfession;

import java.util.List;
//专业信息dao层
public interface Company_JmrProfessionMapper {

    //查询专业信息列表
    public List<Company_JmrProfession> selectJmrProfessionList();
}
