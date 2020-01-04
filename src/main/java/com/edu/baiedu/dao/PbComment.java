package com.edu.baiedu.dao;

import java.util.Date;

public class PbComment {
    private String cmuuid;

    private String postuuid;

    private String useruuid;

    private String cmaudio;

    private Date cmtime;

    private String cmtext;

    public String getCmuuid() {
        return cmuuid;
    }

    public void setCmuuid(String cmuuid) {
        this.cmuuid = cmuuid == null ? null : cmuuid.trim();
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

    public String getCmaudio() {
        return cmaudio;
    }

    public void setCmaudio(String cmaudio) {
        this.cmaudio = cmaudio == null ? null : cmaudio.trim();
    }

    public Date getCmtime() {
        return cmtime;
    }

    public void setCmtime(Date cmtime) {
        this.cmtime = cmtime;
    }

    public String getCmtext() {
        return cmtext;
    }

    public void setCmtext(String cmtext) {
        this.cmtext = cmtext == null ? null : cmtext.trim();
    }
}