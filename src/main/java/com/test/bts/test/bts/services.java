/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.bts.test.bts;

import com.test.bts.test.bts.data;
import com.test.bts.test.bts.repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class services {

	@Autowired
	private repository userRepository;

	public List<data> listAll() {
		return userRepository.findAll();
	}

	public void save(data user) {
		userRepository.save(user);
	}

	public data get(Integer id) {
		return userRepository.findById(id).get();
	}

	public void delete(Integer id) {
		userRepository.deleteById(id);
	}
}
