package org.example.exam.DAO;

import org.example.exam.Model.Employe;
import org.example.exam.Model.Project;

public interface ProjectDAO {
    void save(Project project);



    public void findAll();

    public void delete(int id);
}
