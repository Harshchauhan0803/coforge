package com.coforge.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.coforge.model.Person;
import com.coforge.repository.PersonRepository;

@RestController
public class PersonController {
    @Autowired
    PersonRepository repository;

    @PostMapping("/allPerson")
    public Person addPerson(@RequestBody Person p) {
        return repository.save(p);
    }

    @GetMapping("/allPerson")
    public List<Person> getAllPerson() {
        return repository.findAll();
    }

    @GetMapping("/allPerson{id}")
    public Person searchById(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }

    @GetMapping("/allPerson/name{name}")
    public List<Person> searchByName(@PathVariable("name") String name) {
        return repository.findBypersonName(name);
    }

    @DeleteMapping("/allPerson/{id}")
    public Person deleteById(@PathVariable("id") long id) {
        Person p1=repository.findById(id).get();
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return p1;
        }
        return null;
    }

    @PutMapping("/allPerson/")
    public Person updatePerson(@RequestBody Person p) {
        if(repository.findById(p.getPersonId()).isPresent()) {
            return repository.save(p);
        }
        return null;
    }
}






