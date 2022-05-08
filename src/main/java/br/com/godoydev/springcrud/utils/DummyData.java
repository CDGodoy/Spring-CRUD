package br.com.godoydev.springcrud.utils;

import br.com.godoydev.springcrud.model.Recruiter;
import br.com.godoydev.springcrud.model.Visitor;
import br.com.godoydev.springcrud.repository.RecruiterRepository;
import br.com.godoydev.springcrud.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {
    @Autowired
    RecruiterRepository recruiterRepository;
    @Autowired
    VisitorRepository visitorRepository;


    @PostConstruct
    public void saveData(){
        List<Visitor> visitors = new ArrayList<>();

        Visitor visitor1 = new Visitor("Simona Mondragão Cascais", "Apenas visitando", "Um usuário simples", "Simona-Mondragao");
        Visitor visitor2 = new Visitor("Gerson Camarinho Castelo", "Interessado no seu trabalho", "Dono de academia", "Gerson-Castelo");
        Visitor visitor3 = new Visitor("Alessia Torreiro Craveiro", "Amigo", "Desenvolvedor", "Alessia-Craveiro");

        visitors.add(visitor1);
        visitors.add(visitor2);
        visitors.add(visitor3);
        for(Visitor visitor : visitors){
            visitorRepository.save(visitor);
        }

        List<Recruiter> recruiters = new ArrayList<>();

        Recruiter recruiter1 = new Recruiter("jayson Candal Mendonça ","DjaysonMendonça@gmail.com","+55(61)12345-6789","Tech-Recruiter","Facebook","Djayson-Mendonca");
        Recruiter recruiter2 = new Recruiter("Kévim Semedo Perdigão","Kevim@gmail.com","+55(61)12345-6789","Tech-Recruiter","Twitter","Kevim-Semedo");
        Recruiter recruiter3 = new Recruiter("Vanessa Valadares Pegado","Vanessa@gmail.com","+55(61)12345-6789","Tech-Recruiter","Google","Vanessa-pegado");

        recruiters.add(recruiter1);
        recruiters.add(recruiter2);
        recruiters.add(recruiter3);

        for(Recruiter recruiter : recruiters) {
            recruiterRepository.save(recruiter);
        }
    }
}
