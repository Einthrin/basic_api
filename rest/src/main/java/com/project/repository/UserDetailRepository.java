package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.UserDetail;

public interface UserDetailRepository extends JpaRepository<UserDetail, Integer>{
}