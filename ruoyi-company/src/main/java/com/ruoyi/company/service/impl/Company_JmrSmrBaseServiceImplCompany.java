package com.ruoyi.company.service.impl;

import com.ruoyi.company.domain.Company_JmrSmrBase;
import com.ruoyi.company.mapper.Company_JmrSmrBaseMapper;
import com.ruoyi.company.service.Company_IJmrSmrBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Company_JmrSmrBaseServiceImplCompany implements Company_IJmrSmrBaseService {

    @Autowired
    private Company_JmrSmrBaseMapper studentMatchResultMapper;

    //存储匹配值信息
    public void save(Company_JmrSmrBase studentMatchResult){
        studentMatchResultMapper.save(studentMatchResult);
    }
}
