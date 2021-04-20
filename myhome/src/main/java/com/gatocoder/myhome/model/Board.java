package com.gatocoder.myhome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.Data;


@Entity
@Data
@Table(name = "board")
public class Board {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title")
	@NotNull
	@Size(min=2, max=30, message = "제목은 2자이상 30자 이하입니다.")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	
}
