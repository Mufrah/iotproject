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

import com.iot.dao.TblconferenceDAO;
import com.iot.pojo.Tblconference;
/**
 * A data access object (DAO) providing persistence and search support for
 * Tblconference entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.iot.pojo.Tblconference
 * @author MyEclipse Persistence Tools
 */
@Repository("TblconferenceDAO")
public class TblconferenceDAOImpl extends HibernateDaoSupport implements TblconferenceDAO {
	private static final Log log = LogFactory.getLog(TblconferenceDAOImpl.class);
	protected void initDao() {
		// do nothing
	}

	@Autowired
	public void init(SessionFactory  factory) {
	    setSessionFactory(factory);
	}

	public void save(Tblconference transientInstance) {
		log.debug("saving Tblconference instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tblconference persistentInstance) {
		log.debug("deleting Tblconference instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tblconference findById(java.lang.Long id) {
		log.debug("getting Tblconference instance with id: " + id);
		try {
			Tblconference instance = (Tblconference) getHibernateTemplate()
					.get("com.iot.pojo.Tblconference", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Tblconference> findByExample(Tblconference instance) {
		log.debug("finding Tblconference instance by example");
		try {
			List<Tblconference> results = (List<Tblconference>) getHibernateTemplate()
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
	 * @see com.iot.daoimpl.TblconferenceDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tblconference instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Tblconference as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Tblconference> findByTxtconferencename(Object txtconferencename) {
		return findByProperty(TXTCONFERENCENAME, txtconferencename);
	}

	
	public List<Tblconference> findByTxtconferenceurl(Object txtconferenceurl) {
		return findByProperty(TXTCONFERENCEURL, txtconferenceurl);
	}

	public List<Tblconference> findByTxtconferencedescription(
			Object txtconferencedescription) {
		return findByProperty(TXTCONFERENCEDESCRIPTION,
				txtconferencedescription);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblconferenceDAO#findByTxtPaid(java.lang.Object)
	 */
	public List<Tblconference> findByTxtPaid(Object txtPaid) {
		return findByProperty(TXT_PAID, txtPaid);
	}
	/* (non-Javadoc)
	 * @see com.iot.daoimpl.TblconferenceDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tblconference instances");
		try {
			String queryString = "from Tblconference";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tblconference merge(Tblconference detachedInstance) {
		log.debug("merging Tblconference instance");
		try {
			Tblconference result = (Tblconference) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tblconference instance) {
		log.debug("attaching dirty Tblconference instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tblconference instance) {
		log.debug("attaching clean Tblconference instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TblconferenceDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TblconferenceDAO) ctx.getBean("TblconferenceDAO");
	}
}