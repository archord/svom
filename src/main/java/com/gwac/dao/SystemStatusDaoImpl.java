/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.SystemStatus;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xy
 */
@Repository(value="systemStatusDao")
public class SystemStatusDaoImpl extends BaseHibernateDaoImpl<SystemStatus> implements SystemStatusDao{
  
}
