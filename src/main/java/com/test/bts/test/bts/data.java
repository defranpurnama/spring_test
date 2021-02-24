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
@Table(name = "shopping")
public class data {

	private int id;
	private String Name;
	private String CreatedDate;

	public data() {
	}

	public data(int id, String Name, String shopping) {
		this.id = id;
		this.Name = Name;
		this.CreatedDate = shopping;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	void setId(Integer id) {
		this.id = id;
	}

}
