package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.DepartmentEntity;
import com.spring.repository.DepartmentRepository;

@Service
public class DepartmentService {
 @Autowired
	private DepartmentRepository dr;
    public List<DepartmentEntity> getAllDepartment(){
    	return dr.findAll();
    }	
      
    public DepartmentEntity addDepartment(DepartmentEntity d) {
    	return dr.save(d);
    }
    public void delDepartment(int did) {
    	DepartmentEntity d = dr.getById(did);
    	this.dr.delete(d);
    }
    public DepartmentEntity updateDepartment(int did,DepartmentEntity d) {
    	d.setDid(did);
    	return dr.save(d);
    }
    public DepartmentEntity getDepById(int did) {
		return dr.findById(did).get();
	}
    public List<DepartmentEntity> findByDlocation(String dlocation)
    {
    	return dr.findByDlocation(dlocation);
    }
    
}
