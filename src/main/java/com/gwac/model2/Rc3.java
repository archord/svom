package com.gwac.model2;
// Generated 2015-1-31 21:02:51 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rc3 generated by hbm2java
 */
@Entity
@Table(name="rc3"
    ,catalog="catalogue"
)
public class Rc3  implements java.io.Serializable {


     private Integer idnum;
     private String pgcid;
     private Float radeg;
     private Float dedeg;
     private Float gallongdeg;
     private Float gallatitdeg;
     private Float hubs;
     private Float mumag;
     private Float mbmag;
     private Float mvmag;
     private Float redshift;

    public Rc3() {
    }

    public Rc3(String pgcid, Float radeg, Float dedeg, Float gallongdeg, Float gallatitdeg, Float hubs, Float mumag, Float mbmag, Float mvmag, Float redshift) {
       this.pgcid = pgcid;
       this.radeg = radeg;
       this.dedeg = dedeg;
       this.gallongdeg = gallongdeg;
       this.gallatitdeg = gallatitdeg;
       this.hubs = hubs;
       this.mumag = mumag;
       this.mbmag = mbmag;
       this.mvmag = mvmag;
       this.redshift = redshift;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDnum", unique=true, nullable=false)
    public Integer getIdnum() {
        return this.idnum;
    }
    
    public void setIdnum(Integer idnum) {
        this.idnum = idnum;
    }

    
    @Column(name="PGCID", length=10)
    public String getPgcid() {
        return this.pgcid;
    }
    
    public void setPgcid(String pgcid) {
        this.pgcid = pgcid;
    }

    
    @Column(name="RAdeg", precision=10, scale=6)
    public Float getRadeg() {
        return this.radeg;
    }
    
    public void setRadeg(Float radeg) {
        this.radeg = radeg;
    }

    
    @Column(name="DEdeg", precision=10, scale=6)
    public Float getDedeg() {
        return this.dedeg;
    }
    
    public void setDedeg(Float dedeg) {
        this.dedeg = dedeg;
    }

    
    @Column(name="gallongdeg", precision=9, scale=6)
    public Float getGallongdeg() {
        return this.gallongdeg;
    }
    
    public void setGallongdeg(Float gallongdeg) {
        this.gallongdeg = gallongdeg;
    }

    
    @Column(name="gallatitdeg", precision=9, scale=6)
    public Float getGallatitdeg() {
        return this.gallatitdeg;
    }
    
    public void setGallatitdeg(Float gallatitdeg) {
        this.gallatitdeg = gallatitdeg;
    }

    
    @Column(name="hubs", precision=9, scale=6)
    public Float getHubs() {
        return this.hubs;
    }
    
    public void setHubs(Float hubs) {
        this.hubs = hubs;
    }

    
    @Column(name="mUmag", precision=9, scale=6)
    public Float getMumag() {
        return this.mumag;
    }
    
    public void setMumag(Float mumag) {
        this.mumag = mumag;
    }

    
    @Column(name="mBmag", precision=9, scale=6)
    public Float getMbmag() {
        return this.mbmag;
    }
    
    public void setMbmag(Float mbmag) {
        this.mbmag = mbmag;
    }

    
    @Column(name="mVmag", precision=9, scale=6)
    public Float getMvmag() {
        return this.mvmag;
    }
    
    public void setMvmag(Float mvmag) {
        this.mvmag = mvmag;
    }

    
    @Column(name="redshift", precision=9, scale=6)
    public Float getRedshift() {
        return this.redshift;
    }
    
    public void setRedshift(Float redshift) {
        this.redshift = redshift;
    }




}


