package org.mycompany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getHoursOfWork() {
		return hoursOfWork;
	}

	public Float getLongitude() {
		return longitude;
	}

	public Float getLatitude() {
		return latitude;
	}

	public String getPhone() {
		return phone;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHoursOfWork(String hoursOfWork) {
		this.hoursOfWork = hoursOfWork;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	@Override public String toString() {
		return "Object{" +
						"id=" + id +
						", address='" + address + '\'' +
						", number='" + number + '\'' +
						", name='" + name + '\'' +
						", hoursOfWork='" + hoursOfWork + '\'' +
						", longitude=" + longitude +
						", latitude=" + latitude +
						", phone='" + phone + '\'' +
						", createdDate=" + createdDate +
						", dateUpdate=" + dateUpdate +
						'}';
	}
	/*private Status status;
	private Country country;
	private Region region;
	private City city;
	private ObjectType objectType;
	private Operator operator;
	private Track track;
	private List<ObjectFluentType> fluentTypes=new ArrayList<>();
	private List<ObjectService> services=new ArrayList<>();
	private List<ObjectBillingType> billingTypes=new ArrayList<>();*/

}

