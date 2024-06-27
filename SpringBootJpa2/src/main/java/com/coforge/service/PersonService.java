package com.coforge.service;

import java.util.List;

import com.coforge.exception.PersonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.coforge.model.Person;
import com.coforge.repository.PersonRepository;
@Service

public class PersonService {
    @Autowired
    PersonRepository repository;
    public Person addPerson(@RequestBody Person p)throws PersonException {
        return repository.save(p);
    }

    public List<Person> getAllPerson() throws PersonException{
        return repository.findAll();

    }

    public Person searchById(@PathVariable("id") long id) throws PersonException{
        return repository.findById(id).get();

    }
    public List<Person> searchByName(@PathVariable("name") String name)throws PersonException {
        return repository.findBypersonName(name);

    }
    public Person deleteById(@PathVariable("id") long id)throws PersonException {
        Person p1=repository.findById(id).get();
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return p1;
        }
        return null;
    }
    public Person updatePerson(@RequestBody Person p) throws PersonException {
        if(repository.findById(p.getPersonId()).isPresent()) {
            return repository.save(p);
        }
        return null;
    }

}


