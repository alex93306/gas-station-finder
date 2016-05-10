package org.mycompany.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ALEX on 10.05.2016.
 */
public interface Dao<T,PK extends Serializable> {

	List<T> getAll();
}
