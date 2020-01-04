package com.edu.baiedu.dao;

public class PbCommentPraise {
    private String cmpruuid;

    private String postuuid;

    private String useruuid;

    private String cmuuid;

    public String getCmpruuid() {
        return cmpruuid;
    }

    public void setCmpruuid(String cmpruuid) {
        this.cmpruuid = cmpruuid == null ? null : cmpruuid.trim();
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

    public String getCmuuid() {
        return cmuuid;
    }

    public void setCmuuid(String cmuuid) {
        this.cmuuid = cmuuid == null ? null : cmuuid.trim();
    }
}