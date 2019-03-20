package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryNamedTestSuit {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void shouldReturnSmithAndKovalskyNamedQueries() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        Employee findSmith = employeeDao.retrieveGivenLastName("Smith");
        Employee findKovalsky = employeeDao.retrieveGivenLastName("Kovalsky");

        //Then
        Assert.assertEquals("Smith", findSmith.getLastname());
        Assert.assertEquals("Kovalsky", findKovalsky.getLastname());

        //CleanUp
        try {
            employeeDao.delete(johnSmith);
            employeeDao.delete(lindaKovalsky);
            employeeDao.delete(stephanieClarckson);
        } catch (Exception e) {

        }

    }

    @Test
    public void shouldReturn2companies_retrieveCompanyBy3FirstLettersOfItsName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company softSoup = new Company("Soft Soup");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        List<Company> companies = new ArrayList<>();
        companies.add(softwareMachine);
        companies.add(softSoup);
        companies.add(dataMaesters);
        companies.add(greyMatter);

        companyDao.save(companies);

        //When
        List<Company> findSoftwareMachine = companyDao.retrieveCompanyBy3FirstLettersOfItsName("Sof");

        //then
        Assert.assertEquals(2,findSoftwareMachine.size());

        //CleanUp
        try{
            companyDao.delete(companies);
        } catch (Exception e){

        }
    }
}
