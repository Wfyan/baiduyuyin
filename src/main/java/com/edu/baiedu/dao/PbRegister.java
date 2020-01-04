package com.edu.baiedu.dao;

import java.util.Date;

public class PbRegister {
    private String reguuid;

    private String useruuid;

    private String regsex;

    private Integer regage;

    private String regemial;

    private String regphoto;

    private Date regtime;

    public String getReguuid() {
        return reguuid;
    }

    public void setReguuid(String reguuid) {
        this.reguuid = reguuid == null ? null : reguuid.trim();
    }

    public String getUseruuid() {
        return useruuid;
    }

    public void setUseruuid(String useruuid) {
        this.useruuid = useruuid == null ? null : useruuid.trim();
    }

    public String getRegsex() {
        return regsex;
    }

    public void setRegsex(String regsex) {
        this.regsex = regsex == null ? null : regsex.trim();
    }

    public Integer getRegage() {
        return regage;
    }

    public void setRegage(Integer regage) {
        this.regage = regage;
    }

    public String getRegemial() {
        return regemial;
    }

    public void setRegemial(String regemial) {
        this.regemial = regemial == null ? null : regemial.trim();
    }

    public String getRegphoto() {
        return regphoto;
    }

    public void setRegphoto(String regphoto) {
        this.regphoto = regphoto == null ? null : regphoto.trim();
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }
}