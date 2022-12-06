package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class classModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classId;
	
	
	private String title;
	
	
	private String description;
	
	
	private String classAuth;
	
	
	private String classCategory;
	
	
	private String classCors;

}
