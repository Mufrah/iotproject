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

import com.iot.dao.TblrfcDAO;
import com.iot.pojo.Tblrfc;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tblrfc entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.iot.pojo.Tblrfc
 * @author MyEclipse Persistence Tools
 */
@Repository("TblrfcDAO")
public class TblrfcDAOImpl extends HibernateDaoSupport implements TblrfcDAO {
	private static final Log log = LogFactory.getLog(TblrfcDAOImpl.class);
	protected void initDao() {
		// do nothing
	}
	@Autowired
	public void init(SessionFactory  factory) {
	    setSessionFactory(factory);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#save(com.iot.pojo.Tblrfc)
	 */
	public void save(Tblrfc transientInstance) {
		log.debug("saving Tblrfc instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#delete(com.iot.pojo.Tblrfc)
	 */
	public void delete(Tblrfc persistentInstance) {
		log.debug("deleting Tblrfc instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#findById(java.lang.Long)
	 */
	public Tblrfc findById(java.lang.Long id) {
		log.debug("getting Tblrfc instance with id: " + id);
		try {
			Tblrfc instance = (Tblrfc) getHibernateTemplate().get(
					"com.iot.pojo.Tblrfc", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#findByExample(com.iot.pojo.Tblrfc)
	 */
	public List<Tblrfc> findByExample(Tblrfc instance) {
		log.debug("finding Tblrfc instance by example");
		try {
			List<Tblrfc> results = (List<Tblrfc>) getHibernateTemplate()
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
	 * @see com.iot.pojo.TblrfcDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tblrfc instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tblrfc as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#findByTxtrfcname(java.lang.Object)
	 */
	public List<Tblrfc> findByTxtrfcname(Object txtrfcname) {
		return findByProperty(TXTRFCNAME, txtrfcname);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#findByTxtrfcurl(java.lang.Object)
	 */
	public List<Tblrfc> findByTxtrfcurl(Object txtrfcurl) {
		return findByProperty(TXTRFCURL, txtrfcurl);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tblrfc instances");
		try {
			String queryString = "from Tblrfc";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#merge(com.iot.pojo.Tblrfc)
	 */
	public Tblrfc merge(Tblrfc detachedInstance) {
		log.debug("merging Tblrfc instance");
		try {
			Tblrfc result = (Tblrfc) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#attachDirty(com.iot.pojo.Tblrfc)
	 */
	public void attachDirty(Tblrfc instance) {
		log.debug("attaching dirty Tblrfc instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblrfcDAO#attachClean(com.iot.pojo.Tblrfc)
	 */
	public void attachClean(Tblrfc instance) {
		log.debug("attaching clean Tblrfc instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TblrfcDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TblrfcDAO) ctx.getBean("TblrfcDAO");
	}
}