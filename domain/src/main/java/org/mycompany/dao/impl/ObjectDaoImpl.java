package org.mycompany.dao.impl;

import org.mycompany.dao.ObjectDao;
import org.mycompany.entity.Object;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ALEX on 10.05.2016.
 */
@Repository("objectDao")
@Transactional
public class ObjectDaoImpl extends GenericDao<Object, Long> implements ObjectDao {

	public ObjectDaoImpl() {
		super(Object.class);
	}
}
