package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.List;


@Repository
public class Facade {

    @Autowired
   public CompanyDao companyDao;

   @Autowired
   public EmployeeDao employeeDao;

   public List<Employee> getEmployeesByLike(String partOfWord)  {
       List<Employee> listOfEmpl = employeeDao.employeesLikeName(partOfWord);
       return listOfEmpl;
    }

    public List<Company> getCompaniesByLike(String partOfWord)  {
        List<Company> listOfCompaies = companyDao.companyLikeName(partOfWord);
        return listOfCompaies;
    }
}
