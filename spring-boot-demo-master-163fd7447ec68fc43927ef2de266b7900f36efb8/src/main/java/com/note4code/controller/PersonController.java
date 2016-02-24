package com.note4code.controller;

import com.note4code.service.IPersonService;
import com.note4code.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by wuzhiyu on 16-1-10.
 */

@Controller
@RequestMapping(value = "/persons")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Map<String, Object> model){
        Person person = new Person();
        List<Person> persons = personService.queryPersonList(person);
        model.put("persons", persons);
        return "persons/list";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(Map<String, Object> model, @PathVariable int id){
        Person person = new Person();
        person.setId(id);
        model.put("person", this.personService.queryPerson(person));
        return "persons/show";
    }

    /*@RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Map<String, Object> model){
        List<Person> persons = this.personService.list();
        model.put("persons", persons);
        return "persons/list";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(Map<String, Object> model, @PathVariable int id){
        model.put("person", this.personService.show(id));
        return "persons/show";
    }*/
}
