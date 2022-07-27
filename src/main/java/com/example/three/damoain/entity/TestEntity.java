package com.example.three.damoain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestEntity {
    @Id
    @GeneratedValue
    private String claim_date;
    private String nm_cust;
    private String cd_cust;

    public String getClaim_date() {
        return claim_date;
    }

    public void setClaim_date(String claim_date) {
        this.claim_date = claim_date;
    }

    public String getNm_cust() {
        return nm_cust;
    }

    public void setNm_cust(String nm_cust) {
        this.nm_cust = nm_cust;
    }

    public String getCd_cust() {
        return cd_cust;
    }

    public void setCd_cust(String cd_cust) {
        this.cd_cust = cd_cust;
    }
}
