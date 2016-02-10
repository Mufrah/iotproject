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

import com.iot.dao.TblbookDAO;
import com.iot.pojo.Tblbook;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tblbook entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.iot.pojo.Tblbook
 * @author MyEclipse Persistence Tools
 */
@Repository("TblbookDAO")
public class TblbookDAOImpl extends HibernateDaoSupport implements TblbookDAO {
	private static final Log log = LogFactory.getLog(TblbookDAOImpl.class);
	protected void initDao() {
		// do nothing
	}
	@Autowired
	public void init(SessionFactory  factory) {
	    setSessionFactory(factory);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#save(com.iot.pojo.Tblbook)
	 */
	public void save(Tblbook transientInstance) {
		log.debug("saving Tblbook instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#delete(com.iot.pojo.Tblbook)
	 */
	public void delete(Tblbook persistentInstance) {
		log.debug("deleting Tblbook instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findById(java.lang.Long)
	 */
	public Tblbook findById(java.lang.Long id) {
		log.debug("getting Tblbook instance with id: " + id);
		try {
			Tblbook instance = (Tblbook) getHibernateTemplate().get(
					"com.iot.pojo.Tblbook", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findByExample(com.iot.pojo.Tblbook)
	 */
	public List<Tblbook> findByExample(Tblbook instance) {
		log.debug("finding Tblbook instance by example");
		try {
			List<Tblbook> results = (List<Tblbook>) getHibernateTemplate()
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
	 * @see com.iot.pojo.TblbookDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tblbook instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tblbook as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findByTxtbookname(java.lang.Object)
	 */
	public List<Tblbook> findByTxtbookname(Object txtbookname) {
		return findByProperty(TXTBOOKNAME, txtbookname);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findByTxtbookprice(java.lang.Object)
	 */
	public List<Tblbook> findByTxtbookprice(Object txtbookprice) {
		return findByProperty(TXTBOOKPRICE, txtbookprice);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findByTxtbookurl(java.lang.Object)
	 */
	public List<Tblbook> findByTxtbookurl(Object txtbookurl) {
		return findByProperty(TXTBOOKURL, txtbookurl);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findByTxtbookauthor(java.lang.Object)
	 */
	public List<Tblbook> findByTxtbookauthor(Object txtbookauthor) {
		return findByProperty(TXTBOOKAUTHOR, txtbookauthor);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findByTxtpublishername(java.lang.Object)
	 */
	public List<Tblbook> findByTxtpublishername(Object txtpublishername) {
		return findByProperty(TXTPUBLISHERNAME, txtpublishername);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findByTxtpublishdate(java.lang.Object)
	 */
	public List<Tblbook> findByTxtpublishdate(Object txtpublishdate) {
		return findByProperty(TXTPUBLISHDATE, txtpublishdate);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tblbook instances");
		try {
			String queryString = "from Tblbook";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#merge(com.iot.pojo.Tblbook)
	 */
	public Tblbook merge(Tblbook detachedInstance) {
		log.debug("merging Tblbook instance");
		try {
			Tblbook result = (Tblbook) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#attachDirty(com.iot.pojo.Tblbook)
	 */
	public void attachDirty(Tblbook instance) {
		log.debug("attaching dirty Tblbook instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TblbookDAO#attachClean(com.iot.pojo.Tblbook)
	 */
	public void attachClean(Tblbook instance) {
		log.debug("attaching clean Tblbook instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TblbookDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TblbookDAO) ctx.getBean("TblbookDAO");
	}
}