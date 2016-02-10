package com.iot.daoimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.iot.dao.TbltopauthorDAO;
import com.iot.pojo.Tbltopauthor;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbltopauthor entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.iot.pojo.Tbltopauthor
 * @author MyEclipse Persistence Tools
 */
@Repository("TbltopauthorDAO")
public class TbltopauthorDAOImpl extends HibernateDaoSupport implements TbltopauthorDAO {
	private static final Log log = LogFactory.getLog(TbltopauthorDAOImpl.class);
	protected void initDao() {
		// do nothing
	}
	@Autowired
	public void init(SessionFactory  factory) {
	    setSessionFactory(factory);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#save(com.iot.pojo.Tbltopauthor)
	 */
	public void save(Tbltopauthor transientInstance) {
		log.debug("saving Tbltopauthor instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#delete(com.iot.pojo.Tbltopauthor)
	 */
	public void delete(Tbltopauthor persistentInstance) {
		log.debug("deleting Tbltopauthor instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#findById(java.lang.Long)
	 */
	public Tbltopauthor findById(java.lang.Long id) {
		log.debug("getting Tbltopauthor instance with id: " + id);
		try {
			Tbltopauthor instance = (Tbltopauthor) getHibernateTemplate().get(
					"com.iot.pojo.Tbltopauthor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#findByExample(com.iot.pojo.Tbltopauthor)
	 */
	public List<Tbltopauthor> findByExample(Tbltopauthor instance) {
		log.debug("finding Tbltopauthor instance by example");
		try {
			List<Tbltopauthor> results = (List<Tbltopauthor>) getHibernateTemplate()
					.findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tbltopauthor instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Tbltopauthor as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#findByTxttopauthorname(java.lang.Object)
	 */
	public List<Tbltopauthor> findByTxttopauthorname(Object txttopauthorname) {
		return findByProperty(TXTTOPAUTHORNAME, txttopauthorname);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#findByTxttopauthorpublishingcount(java.lang.Object)
	 */
	public List<Tbltopauthor> findByTxttopauthorpublishingcount(
			Object txttopauthorpublishingcount) {
		return findByProperty(TXTTOPAUTHORPUBLISHINGCOUNT,
				txttopauthorpublishingcount);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tbltopauthor instances");
		try {
			String queryString = "from Tbltopauthor";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#merge(com.iot.pojo.Tbltopauthor)
	 */
	public Tbltopauthor merge(Tbltopauthor detachedInstance) {
		log.debug("merging Tbltopauthor instance");
		try {
			Tbltopauthor result = (Tbltopauthor) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#attachDirty(com.iot.pojo.Tbltopauthor)
	 */
	public void attachDirty(Tbltopauthor instance) {
		log.debug("attaching dirty Tbltopauthor instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopauthorDAO#attachClean(com.iot.pojo.Tbltopauthor)
	 */
	public void attachClean(Tbltopauthor instance) {
		log.debug("attaching clean Tbltopauthor instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbltopauthorDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TbltopauthorDAO) ctx.getBean("TbltopauthorDAO");
	}
}