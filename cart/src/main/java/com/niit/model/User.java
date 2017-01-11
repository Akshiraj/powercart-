package com.niit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "USER")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6572030635110450324L;

	@Id
	private String id;

	@NotEmpty(message = "please enter your name")
	private String name;

	@Column(unique = true, nullable = false)
	private String mailId;

	@Min(7)
	@Max(13)
	private String password;
	private String billingAddress;
	private String shippingAddress;
	private String mobileNumber;
	private String role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailid(String mailId) {
		this.mailId = mailId;
	}

	public String getbillingAddress() {
		return billingAddress;
	}

	public void setbillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setmobilenumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getshippingAddress() {
		return shippingAddress;
	}

	public void setshippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
