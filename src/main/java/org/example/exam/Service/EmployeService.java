package org.example.exam.Service;

import org.example.exam.DAO.EmployeDAOImpl;
import org.example.exam.Model.Employe;

public class EmployeService {
    EmployeDAOImpl employeDAOImp;

    public EmployeService(EmployeDAOImpl employeDAOImp) {
        this.employeDAOImp = employeDAOImp;
    }

    public void save(Employe employe) {
        employeDAOImp.save(employe);
    }

    public void delete(int id) {

        employeDAOImp.delete(employeDAOImp.find(id));
    }
}
