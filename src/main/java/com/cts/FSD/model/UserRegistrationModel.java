package com.cts.FSD.model;

/*
 * This is a POJO class contains all the fields of user registration page along with their getters and setters.
 */
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // basic hibernate syntax to make a pojo class as entity for database
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) // to prevent serialization
@Table(name = "user")
public class UserRegistrationModel {
	@Id
	@Column(name = "user_id")
	private Long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	// mat(shape=JsonFormat.Shape.STRING,pattern="MM-dd-yyyy") // to ease persisting
	// of data input
	/*
	 * private Date dob; private String address; private Long phoneNo; private
	 * String emailId; private String password; private String confirmPassword;
	 */

	public String getFirstName() {
		return firstName;
	}

	public UserRegistrationModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/*
	 * public Date getDob() { return dob; }
	 */
	/*
	 * public void setDob(Date dob) { this.dob = dob; } public String getAddress() {
	 * return address; } public void setAddress(String address) { this.address =
	 * address; } public Long getPhoneNo() { return phoneNo; } public void
	 * setPhoneNo(Long phoneNo) { this.phoneNo = phoneNo; } public String
	 * getEmailId() { return emailId; } public void setEmailId(String emailId) {
	 * this.emailId = emailId; } public String getPassword() { return password; }
	 * public void setPassword(String password) { this.password = password; } public
	 * String getConfirmPassword() { return confirmPassword; } public void
	 * setConfirmPassword(String confirmPassword) { this.confirmPassword =
	 * confirmPassword; } public Long getId() { return id; } public void setId(Long
	 * id) { this.id = id; }
	 * 
	 */

}
