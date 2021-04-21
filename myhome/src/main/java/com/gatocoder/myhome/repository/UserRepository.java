package com.gatocoder.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatocoder.myhome.model.Board;
import com.gatocoder.myhome.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
