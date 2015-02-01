/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.model;

import com.gwac.util.CommonFunction;

/**
 *
 * @author xy
 */
public class OtLevel2QueryParameter {

  private String startDate;
  private String endDate;
  private float xtemp;
  private float ytemp;
  private float planeRadius;
  private float ra;
  private float dec;
  private float sphereRadius;
  private String telscope;
  private Boolean queryHis;
  /**查询结果集的大小，从start开始，查询size条记录*/
  private int start;
  private int size;
  
  public Boolean isEmpty(){
    
    if (startDate.isEmpty() && endDate.isEmpty() && telscope.equalsIgnoreCase("all")
            && Math.abs(planeRadius) < CommonFunction.MINFLOAT
            && Math.abs(sphereRadius) < CommonFunction.MINFLOAT) {
      return true;
    }else{
      return false;
    }
  }

  /**
   * @return the startDate
   */
  public String getStartDate() {
    return startDate;
  }

  /**
   * @param startDate the startDate to set
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * @return the endDate
   */
  public String getEndDate() {
    return endDate;
  }

  /**
   * @param endDate the endDate to set
   */
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * @return the xtemp
   */
  public float getXtemp() {
    return xtemp;
  }

  /**
   * @param xtemp the xtemp to set
   */
  public void setXtemp(float xtemp) {
    this.xtemp = xtemp;
  }

  /**
   * @return the ytemp
   */
  public float getYtemp() {
    return ytemp;
  }

  /**
   * @param ytemp the ytemp to set
   */
  public void setYtemp(float ytemp) {
    this.ytemp = ytemp;
  }

  /**
   * @return the planeRadius
   */
  public float getPlaneRadius() {
    return planeRadius;
  }

  /**
   * @param planeRadius the planeRadius to set
   */
  public void setPlaneRadius(float planeRadius) {
    this.planeRadius = planeRadius;
  }

  /**
   * @return the ra
   */
  public float getRa() {
    return ra;
  }

  /**
   * @param ra the ra to set
   */
  public void setRa(float ra) {
    this.ra = ra;
  }

  /**
   * @return the dec
   */
  public float getDec() {
    return dec;
  }

  /**
   * @param dec the dec to set
   */
  public void setDec(float dec) {
    this.dec = dec;
  }

  /**
   * @return the sphereRadius
   */
  public float getSphereRadius() {
    return sphereRadius;
  }

  /**
   * @param sphereRadius the sphereRadius to set
   */
  public void setSphereRadius(float sphereRadius) {
    this.sphereRadius = sphereRadius;
  }

  /**
   * @return the telscope
   */
  public String getTelscope() {
    return telscope;
  }

  /**
   * @param telscope the telscope to set
   */
  public void setTelscope(String telscope) {
    this.telscope = telscope;
  }

  /**
   * @return the start
   */
  public int getStart() {
    return start;
  }

  /**
   * @param start the start to set
   */
  public void setStart(int start) {
    this.start = start;
  }

  /**
   * @return the size
   */
  public int getSize() {
    return size;
  }

  /**
   * @param size the size to set
   */
  public void setSize(int size) {
    this.size = size;
  }

  /**
   * @return the queryHis
   */
  public Boolean getQueryHis() {
    return queryHis;
  }

  /**
   * @param queryHis the queryHis to set
   */
  public void setQueryHis(Boolean queryHis) {
    this.queryHis = queryHis;
  }
}