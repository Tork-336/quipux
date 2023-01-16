package com.quipux.employe.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

@Entity
@SequenceGenerator(name = "sq_employe_id", sequenceName = "sq_employe_id", allocationSize = 1, schema = "quipux")
@Table(schema = "quipux", name = "employes")
public class EmployeEntity {

    @Id
    @GeneratedValue(generator = "sq_employe_id", strategy = GenerationType.SEQUENCE)
    @Column(name = "emp_no")
    private Integer id;
    private Date birth_date;
    private String first_name;
    private String last_name;
    private String email;
    private String dni;
    private String gender;
    private Date hire_date;

    public EmployeEntity() {
    }

    public EmployeEntity(
            Date birth_date,
            String first_name,
            String last_name,
            String email,
            String dni,
            String gender,
            Date hire_date
    ) {
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.dni = dni;
        this.gender = gender;
        this.hire_date = hire_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }
}
