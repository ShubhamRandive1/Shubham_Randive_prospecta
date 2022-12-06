package com.example.Service;

import java.util.List;
import java.util.Optional;

import com.example.Exception.classNotFoundException;
import com.example.Model.classModel;

public interface classService {
	
	public List<classModel> getAllTheDetailsOfClass();
	
	public String saveTheClassModelDetails(classModel classmodel);
	
	public classModel getTheDetailsSpecifiedByCategory(classModel classmodel, String description)throws classNotFoundException;
	
	public classModel getTitleAndDescriptionById(Long id)throws classNotFoundException;

}
