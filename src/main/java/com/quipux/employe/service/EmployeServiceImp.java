package com.quipux.employe.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quipux.employe.model.entity.EmployeEntity;
import com.quipux.employe.model.payload.EmployeDTO;
import com.quipux.employe.model.repository.EmployeRepository;
import com.quipux.exception.model.ErrorDataException;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * This is servive with business logic for {@link EmployeEntity}
 */
@Service
public class EmployeServiceImp implements EmployeService {

    private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final EmployeRepository repository;


    /**
     * This is constructor the class
     * @param repository
     */
    public EmployeServiceImp(EmployeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<EmployeEntity> filter(Integer emp_no) {
        return this.repository.findAll(emp_no);
    }

    /**
     * This method crete a new {@link EmployeEntity}
     */
    @Override
    public Object create(EmployeDTO employe) throws ParseException {
        ObjectMapper mapper = new ObjectMapper();
        if (ChronoUnit.YEARS.between(
                LocalDate.parse(employe.getBirth_date(), this.dateFormat),
                LocalDate.now()) > 17
        ) {
            return this.repository.save(mapper.convertValue(employe, EmployeEntity.class));
        }
        throw new ErrorDataException(" La fecha de nacimiento es menor a 17 años.");
    }
}
