package com.edu.baiedu.dao;

public class PbAudio {
    private String ausetuuid;

    private String useruuid;

    private Integer ausetspd;

    private Integer ausetpit;

    private Integer ausetvol;

    private Integer ausetvoiper;

    public String getAusetuuid() {
        return ausetuuid;
    }

    public void setAusetuuid(String ausetuuid) {
        this.ausetuuid = ausetuuid == null ? null : ausetuuid.trim();
    }

    public String getUseruuid() {
        return useruuid;
    }

    public void setUseruuid(String useruuid) {
        this.useruuid = useruuid == null ? null : useruuid.trim();
    }

    public Integer getAusetspd() {
        return ausetspd;
    }

    public void setAusetspd(Integer ausetspd) {
        this.ausetspd = ausetspd;
    }

    public Integer getAusetpit() {
        return ausetpit;
    }

    public void setAusetpit(Integer ausetpit) {
        this.ausetpit = ausetpit;
    }

    public Integer getAusetvol() {
        return ausetvol;
    }

    public void setAusetvol(Integer ausetvol) {
        this.ausetvol = ausetvol;
    }

    public Integer getAusetvoiper() {
        return ausetvoiper;
    }

    public void setAusetvoiper(Integer ausetvoiper) {
        this.ausetvoiper = ausetvoiper;
    }
}