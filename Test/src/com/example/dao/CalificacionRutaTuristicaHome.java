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

import com.example.modelo.CalificacionRutaTuristica;

/**
 * Home object for domain model class CalificacionRutaTuristica.
 * @see .CalificacionRutaTuristica
 * @author Hibernate Tools
 */
public class CalificacionRutaTuristicaHome {

	private static final Log log = LogFactory
			.getLog(CalificacionRutaTuristicaHome.class);

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

	public void persist(CalificacionRutaTuristica transientInstance) {
		log.debug("persisting CalificacionRutaTuristica instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CalificacionRutaTuristica instance) {
		log.debug("attaching dirty CalificacionRutaTuristica instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CalificacionRutaTuristica instance) {
		log.debug("attaching clean CalificacionRutaTuristica instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CalificacionRutaTuristica persistentInstance) {
		log.debug("deleting CalificacionRutaTuristica instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CalificacionRutaTuristica merge(
			CalificacionRutaTuristica detachedInstance) {
		log.debug("merging CalificacionRutaTuristica instance");
		try {
			CalificacionRutaTuristica result = (CalificacionRutaTuristica) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CalificacionRutaTuristica findById(long id) {
		log.debug("getting CalificacionRutaTuristica instance with id: " + id);
		try {
			CalificacionRutaTuristica instance = (CalificacionRutaTuristica) sessionFactory
					.getCurrentSession().get("CalificacionRutaTuristica", id);
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

	public List findByExample(CalificacionRutaTuristica instance) {
		log.debug("finding CalificacionRutaTuristica instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("CalificacionRutaTuristica")
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
