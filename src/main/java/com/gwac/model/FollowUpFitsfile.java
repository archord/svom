package com.gwac.model;
// Generated 2015-10-19 21:58:46 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * FollowUpFitsfile generated by hbm2java
 */
@Entity
@Table(name="follow_up_fitsfile"
    ,schema="public"
)
public class FollowUpFitsfile  implements java.io.Serializable {


     private long fufId;
     private String ffName;
     private String ffPath;
     private Integer frId;
     private Boolean isUpload;

    public FollowUpFitsfile() {
    }

	
    public FollowUpFitsfile(long fufId) {
        this.fufId = fufId;
    }
    public FollowUpFitsfile(long fufId, String ffName, String ffPath, Integer frId, Boolean isUpload) {
       this.fufId = fufId;
       this.ffName = ffName;
       this.ffPath = ffPath;
       this.frId = frId;
       this.isUpload = isUpload;
    }
   
  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "fuf_id_seq")})
     @Id 
  @GeneratedValue(generator = "generator")
    @Column(name="fuf_id", unique=true, nullable=false)
    public long getFufId() {
        return this.fufId;
    }
    
    public void setFufId(long fufId) {
        this.fufId = fufId;
    }

    
    @Column(name="ff_name")
    public String getFfName() {
        return this.ffName;
    }
    
    public void setFfName(String ffName) {
        this.ffName = ffName;
    }

    
    @Column(name="ff_path")
    public String getFfPath() {
        return this.ffPath;
    }
    
    public void setFfPath(String ffPath) {
        this.ffPath = ffPath;
    }

    
    @Column(name="fr_id")
    public Integer getFrId() {
        return this.frId;
    }
    
    public void setFrId(Integer frId) {
        this.frId = frId;
    }

    
    @Column(name="is_upload")
    public Boolean getIsUpload() {
        return this.isUpload;
    }
    
    public void setIsUpload(Boolean isUpload) {
        this.isUpload = isUpload;
    }




}

