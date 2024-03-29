package org.example.exam.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.example.exam.Model.Employe;

import java.util.ArrayList;

public class EmployeDAOImpl implements EmployeeDAO {
    EntityManagerFactory entityManagerFactory;
    EntityManager em;
    public EmployeDAOImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("myPU");
        em = entityManagerFactory.createEntityManager();

    }

    @Override
    public void save(Employe employe) {
em.persist(employe);
    }

    @Override
    public ArrayList<Employe> findAll() {
        Query employees = em.createQuery("SELECT e FROM Employe e"
        );
        return new ArrayList<>(employees.getResultList());
    }

    @Override
    public void delete(Employe employe) {
        em.getTransaction().begin();
        em.remove(employe);
        em.getTransaction().commit();
    }

    @Override
    public Employe find(int id) {
        return em.find(Employe.class, id);

    }
}
