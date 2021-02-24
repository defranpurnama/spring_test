/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.bts.test.bts;

import com.test.bts.test.bts.data;
import com.test.bts.test.bts.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class controllerUsers {

	@Autowired
	services services;

	@PostMapping("/signup")
	public void signUp(@RequestBody data shopping) {
		services.save(shopping);
	}

	@PostMapping("/signin")
	public List<data> signIn(@RequestBody data shopping) {
		return services.listAll();
	}

	@GetMapping("")
	public List<data> list() {
		return services.listAll();
	}

}
