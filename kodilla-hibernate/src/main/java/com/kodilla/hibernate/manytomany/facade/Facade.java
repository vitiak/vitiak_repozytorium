package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@NamedNativeQuery(
        name = "Facade.companyLikeName",
        query = "SELECT * FROM COMPANIES" +
                " WHERE company_name like %:ARG% ",
        resultClass = Company.class
)
@NamedQuery(
        name = "Facade.employeesLikeName",
        query = "FROM Employee WHERE LASTNAME like %:PAR_LASTNAME%"
)
public class Facade {


   @Autowired
    public Company company;

   @Autowired
   public Employee employee;



}
