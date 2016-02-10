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

import com.iot.dao.TbljournalDAO;
import com.iot.pojo.Tbljournal;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbljournal entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.iot.pojo.Tbljournal
 * @author MyEclipse Persistence Tools
 */
@Repository("TbljournalDAO")
public class TbljournalDAOImpl extends HibernateDaoSupport implements TbljournalDAO {
	private static final Log log = LogFactory.getLog(TbljournalDAOImpl.class);
	protected void initDao() {
		// do nothing
	}
	@Autowired
	public void init(  SessionFactory  factory) {
	    setSessionFactory(factory);
	}
	

	public void save(Tbljournal transientInstance) {
		log.debug("saving Tbljournal instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tbljournal persistentInstance) {
		log.debug("deleting Tbljournal instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbljournal findById(java.lang.Long id) {
		log.debug("getting Tbljournal instance with id: " + id);
		try {
			Tbljournal instance = (Tbljournal) getHibernateTemplate().get(
					"com.iot.pojo.Tbljournal", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Tbljournal> findByExample(Tbljournal instance) {
		log.debug("finding Tbljournal instance by example");
		try {
			List<Tbljournal> results = (List<Tbljournal>) getHibernateTemplate()
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
	 * @see com.iot.daoimpl.TbljournalDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tbljournal instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tbljournal as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Tbljournal> findByTxtjournalname(Object txtjournalname) {
		return findByProperty(TXTJOURNALNAME, txtjournalname);
	}

	public List<Tbljournal> findByTxtjournalimpactfactor(
			Object txtjournalimpactfactor) {
		return findByProperty(TXTJOURNALIMPACTFACTOR, txtjournalimpactfactor);
	}

	public List<Tbljournal> findByTxtjournalurl(Object txtjournalurl) {
		return findByProperty(TXTJOURNALURL, txtjournalurl);
	}

	public List<Tbljournal> findByTxtjournaldescription(
			Object txtjournaldescription) {
		return findByProperty(TXTJOURNALDESCRIPTION, txtjournaldescription);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbljournalDAO#findByTxtPaid(java.lang.Object)
	 */
	public List<Tbljournal> findByTxtPaid(Object txtPaid) {
		return findByProperty(TXT_PAID, txtPaid);
	}
	/* (non-Javadoc)
	 * @see com.iot.daoimpl.TbljournalDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tbljournal instances");
		try {
			String queryString = "from Tbljournal";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tbljournal merge(Tbljournal detachedInstance) {
		log.debug("merging Tbljournal instance");
		try {
			Tbljournal result = (Tbljournal) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbljournal instance) {
		log.debug("attaching dirty Tbljournal instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbljournal instance) {
		log.debug("attaching clean Tbljournal instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbljournalDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TbljournalDAO) ctx.getBean("TbljournalDAO");
	}
}