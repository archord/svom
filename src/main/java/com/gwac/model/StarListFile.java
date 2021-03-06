package com.gwac.model;
// Generated 2015-10-2 9:40:37 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StarListFile generated by hbm2java
 */
@Entity
@Table(name="star_list_file"
    ,schema="public"
)
public class StarListFile  implements java.io.Serializable {


     private long slfId;
     private Short dpmId;
     private String storePath;
     private String fileName;

    public StarListFile() {
    }

	
    public StarListFile(long slfId) {
        this.slfId = slfId;
    }
    public StarListFile(long slfId, Short dpmId, String storePath, String fileName) {
       this.slfId = slfId;
       this.dpmId = dpmId;
       this.storePath = storePath;
       this.fileName = fileName;
    }
   
     @Id 

    
    @Column(name="slf_id", unique=true, nullable=false)
    public long getSlfId() {
        return this.slfId;
    }
    
    public void setSlfId(long slfId) {
        this.slfId = slfId;
    }

    
    @Column(name="dpm_id")
    public Short getDpmId() {
        return this.dpmId;
    }
    
    public void setDpmId(Short dpmId) {
        this.dpmId = dpmId;
    }

    
    @Column(name="store_path")
    public String getStorePath() {
        return this.storePath;
    }
    
    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    
    @Column(name="file_name")
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }




}


