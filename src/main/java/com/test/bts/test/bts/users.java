/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.bts.test.bts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class users {

	private int id;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String country;
	private String city;
	private String postcode;
	private String name;
	private String address;

	public users() {
	}

	public users(int id, String username, String password, String email, String phone, String country, String city, String postcode, String name, String address) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.postcode = postcode;
		this.name = name;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
}
