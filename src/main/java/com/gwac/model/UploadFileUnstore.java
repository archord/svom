package com.gwac.model;
// Generated May 5, 2014 8:56:32 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;

/**
 * UploadFileUnstore generated by hbm2java
 */
public class UploadFileUnstore  implements java.io.Serializable {


     private long ufuId;
     private String storePath;
     private String fileName;
     private Character fileType;
     private Boolean uploadSuccess;
     private Date uploadDate;

    public UploadFileUnstore() {
    }

	
    public UploadFileUnstore(long ufuId) {
        this.ufuId = ufuId;
    }
    public UploadFileUnstore(long ufuId, String storePath, String fileName, Character fileType, Boolean uploadSuccess, Date uploadDate) {
       this.ufuId = ufuId;
       this.storePath = storePath;
       this.fileName = fileName;
       this.fileType = fileType;
       this.uploadSuccess = uploadSuccess;
       this.uploadDate = uploadDate;
    }
   
    public long getUfuId() {
        return this.ufuId;
    }
    
    public void setUfuId(long ufuId) {
        this.ufuId = ufuId;
    }
    public String getStorePath() {
        return this.storePath;
    }
    
    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public Character getFileType() {
        return this.fileType;
    }
    
    public void setFileType(Character fileType) {
        this.fileType = fileType;
    }
    public Boolean getUploadSuccess() {
        return this.uploadSuccess;
    }
    
    public void setUploadSuccess(Boolean uploadSuccess) {
        this.uploadSuccess = uploadSuccess;
    }
    public Date getUploadDate() {
        return this.uploadDate;
    }
    
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }




}


