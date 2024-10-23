package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {
public List<DepartmentEntity> findByDlocation(String dlocation);
@Query("SELECT m FROM DepartmentEntity m WHERE m.dname LIKE ?1%")
 public List<DepartmentEntity> searchByDNameStartsWith(String dname);
 
}
