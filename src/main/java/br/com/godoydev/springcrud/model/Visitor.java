package br.com.godoydev.springcrud.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Visitors")
@NoArgsConstructor
@Getter
@Setter
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;
    private String reason;
    private String description;
    private String linkedIn;
}
