package com.edu.baiedu.dao;

public class PbPostPraise {
    private String popruuid;

    private String postuuid;

    private String useruuid;

    public String getPopruuid() {
        return popruuid;
    }

    public void setPopruuid(String popruuid) {
        this.popruuid = popruuid == null ? null : popruuid.trim();
    }

    public String getPostuuid() {
        return postuuid;
    }

    public void setPostuuid(String postuuid) {
        this.postuuid = postuuid == null ? null : postuuid.trim();
    }

    public String getUseruuid() {
        return useruuid;
    }

    public void setUseruuid(String useruuid) {
        this.useruuid = useruuid == null ? null : useruuid.trim();
    }
}