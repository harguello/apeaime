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

import com.example.modelo.Databasechangelog;
import com.example.modelo.DatabasechangelogId;

/**
 * Home object for domain model class Databasechangelog.
 * @see .Databasechangelog
 * @author Hibernate Tools
 */
public class DatabasechangelogHome {

	private static final Log log = LogFactory
			.getLog(DatabasechangelogHome.class);

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

	public void persist(Databasechangelog transientInstance) {
		log.debug("persisting Databasechangelog instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Databasechangelog instance) {
		log.debug("attaching dirty Databasechangelog instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Databasechangelog instance) {
		log.debug("attaching clean Databasechangelog instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Databasechangelog persistentInstance) {
		log.debug("deleting Databasechangelog instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Databasechangelog merge(Databasechangelog detachedInstance) {
		log.debug("merging Databasechangelog instance");
		try {
			Databasechangelog result = (Databasechangelog) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Databasechangelog findById(DatabasechangelogId id) {
		log.debug("getting Databasechangelog instance with id: " + id);
		try {
			Databasechangelog instance = (Databasechangelog) sessionFactory
					.getCurrentSession().get("Databasechangelog", id);
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

	public List findByExample(Databasechangelog instance) {
		log.debug("finding Databasechangelog instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Databasechangelog")
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
