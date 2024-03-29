package org.example.exam.Model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Employe {
    String name;
    String email;
    //    @ManyToOne
    @ManyToMany
    @JoinTable(name = "Employees_Skills",
            joinColumns = @JoinColumn(name = "idEmployee"),
            inverseJoinColumns = @JoinColumn(name = "idSkill"))

    ArrayList<Skill> skills;

    @ManyToMany
    @JoinTable(name = "Employees_Project",
            joinColumns = @JoinColumn(name = "idEmployee"),
            inverseJoinColumns = @JoinColumn(name = "idProject"))
    ArrayList<Project> projects;

    @Id
    private Long id;

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

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

















