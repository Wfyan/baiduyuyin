package com.edu.baiedu.dao;

import java.util.Date;

public class PbPost {
    private String postuuid;

    private String useruuid;

    private String posttitle;

    private Integer postpageviews;

    private String postaudio;

    private Date posttime;

    private String posttext;

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

    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle == null ? null : posttitle.trim();
    }

    public Integer getPostpageviews() {
        return postpageviews;
    }

    public void setPostpageviews(Integer postpageviews) {
        this.postpageviews = postpageviews;
    }

    public String getPostaudio() {
        return postaudio;
    }

    public void setPostaudio(String postaudio) {
        this.postaudio = postaudio == null ? null : postaudio.trim();
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public String getPosttext() {
        return posttext;
    }

    public void setPosttext(String posttext) {
        this.posttext = posttext == null ? null : posttext.trim();
    }
}