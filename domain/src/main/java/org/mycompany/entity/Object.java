package org.mycompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import org.mycompany.enums.ObjectType;
import org.mycompany.enums.Status;

/**
 * Created by ALEX on 15.04.2016.
 */
@Entity
public class Object {
	private Long id;
	private String address;
	private String number;
	private String name;
	private String hoursOfWork;
	private Float longitude;
	private Float latitude;
	private String phone;
	private Date createdDate;
	private Date dateUpdate;
	private Status status;
	private Country country;
	private Region region;
	private City city;
	private ObjectType objectType;
	private Operator operator;
	private Track track;
	private List<ObjectFluentType> fluentTypes=new ArrayList<>();
	private List<ObjectService> services=new ArrayList<>();
	private List<ObjectBillingType> billingTypes=new ArrayList<>();

}

