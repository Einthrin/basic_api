package com.project.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.UserDetail;
import com.project.service.UserDetailService;

@RestController
@RequestMapping("userdetail")
public class UserDetailController {
	@Autowired
	UserDetailService userDetailService;

	@GetMapping("")
	public List<UserDetail> list() {
		return userDetailService.listAllUser();
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDetail> get(@PathVariable Integer id) {
		try {
			UserDetail userDetail = userDetailService.getUser(id);
			return new ResponseEntity<UserDetail>(userDetail, HttpStatus.OK);
		} catch (NoSuchElementException exception) {
			return new ResponseEntity<UserDetail>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/")
	public void add(@RequestBody UserDetail userDetail) {
		userDetailService.saveUser(userDetail);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody UserDetail userDetail, @PathVariable Integer id) {
		try {
			UserDetail existUserDetail = userDetailService.getUser(id);
			userDetail.setUserDetailId(id);
			userDetailService.saveUser(userDetail);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException exception) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {

		userDetailService.deleteUser(id);
	}
}