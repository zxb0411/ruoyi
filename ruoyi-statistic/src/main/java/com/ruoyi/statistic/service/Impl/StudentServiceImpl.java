package com.ruoyi.statistic.service.Impl;

import com.ruoyi.statistic.mapper.StudentMapper;
import com.ruoyi.statistic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired(required = false)

    public StudentMapper studentMapper;

    public Integer findStudentBySex(Integer a) {
        return this.studentMapper.findStudentSex(a);
    }

    public Integer findLevalBySchool(Integer b) {
        return this.studentMapper.findLevalSchool(b);
    }

    public Integer findProfessionBySchool(Integer c) {
        return this.studentMapper.findProfession(c);
    }

    public Integer findLanguageByStudent(Integer d) {
        return this.studentMapper.findLanguage(d);
    }

    public Integer findMoneyByStudent(Integer e) {
        return this.studentMapper.findMoney(e);
    }

    public Integer findWhereByStudent(Integer f) {
        return this.studentMapper.findWhere(f);
    }
}
