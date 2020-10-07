package com.ruoyi.company.domain;

import com.ruoyi.common.core.domain.BaseEntity;
/*
 *  专业信息表
 */
public class Company_JmrProfession extends BaseEntity {


    private static final long serialVersionUID = 1L;
    private Long id;
    private String pmclass;
    private String psclass;

    public Company_JmrProfession() {
    }

    @Override
    public String toString() {
        return "JmrProfession{" +
                "id=" + id +
                ", pmclass='" + pmclass + '\'' +
                ", psclass='" + psclass + '\'' +
                '}';
    }

    public Company_JmrProfession(Long id, String pmclass, String psclass) {
        this.id = id;
        this.pmclass = pmclass;
        this.psclass = psclass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPmclass() {
        return pmclass;
    }

    public void setPmclass(String pmclass) {
        this.pmclass = pmclass;
    }

    public String getPsclass() {
        return psclass;
    }

    public void setPsclass(String psclass) {
        this.psclass = psclass;
    }
}
