package com.note4code.service;

import com.note4code.mapper.PersonMapper;
import com.note4code.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wuzhiyu on 16-1-10.
 */

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper mapper;

    @Override
    public List<Person> list() {
        List<Person> persons = mapper.getAllPeronInfo();
        return persons;
    }

    @Override
    public Person show(int id) {
        return this.mapper.getPersonInfo(id);
    }

    @Override
    public void add(Person p) {

    }

    @Override
    public void update(Person p) {

    }

    @Override
    public void destory(int id) {

    }
}
