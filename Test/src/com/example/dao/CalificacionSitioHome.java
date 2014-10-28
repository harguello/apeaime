package com.example.dao;

// default package
// Generated 21/10/2014 08:44:55 PM by Hibernate Tools 4.0.0

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.example.modelo.CalificacionSitio;

/**
 * Home object for domain model class CalificacionSitio.
 * @see .CalificacionSitio
 * @author Hibernate Tools
 */
public class CalificacionSitioHome {

	private static final Log log = LogFactory
			.getLog(CalificacionSitioHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(CalificacionSitio transientInstance) {
		log.debug("persisting CalificacionSitio instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CalificacionSitio instance) {
		log.debug("attaching dirty CalificacionSitio instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CalificacionSitio instance) {
		log.debug("attaching clean CalificacionSitio instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CalificacionSitio persistentInstance) {
		log.debug("deleting CalificacionSitio instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CalificacionSitio merge(CalificacionSitio detachedInstance) {
		log.debug("merging CalificacionSitio instance");
		try {
			CalificacionSitio result = (CalificacionSitio) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CalificacionSitio findById(long id) {
		log.debug("getting CalificacionSitio instance with id: " + id);
		try {
			CalificacionSitio instance = (CalificacionSitio) sessionFactory
					.getCurrentSession().get("CalificacionSitio", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CalificacionSitio instance) {
		log.debug("finding CalificacionSitio instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("CalificacionSitio")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
