package com.gwac.model;
// Generated 2014-3-2 18:54:13 by Hibernate Tools 3.2.2.GA


import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class StarKnow.
 * @see com.gwac.model.StarKnow
 * @author Hibernate Tools
 */
public class StarKnowHome {

    private static final Log log = LogFactory.getLog(StarKnowHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(StarKnow transientInstance) {
        log.debug("persisting StarKnow instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(StarKnow instance) {
        log.debug("attaching dirty StarKnow instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(StarKnow instance) {
        log.debug("attaching clean StarKnow instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(StarKnow persistentInstance) {
        log.debug("deleting StarKnow instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public StarKnow merge(StarKnow detachedInstance) {
        log.debug("merging StarKnow instance");
        try {
            StarKnow result = (StarKnow) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public StarKnow findById( long id) {
        log.debug("getting StarKnow instance with id: " + id);
        try {
            StarKnow instance = (StarKnow) sessionFactory.getCurrentSession()
                    .get("com.gwac.model.StarKnow", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(StarKnow instance) {
        log.debug("finding StarKnow instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.gwac.model.StarKnow")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

