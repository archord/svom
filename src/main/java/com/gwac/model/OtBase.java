package com.gwac.model;
// Generated 2014-3-2 17:07:19 by Hibernate Tools 3.2.2.GA



/**
 * OtBase generated by hbm2java
 */
public class OtBase  implements java.io.Serializable {


     private long otId;
     private String otName;

    public OtBase() {
    }

	
    public OtBase(long otId) {
        this.otId = otId;
    }
    public OtBase(long otId, String otName) {
       this.otId = otId;
       this.otName = otName;
    }
   
    public long getOtId() {
        return this.otId;
    }
    
    public void setOtId(long otId) {
        this.otId = otId;
    }
    public String getOtName() {
        return this.otName;
    }
    
    public void setOtName(String otName) {
        this.otName = otName;
    }




}


