package org.example.exam.Controller;

import jakarta.annotation.ManagedBean;
import org.example.exam.DAO.EmployeDAOImpl;
import org.example.exam.Model.Employe;
import org.example.exam.Service.EmployeService;

import java.util.ArrayList;

@ManagedBean
public class EmployeeController {
    ArrayList<Employe> employes;
    int id;
    String name;
    String email;
    ArrayList<String> skills;
    EmployeService employeService;
    EmployeDAOImpl employeDAOImpl;

    public EmployeeController() {
        this.employeDAOImpl = new EmployeDAOImpl();
        this.employeService = new EmployeService(this.employeDAOImpl);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    public String add() {
        System.out.println("ADD empl");
        return "addEmployee.xhtml";
    }
}
