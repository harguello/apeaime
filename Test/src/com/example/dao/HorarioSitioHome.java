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

import com.example.modelo.HorarioSitio;

/**
 * Home object for domain model class HorarioSitio.
 * @see .HorarioSitio
 * @author Hibernate Tools
 */
public class HorarioSitioHome {

	private static final Log log = LogFactory.getLog(HorarioSitioHome.class);

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

	public void persist(HorarioSitio transientInstance) {
		log.debug("persisting HorarioSitio instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(HorarioSitio instance) {
		log.debug("attaching dirty HorarioSitio instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HorarioSitio instance) {
		log.debug("attaching clean HorarioSitio instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(HorarioSitio persistentInstance) {
		log.debug("deleting HorarioSitio instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HorarioSitio merge(HorarioSitio detachedInstance) {
		log.debug("merging HorarioSitio instance");
		try {
			HorarioSitio result = (HorarioSitio) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public HorarioSitio findById(long id) {
		log.debug("getting HorarioSitio instance with id: " + id);
		try {
			HorarioSitio instance = (HorarioSitio) sessionFactory
					.getCurrentSession().get("HorarioSitio", id);
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

	public List findByExample(HorarioSitio instance) {
		log.debug("finding HorarioSitio instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("HorarioSitio")
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
