package com.quipux.employe.model.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EmployeDTO {

    private String birth_date;
    @NotEmpty
    private String first_name;
    @NotEmpty
    private String last_name;
    @NotEmpty
    @Pattern(regexp = "^(.+)@(\\\\S+)$")
    private String email;
    @NotEmpty
    @Pattern(regexp = "[0-9]+")
    private String dni;
    private String gender;
    private String hire_date;

    public EmployeDTO() {
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
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

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }
}
