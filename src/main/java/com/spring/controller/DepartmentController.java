package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.DepartmentEntity;
import com.spring.repository.DepartmentRepository;
import com.spring.service.DepartmentService;

@RestController
@RequestMapping("api/department")
public class DepartmentController {
 @Autowired
	private DepartmentService ds;
 @Autowired
	private DepartmentRepository dr;
 
 @GetMapping("all")
 public List<DepartmentEntity> getAllDepartment(){
	 return ds.getAllDepartment();
 }
// localhost:8080/api/department/add
 @PostMapping("add")
 public DepartmentEntity addDepartment(@RequestBody DepartmentEntity d) {
	 return ds.addDepartment(d);
 }
// localhost:8080/api/department/del/2
 @DeleteMapping("del/{did}")
 public void delDepartment(@PathVariable int did) {  
     ds.delDepartment(did);
 }
 @PutMapping("update/{did}")
 public DepartmentEntity updateDepartment(@PathVariable int did,@RequestBody DepartmentEntity d) {
	 return ds.updateDepartment(did, d);
 }
 @GetMapping("byid/{did}")
 public DepartmentEntity getDepById(@PathVariable  int did) {
		return ds.getDepById(did);
	}
// localhost:8080/api/department/bydlocation/chembur
 @GetMapping("bydlocation/{dlocation}")
 public List<DepartmentEntity> findByDlocation(@PathVariable String dlocation)
 {
 	return ds.findByDlocation(dlocation);
 }
 //localhost:8080/api/department/bydlocation?dlocation=lucknow
 @GetMapping("bydlocation")
 public List<DepartmentEntity> findByDlocation1(@RequestParam String dlocation)
 {
 	return ds.findByDlocation(dlocation);
 }
 @GetMapping("bydname")
 public List<DepartmentEntity> findByDnameLike(@RequestParam String dname){
	      return dr.searchByDNameStartsWith(dname); 
 }
 }
