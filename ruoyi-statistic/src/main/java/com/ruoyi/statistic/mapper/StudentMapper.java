package com.ruoyi.statistic.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    Integer findStudentSex(Integer a);

    Integer findLevalSchool(Integer b);

    Integer findProfession(Integer c);

    Integer findLanguage(Integer d);

    Integer findMoney(Integer e);

    Integer findWhere(Integer f);

}
