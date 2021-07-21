package com.example.demo.mainMenu.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "MainMenu")
public class MainMenu {
	
	@Id
	private String id;
	
	private String AAcategory;
	private String BBen;
	private String CCkor;
	private Integer DDprice;
	private String EElocation;
	private String FFdetail;
	

}