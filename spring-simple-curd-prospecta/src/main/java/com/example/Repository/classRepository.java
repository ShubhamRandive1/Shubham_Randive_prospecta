package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.classModel;

@Repository
public interface classRepository extends JpaRepository<classModel, Long>{
	
	

}
