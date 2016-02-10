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

import com.iot.dao.TbltopuniversitiesDAO;
import com.iot.pojo.Tbltopuniversities;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tbltopuniversities entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.iot.pojo.Tbltopuniversities
 * @author MyEclipse Persistence Tools
 */
@Repository("TbltopuniversitiesDAO")
public class TbltopuniversitiesDAOImpl extends HibernateDaoSupport implements TbltopuniversitiesDAO {
	private static final Log log = LogFactory
			.getLog(TbltopuniversitiesDAOImpl.class);
	protected void initDao() {
		// do nothing
	}
	@Autowired
	public void init(SessionFactory  factory) {
	    setSessionFactory(factory);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#save(com.iot.pojo.Tbltopuniversities)
	 */
	public void save(Tbltopuniversities transientInstance) {
		log.debug("saving Tbltopuniversities instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#delete(com.iot.pojo.Tbltopuniversities)
	 */
	public void delete(Tbltopuniversities persistentInstance) {
		log.debug("deleting Tbltopuniversities instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#findById(java.lang.Long)
	 */
	public Tbltopuniversities findById(java.lang.Long id) {
		log.debug("getting Tbltopuniversities instance with id: " + id);
		try {
			Tbltopuniversities instance = (Tbltopuniversities) getHibernateTemplate()
					.get("com.iot.pojo.Tbltopuniversities", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#findByExample(com.iot.pojo.Tbltopuniversities)
	 */
	public List<Tbltopuniversities> findByExample(Tbltopuniversities instance) {
		log.debug("finding Tbltopuniversities instance by example");
		try {
			List<Tbltopuniversities> results = (List<Tbltopuniversities>) getHibernateTemplate()
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
	 * @see com.iot.pojo.TbltopuniversitiesDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tbltopuniversities instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Tbltopuniversities as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#findByInttopuniversitiesname(java.lang.Object)
	 */
	public List<Tbltopuniversities> findByInttopuniversitiesname(
			Object inttopuniversitiesname) {
		return findByProperty(INTTOPUNIVERSITIESNAME, inttopuniversitiesname);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#findByTxttopuniversitiesurl(java.lang.Object)
	 */
	public List<Tbltopuniversities> findByTxttopuniversitiesurl(
			Object txttopuniversitiesurl) {
		return findByProperty(TXTTOPUNIVERSITIESURL, txttopuniversitiesurl);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#findByTxttopuniversitiesrank(java.lang.Object)
	 */
	public List<Tbltopuniversities> findByTxttopuniversitiesrank(
			Object txttopuniversitiesrank) {
		return findByProperty(TXTTOPUNIVERSITIESRANK, txttopuniversitiesrank);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#findByTexttopuniversitiesdescription(java.lang.Object)
	 */
	public List<Tbltopuniversities> findByTexttopuniversitiesdescription(
			Object texttopuniversitiesdescription) {
		return findByProperty(TEXTTOPUNIVERSITIESDESCRIPTION,
				texttopuniversitiesdescription);
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tbltopuniversities instances");
		try {
			String queryString = "from Tbltopuniversities";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#merge(com.iot.pojo.Tbltopuniversities)
	 */
	public Tbltopuniversities merge(Tbltopuniversities detachedInstance) {
		log.debug("merging Tbltopuniversities instance");
		try {
			Tbltopuniversities result = (Tbltopuniversities) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#attachDirty(com.iot.pojo.Tbltopuniversities)
	 */
	public void attachDirty(Tbltopuniversities instance) {
		log.debug("attaching dirty Tbltopuniversities instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.iot.pojo.TbltopuniversitiesDAO#attachClean(com.iot.pojo.Tbltopuniversities)
	 */
	public void attachClean(Tbltopuniversities instance) {
		log.debug("attaching clean Tbltopuniversities instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TbltopuniversitiesDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TbltopuniversitiesDAO) ctx.getBean("TbltopuniversitiesDAO");
	}
}