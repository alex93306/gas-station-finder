package org.mycompany.dao.impl;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mycompany.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ALEX on 10.05.2016.
 */
@Transactional
public  abstract class GenericDao<T, PK extends Serializable> implements Dao<T, PK> {

	@Autowired
	private SessionFactory sessionFactory;
	private Class<T> clazz;

	public GenericDao(Class<T> clazz) {
		this.clazz=clazz;
	}

	@Override
	public List<T> getAll() {
		return getSession().createCriteria(clazz).list();
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
