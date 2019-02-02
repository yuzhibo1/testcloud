package com.example.testapi.domain;

public class RefuseQueue extends RefuseQueueKey {
    private String custName;

    private String applDt;

    private String refuseDt;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getApplDt() {
        return applDt;
    }

    public void setApplDt(String applDt) {
        this.applDt = applDt == null ? null : applDt.trim();
    }

    public String getRefuseDt() {
        return refuseDt;
    }

    public void setRefuseDt(String refuseDt) {
        this.refuseDt = refuseDt == null ? null : refuseDt.trim();
    }
}