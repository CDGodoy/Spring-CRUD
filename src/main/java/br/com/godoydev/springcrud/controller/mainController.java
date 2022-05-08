package br.com.godoydev.springcrud.controller;

import br.com.godoydev.springcrud.model.Recruiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class mainController {

    @GetMapping
    public Recruiter hello(){
        Recruiter r1 = new Recruiter("Carlos", "Carlos@gmail.com", "12345", "Visitante");
        return r1;
    }

}
