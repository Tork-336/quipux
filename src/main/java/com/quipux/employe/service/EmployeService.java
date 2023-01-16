package com.quipux.employe.service;

import com.quipux.employe.model.entity.EmployeEntity;
import com.quipux.employe.model.payload.EmployeDTO;

import java.text.ParseException;
import java.util.List;

/**
 * This is interface defination for Employe
 */

public interface EmployeService {

    Object create(EmployeDTO employe) throws ParseException;
    List<EmployeEntity> filter(Integer emp_no);

}
