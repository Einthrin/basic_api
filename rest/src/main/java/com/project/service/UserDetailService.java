package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.model.UserDetail;
import com.project.repository.UserDetailRepository;

@Service
@Transactional
public class UserDetailService {

	@Autowired
	private UserDetailRepository userDetailRepository;

	public List<UserDetail> listAllUser() {
		return userDetailRepository.findAll();
	}

	public void saveUser(UserDetail userDetail) {
		userDetailRepository.save(userDetail);
	}

	public UserDetail getUser(Integer id) {
		return userDetailRepository.findById(id).get();
	}

	public void deleteUser(Integer id) {
		userDetailRepository.deleteById(id);
	}
}