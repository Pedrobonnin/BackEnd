
package com.portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Proyect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //campo primary key autogenerado
    private int idProy;
      
    @NotNull
    @Size(max = 80)
    private String nameProy;
    
    @NotNull
    @Size (max = 300)
    private String detailsProy;
    
    
    @Size (max = 300)
    private String repoUrlProy;
    
    @Size (max = 300)
    private String siteUrlProy;
    
    @Size (max = 500)
    private String imgUrlProy;
    
    @Size (max = 60)
    private String toolsProy;
 
    public Proyect() {
    }

    public Proyect(String nameProy, String detailsProy, String repoUrlProy, String siteUrlProy, String imgUrlProy, String toolsProy) {
        this.nameProy = nameProy;
        this.detailsProy = detailsProy;
        this.repoUrlProy = repoUrlProy;
        this.siteUrlProy = siteUrlProy;
        this.imgUrlProy = imgUrlProy;
        this.toolsProy = toolsProy; 
    }

    public int getIdProy() {
        return idProy;
    }

    public void setIdProy(int idProy) {
        this.idProy = idProy;
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
