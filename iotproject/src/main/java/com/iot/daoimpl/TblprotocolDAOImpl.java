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

import com.iot.dao.TblprotocolDAO;
import com.iot.pojo.Tblprotocol;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tblprotocol entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.iot.pojo.Tblprotocol
 * @author MyEclipse Persistence Tools
 */
@Repository("TblprotocolDAO")
public class TblprotocolDAOImpl extends HibernateDaoSupport implements TblprotocolDAO {
	private static final Log log = LogFactory.getLog(TblprotocolDAOImpl.class);
	protected void initDao() {
		// do nothing
	}
	@Autowired
	public void init(SessionFactory  factory) {
	    setSessionFactory(factory);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#save(com.iot.pojo.Tblprotocol)
	 */
	public void save(Tblprotocol transientInstance) {
		log.debug("saving Tblprotocol instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#delete(com.iot.pojo.Tblprotocol)
	 */
	public void delete(Tblprotocol persistentInstance) {
		log.debug("deleting Tblprotocol instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#findById(java.lang.Long)
	 */
	public Tblprotocol findById(java.lang.Long id) {
		log.debug("getting Tblprotocol instance with id: " + id);
		try {
			Tblprotocol instance = (Tblprotocol) getHibernateTemplate().get(
					"com.iot.pojo.Tblprotocol", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#findByExample(com.iot.pojo.Tblprotocol)
	 */
	public List<Tblprotocol> findByExample(Tblprotocol instance) {
		log.debug("finding Tblprotocol instance by example");
		try {
			List<Tblprotocol> results = (List<Tblprotocol>) getHibernateTemplate()
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
	 * @see com.iot.pojo.TblprotocolDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tblprotocol instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tblprotocol as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#findByTxtprotocolname(java.lang.Object)
	 */
	public List<Tblprotocol> findByTxtprotocolname(Object txtprotocolname) {
		return findByProperty(TXTPROTOCOLNAME, txtprotocolname);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#findByTxtprotocoldescription(java.lang.Object)
	 */
	public List<Tblprotocol> findByTxtprotocoldescription(
			Object txtprotocoldescription) {
		return findByProperty(TXTPROTOCOLDESCRIPTION, txtprotocoldescription);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tblprotocol instances");
		try {
			String queryString = "from Tblprotocol";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#merge(com.iot.pojo.Tblprotocol)
	 */
	public Tblprotocol merge(Tblprotocol detachedInstance) {
		log.debug("merging Tblprotocol instance");
		try {
			Tblprotocol result = (Tblprotocol) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#attachDirty(com.iot.pojo.Tblprotocol)
	 */
	public void attachDirty(Tblprotocol instance) {
		log.debug("attaching dirty Tblprotocol instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblprotocolDAO#attachClean(com.iot.pojo.Tblprotocol)
	 */
	public void attachClean(Tblprotocol instance) {
		log.debug("attaching clean Tblprotocol instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TblprotocolDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TblprotocolDAO) ctx.getBean("TblprotocolDAO");
	}
}