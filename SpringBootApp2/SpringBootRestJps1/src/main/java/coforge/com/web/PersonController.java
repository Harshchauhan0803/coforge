package coforge.com.web;

import coforge.com.model.Person;
import coforge.com.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository repository;

    @PostMapping("/allPerson")
    public Person addPerson(@RequestBody  Person p){
        return repository.save(p);
    }

    @GetMapping("/allPerson/name/{name}")
    public List<Person>searchByName(@PathVariable("name")String name){
        return repository.findBypersonName(name);

    }

    @GetMapping("/allPerson")
    public List<Person>getallPerson(){
        return repository.findAll();

    }
}
