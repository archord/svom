/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.FitsFile;

/**
 *
 * @author xy
 */
public interface FitsFileDAO extends BaseHibernateDao<FitsFile> {

  public FitsFile getByName(String ffName);
}
