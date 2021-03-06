package com.xindaibao.cashloan.cl.model.kenya;

import java.util.Date;

public class LoanReimbursement {
    private Long id;

    private String indentNo;

    private double rtnAmount;

    private String rtnCode;

    private String rtnMsg;

    private String rtnOrderNo;

    private Byte status;

    private Date createdTime;

    private Date updatedTime;

    private String type;

    public String getType() {
        return type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndentNo() {
        return indentNo;
    }

    public void setIndentNo(String indentNo) {
        this.indentNo = indentNo;
    }

    public double getRtnAmount() {
        return rtnAmount;
    }

    public void setRtnAmount(double rtnAmount) {
        this.rtnAmount = rtnAmount;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    public String getRtnOrderNo() {
        return rtnOrderNo;
    }

    public void setRtnOrderNo(String rtnOrderNo) {
        this.rtnOrderNo = rtnOrderNo;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public void setType(String type) {
        this.type = type;
    }
}