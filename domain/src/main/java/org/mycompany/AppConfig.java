package org.mycompany;

import org.mycompany.dao.impl.ObjectDaoImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ALEX on 10.05.2016.
 */
@Configuration
@ComponentScan(basePackageClasses = { ObjectDaoImpl.class})
public class AppConfig {

}
