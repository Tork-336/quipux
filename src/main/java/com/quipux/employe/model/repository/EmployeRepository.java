package com.quipux.employe.model.repository;

import com.quipux.employe.model.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This is repository for {@link EmployeEntity}
 */
@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity, Integer> {

    @Query(value = "FROM EmployeEntity em WHERE em.id =:emp_no ")
    List<EmployeEntity> findAll(Integer emp_no);
}
