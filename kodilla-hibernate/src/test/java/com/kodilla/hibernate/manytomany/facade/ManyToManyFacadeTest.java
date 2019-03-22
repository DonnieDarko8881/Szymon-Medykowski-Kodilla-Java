package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private ManyToManyFacade manyToManyFacade;

    @Test
    public void shouldReturnSmithAndKovalsky_ManyToManyFacadeTest(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        Employee findSmith = manyToManyFacade.retrieveEmployeeByPieceOfHisName("mit");
        Employee findKovalsky = manyToManyFacade.retrieveEmployeeByPieceOfHisName("%sky%");

        //Then
        Assert.assertEquals("Smith", findSmith.getLastName());
        Assert.assertEquals("Kovalsky", findKovalsky.getLastName());

        //CleanUp
        try {
            employeeDao.delete(johnSmith);
            employeeDao.delete(lindaKovalsky);
            employeeDao.delete(stephanieClarckson);
        } catch (Exception e) {

        }
    }

    @Test
    public void shouldReturnOneCompany_ManyToManyFacade() {
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
        List<Company> findDataMaesters = manyToManyFacade.retrieveCompanyByPieceOfItsName("da");

        //then
        Assert.assertEquals(1,findDataMaesters.size());

        //CleanUp
        try{
            companyDao.delete(companies);
        } catch (Exception e){

        }
    }

}