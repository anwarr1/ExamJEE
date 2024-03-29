package org.example.exam.Model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Project {
    String name;
    double budegt;
    @ManyToMany
    @JoinTable(name = "Employees_Project",
            joinColumns = @JoinColumn(name = "idProject"),
            inverseJoinColumns = @JoinColumn(name = "idEmployee"))
    ArrayList<Employe> employes;
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
