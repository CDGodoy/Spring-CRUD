package br.com.godoydev.springcrud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Recruiters")
@NoArgsConstructor
@Getter
@Setter
public class Recruiter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;
    private String email;
    private String telephone;
    private String description;
    private String company;
    private String linkedIn;

    public Recruiter(String name, String email, String telephone, String description, String company, String linkedIn) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.description = description;
        this.company = company;
        this.linkedIn = linkedIn;
    }

}
