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
@RequestMapping("/shopping")
public class controllerShopping {

	@Autowired
	services shoppingService;

	@PostMapping("/")
	public void add(@RequestBody data shopping) {
		shoppingService.save(shopping);
	}

	@GetMapping("")
	public List<data> list() {
		return shoppingService.listAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<data> get(@PathVariable Integer id) {
		try {
			data shopping = shoppingService.get(id);
			return new ResponseEntity<data>(shopping, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<data>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody data shopping, @PathVariable Integer id) {
		try {
			data existshopping = shoppingService.get(id);
			shopping.setId(id);
			shoppingService.save(shopping);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {

		shoppingService.delete(id);
	}
}
