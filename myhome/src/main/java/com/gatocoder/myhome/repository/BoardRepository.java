package com.gatocoder.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatocoder.myhome.model.Board;


public interface BoardRepository extends JpaRepository<Board, Long> {

}
