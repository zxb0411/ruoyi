package com.ruoyi.statistic.service;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public Integer findStudentBySex(Integer a);

    public Integer findLevalBySchool(Integer b);

    public Integer findProfessionBySchool(Integer c);

    public Integer findLanguageByStudent(Integer d);

    public Integer findMoneyByStudent(Integer e);

    public Integer findWhereByStudent(Integer f);
}
