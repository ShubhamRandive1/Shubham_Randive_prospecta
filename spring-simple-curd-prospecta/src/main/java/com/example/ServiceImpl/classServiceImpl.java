package com.example.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.classNotFoundException;
import com.example.Model.classModel;
import com.example.Repository.classRepository;
import com.example.Service.classService;

@Service
public class classServiceImpl implements classService{
	
	@Autowired
	classRepository cRepo;

	@Override
	public List<classModel> getAllTheDetailsOfClass() {
		// TODO Auto-generated method stub
		return cRepo.findAll();
	}

	@Override
	public String saveTheClassModelDetails(classModel classmodel) {
		// TODO Auto-generated method stub
		String str="";
		
		if(classmodel != null) {
			cRepo.save(classmodel);
			str+="new class model is saved";
		}else {
			str+="cannot save class model please enter all the details";
		}
		return str;
			
	}

	@Override
	public classModel getTheDetailsSpecifiedByCategory(classModel classmodel, String description) throws classNotFoundException{
		if(classmodel.getDescription() == description) {
			
			return cRepo.findById(classmodel.getClassId()).get();
		}else {
			
			return classmodel;
		}
	}

	@Override
	public classModel getTitleAndDescriptionById(Long id)throws classNotFoundException {
		// TODO Auto-generated method stub
		return cRepo.getById(id);
	}

}
