
package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;



public class dtoProyects {
    
    @NotBlank
    private String nameProy;
    @NotBlank
    private String detailsProy;
    
    private String repoUrlProy;
   
    private String siteUrlProy;
    
    private String imgUrlProy;
    
    private String toolsProy;

    public dtoProyects() {
    }

    public dtoProyects(String nameProy, String detailsProy, String repoUrlProy, String siteUrlProy, String imgUrlProy, String toolsProy) {
        this.nameProy = nameProy;
        this.detailsProy = detailsProy;
        this.repoUrlProy = repoUrlProy;
        this.siteUrlProy = siteUrlProy;
        this.imgUrlProy = imgUrlProy;
        this.toolsProy = toolsProy;
    }

    public String getNameProy() {
        return nameProy;
    }

    public void setNameProy(String nameProy) {
        this.nameProy = nameProy;
    }

    public String getDetailsProy() {
        return detailsProy;
    }

    public void setDetailsProy(String detailsProy) {
        this.detailsProy = detailsProy;
    }

    public String getRepoUrlProy() {
        return repoUrlProy;
    }

    public void setRepoUrlProy(String repoUrlProy) {
        this.repoUrlProy = repoUrlProy;
    }

    public String getSiteUrlProy() {
        return siteUrlProy;
    }

    public void setSiteUrlProy(String siteUrlProy) {
        this.siteUrlProy = siteUrlProy;
    }

    public String getImgUrlProy() {
        return imgUrlProy;
    }

    public void setImgUrlProy(String imgUrlProy) {
        this.imgUrlProy = imgUrlProy;
    }

    public String getToolsProy() {
        return toolsProy;
    }

    public void setToolsProy(String toolsProy) {
        this.toolsProy = toolsProy;
    }
    
    
    
    
}
