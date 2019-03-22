package com.kodilla.hibernate.manytomany;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.retrieveCompanyBy3FirstLettersOfItsName",
                query = "SELECT * FROM COMPANIES" +
                        " WHERE LEFT(company_name,3)= :COMPANY_NAME",
                resultClass = Company.class
        ),
        @NamedNativeQuery(
                name = "Company.retrieveCompanyByPieceOfItsName",
                query = "SELECT * FROM COMPANIES" +
                        " WHERE company_name LIKE :COMPANY_NAME",
                resultClass = Company.class
        )
})
@Entity
@Table(name = "COMPANIES")
@Component
public class Company {
    private int id;
    private String companyName;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.companyName = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return companyName;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.companyName = name;
    }
}
