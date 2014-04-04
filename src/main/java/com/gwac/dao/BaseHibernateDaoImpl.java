package com.gwac.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

@Transactional
public abstract class BaseHibernateDaoImpl<T extends Serializable> implements BaseHibernateDao<T> {

  private Class<T> clazz;
  SessionFactory sessionFactory;

  public void setClazz(final Class<T> clazzToSet) {
    clazz = clazzToSet;
  }

  @SuppressWarnings("unchecked")
  public T getById(final Long id) {
    if (id != null) {
      return (T) getCurrentSession().get(clazz, id);
    } else {
      return null;
    }
  }

  //@SuppressWarnings("unchecked")
  public List<T> findAll() {
    try {
      Session curSession = getCurrentSession();
      if (curSession == null) {
        System.out.println("curSession is null!");
        return null;
      } else {
        List<T> list = curSession.createCriteria(clazz).list();
        return list;
      }
    } catch (HibernateException ex) {
      System.out.println(ex.toString());
    }
    return null;
  }

  @SuppressWarnings("unchecked")
  public List<T> findAll(int start, int resultSize) {
    return getCurrentSession().createCriteria(clazz)
            .setFirstResult(start)
            .setMaxResults(resultSize)
            .list();
  }

  @Transactional(readOnly = false)
  public void save(final T entity) throws Exception {
    getCurrentSession().persist(entity);
  }

  @Transactional(readOnly = false)
  public void update(final T entity) {
    getCurrentSession().merge(entity);
  }

  public final Session getCurrentSession() {
    return sessionFactory.getCurrentSession();
  }

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }
}
