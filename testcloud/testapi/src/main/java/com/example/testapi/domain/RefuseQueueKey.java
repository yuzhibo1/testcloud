package com.example.testapi.domain;

public class RefuseQueueKey {
    private String orgCde;

    private String prdId;

    private String applCde;

    private String idTyp;

    private String idNo;

    public String getOrgCde() {
        return orgCde;
    }

    public void setOrgCde(String orgCde) {
        this.orgCde = orgCde == null ? null : orgCde.trim();
    }

    public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId == null ? null : prdId.trim();
    }

    public String getApplCde() {
        return applCde;
    }

    public void setApplCde(String applCde) {
        this.applCde = applCde == null ? null : applCde.trim();
    }

    public String getIdTyp() {
        return idTyp;
    }

    public void setIdTyp(String idTyp) {
        this.idTyp = idTyp == null ? null : idTyp.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }
}