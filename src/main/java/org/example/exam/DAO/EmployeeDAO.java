package org.example.exam.DAO;

import org.example.exam.Model.Employe;

import java.util.ArrayList;

public interface EmployeeDAO {
    public void save(Employe employe);
    public ArrayList<Employe> findAll();
    public void delete(Employe employe);
    public Employe find(int id);
}
