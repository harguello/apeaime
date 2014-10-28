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

import com.example.modelo.RutaTuristica;

/**
 * Home object for domain model class RutaTuristica.
 * @see .RutaTuristica
 * @author Hibernate Tools
 */
public class RutaTuristicaHome {

	private static final Log log = LogFactory.getLog(RutaTuristicaHome.class);

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

	public void persist(RutaTuristica transientInstance) {
		log.debug("persisting RutaTuristica instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RutaTuristica instance) {
		log.debug("attaching dirty RutaTuristica instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RutaTuristica instance) {
		log.debug("attaching clean RutaTuristica instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RutaTuristica persistentInstance) {
		log.debug("deleting RutaTuristica instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RutaTuristica merge(RutaTuristica detachedInstance) {
		log.debug("merging RutaTuristica instance");
		try {
			RutaTuristica result = (RutaTuristica) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RutaTuristica findById(long id) {
		log.debug("getting RutaTuristica instance with id: " + id);
		try {
			RutaTuristica instance = (RutaTuristica) sessionFactory
					.getCurrentSession().get("RutaTuristica", id);
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

	public List findByExample(RutaTuristica instance) {
		log.debug("finding RutaTuristica instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("RutaTuristica")
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
