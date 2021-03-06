/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.DataProcessMachine;
import java.util.List;

/**
 *
 * @author xy
 */
public interface DataProcessMachineDAO extends BaseHibernateDao<DataProcessMachine> {

  public List<DataProcessMachine> getAllDpms();

  public void updateMonitorImageTime(int dpmId);
  
  public void updateLastActiveTime(String dmpName);

  public DataProcessMachine getDpmByName(String name);

  public void updateByName(DataProcessMachine dpm);

  public DataProcessMachine getDpmById(long id);
  
  public void updateFirstRecordNumber(String dpmName, int number);
  
  public int getFirstRecordNumber(String dpmName);
  
  public void everyDayInit();
}
