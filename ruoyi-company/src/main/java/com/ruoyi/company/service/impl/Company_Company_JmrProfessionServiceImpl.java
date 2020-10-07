package com.ruoyi.company.service.impl;

import com.ruoyi.company.domain.Company_JmrProfession;
import com.ruoyi.company.mapper.Company_JmrProfessionMapper;
import com.ruoyi.company.service.Company_JmrProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//专业信息服务层

@Service("JmrProfessionServiceImpl")
public class Company_Company_JmrProfessionServiceImpl implements Company_JmrProfessionService {
    @Autowired
    private Company_JmrProfessionMapper companyJmrProfessionMapper;

    @Override
    public List<Company_JmrProfession> selectJmrProfessionList() {
        return companyJmrProfessionMapper.selectJmrProfessionList();
    }
}
