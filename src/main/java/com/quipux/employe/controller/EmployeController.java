package com.quipux.employe.controller;

import com.quipux.employe.model.payload.EmployeDTO;
import com.quipux.employe.service.EmployeService;
import com.quipux.util.ApiResponse;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.Locale;

/**
 * This is rest-controller for Employes-entities
 */
@RestController
@RequestMapping(value = "employe")
public class EmployeController {

    private final EmployeService service;
    private final MessageSource messageSource;

    /**
     * This is constructor the class
     *
     * @param service
     * @param messageSource
     */
    public EmployeController(EmployeService service, MessageSource messageSource) {
        this.service = service;
        this.messageSource = messageSource;
    }

    /**
     * This is end-point find by emp_no {@link com.quipux.employe.model.entity.EmployeEntity}
     * @param emp_no
     * @param locale
     * @return
     */
    @GetMapping(value = "/{emp_no}")
    public ResponseEntity<ApiResponse> getEmployeByEmpNo(@PathVariable Integer emp_no, Locale locale) {
        return ResponseEntity.ok().body(
                new ApiResponse<>(
                        this.service.filter(emp_no),
                        this.messageSource.getMessage("general.get.success", null, locale)
                )
        );
    }

    /**
     * This is end-point for create a new {@link com.quipux.employe.model.entity.EmployeEntity}
     * @param locale
     * @return
     */
    @PostMapping
    public ResponseEntity<ApiResponse> create(@Valid @RequestBody EmployeDTO employe, Locale locale) throws ParseException {
        return ResponseEntity.ok().body(
                new ApiResponse(
                        this.service.create(employe),
                        this.messageSource.getMessage("general.create.success", null, locale)
                )
        );
    }
}
