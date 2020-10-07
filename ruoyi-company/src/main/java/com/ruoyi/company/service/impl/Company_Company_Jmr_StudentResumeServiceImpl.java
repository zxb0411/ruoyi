package com.ruoyi.company.service.impl;

import com.ruoyi.company.domain.Company__Jmr_StudentResume;
import com.ruoyi.company.mapper.Company_Jmr_StudentResumeMapper;
import com.ruoyi.company.service.Company_Jmr_StudentResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Company_Company_Jmr_StudentResumeServiceImpl implements Company_Jmr_StudentResumeService {
    @Autowired
    private Company_Jmr_StudentResumeMapper studentResumeMapper;

    @Override
    public List<Company__Jmr_StudentResume> findList(Company__Jmr_StudentResume companyJmr_studentResume) {
        return studentResumeMapper.findList(companyJmr_studentResume);
    }
}
