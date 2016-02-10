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

import com.iot.dao.TblresearchgroupDAO;
import com.iot.pojo.Tblresearchgroup;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tblresearchgroup entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.iot.pojo.Tblresearchgroup
 * @author MyEclipse Persistence Tools
 */
@Repository("TblresearchgroupDAO")
public class TblresearchgroupDAOImpl extends HibernateDaoSupport implements TblresearchgroupDAO {
	private static final Log log = LogFactory.getLog(TblresearchgroupDAOImpl.class);
	protected void initDao() {
		// do nothing
	}
	@Autowired
	public void init(SessionFactory  factory) {
	    setSessionFactory(factory);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#save(com.iot.pojo.Tblresearchgroup)
	 */
	public void save(Tblresearchgroup transientInstance) {
		log.debug("saving Tblresearchgroup instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#delete(com.iot.pojo.Tblresearchgroup)
	 */
	public void delete(Tblresearchgroup persistentInstance) {
		log.debug("deleting Tblresearchgroup instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#findById(java.lang.Long)
	 */
	public Tblresearchgroup findById(java.lang.Long id) {
		log.debug("getting Tblresearchgroup instance with id: " + id);
		try {
			Tblresearchgroup instance = (Tblresearchgroup) getHibernateTemplate()
					.get("com.iot.pojo.Tblresearchgroup", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#findByExample(com.iot.pojo.Tblresearchgroup)
	 */
	public List<Tblresearchgroup> findByExample(Tblresearchgroup instance) {
		log.debug("finding Tblresearchgroup instance by example");
		try {
			List<Tblresearchgroup> results = (List<Tblresearchgroup>) getHibernateTemplate()
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
	 * @see com.iot.pojo.TblresearchgroupDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tblresearchgroup instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Tblresearchgroup as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#findByTxtreseacrgroupname(java.lang.Object)
	 */
	public List<Tblresearchgroup> findByTxtreseacrgroupname(
			Object txtreseacrgroupname) {
		return findByProperty(TXTRESEACRGROUPNAME, txtreseacrgroupname);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#findByTxtresearchgroupurl(java.lang.Object)
	 */
	public List<Tblresearchgroup> findByTxtresearchgroupurl(
			Object txtresearchgroupurl) {
		return findByProperty(TXTRESEARCHGROUPURL, txtresearchgroupurl);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#findByTxtresearchgroupdescription(java.lang.Object)
	 */
	public List<Tblresearchgroup> findByTxtresearchgroupdescription(
			Object txtresearchgroupdescription) {
		return findByProperty(TXTRESEARCHGROUPDESCRIPTION,
				txtresearchgroupdescription);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tblresearchgroup instances");
		try {
			String queryString = "from Tblresearchgroup";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#merge(com.iot.pojo.Tblresearchgroup)
	 */
	public Tblresearchgroup merge(Tblresearchgroup detachedInstance) {
		log.debug("merging Tblresearchgroup instance");
		try {
			Tblresearchgroup result = (Tblresearchgroup) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#attachDirty(com.iot.pojo.Tblresearchgroup)
	 */
	public void attachDirty(Tblresearchgroup instance) {
		log.debug("attaching dirty Tblresearchgroup instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblresearchgroupDAO#attachClean(com.iot.pojo.Tblresearchgroup)
	 */
	public void attachClean(Tblresearchgroup instance) {
		log.debug("attaching clean Tblresearchgroup instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TblresearchgroupDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TblresearchgroupDAO) ctx.getBean("TblresearchgroupDAO");
	}
}