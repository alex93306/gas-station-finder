package org.mycompany.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ALEX on 15.04.2016.
 */
public class Object {
	private Long id;
	private String address;
	private String hoursOfWork;
	private Float longitude;
	private Float latitude;
	private String phone;
	private User createdBy;
	private Set<ObjectAttribute> objectAttributes=new HashSet<>();

/*	private Operator operator;
	private List<ObjectFluentType> fluentTypes=new ArrayList<>();
	private List<ObjectServices> services=new ArrayList<>();
	private List<ObjectBillingType> billingTypes=new ArrayList<>();*/



}

