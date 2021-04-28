package com.gatocoder.myhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatocoder.myhome.model.Board;
import com.gatocoder.myhome.model.User;
import com.gatocoder.myhome.repository.BoardRepository;
import com.gatocoder.myhome.repository.UserRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public Board save(String username, Board board) {
		User user = userRepository.findByUsername(username);
		board.setUser(user);
		
		return boardRepository.save(board);
		
	}
}
