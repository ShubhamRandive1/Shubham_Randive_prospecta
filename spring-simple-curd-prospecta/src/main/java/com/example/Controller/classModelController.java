package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.classNotFoundException;
import com.example.Model.classModel;
import com.example.ServiceImpl.classServiceImpl;

@RestController
public class classModelController {
	
	@Autowired
	classServiceImpl serviceImpl;
	
	@GetMapping("/api.publicapis.org/entries/getAllEntries")
	public List<classModel> getAllTheDetailsOfClass(){
		
		return serviceImpl.getAllTheDetailsOfClass();
		
	};
	
	@PostMapping("/api.publicapis.org/entries/saveTheClassModel")
	public String saveTheClassModelDetails(@RequestBody classModel classmodel) {
		return serviceImpl.saveTheClassModelDetails(classmodel);
		
	};
	
	@GetMapping("/api.publicapis.org/entries/getDetailsByCategory")
	public classModel getTheDetailsSpecifiedByCategory(@RequestBody classModel classmodel, @PathVariable String description) throws classNotFoundException {
		return serviceImpl.getTheDetailsSpecifiedByCategory(classmodel, description);
		
	};
	
	@GetMapping("/api.publicapis.org/entries/getTitleById")
	public classModel getTitleAndDescriptionById(@PathVariable Long id) throws classNotFoundException {
		return serviceImpl.getTitleAndDescriptionById(id);
		
		
	};

}
