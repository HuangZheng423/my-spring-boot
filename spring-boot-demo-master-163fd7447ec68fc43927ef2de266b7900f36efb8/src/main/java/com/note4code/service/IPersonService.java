package com.note4code.service;

import com.note4code.common.BasicService;
import com.note4code.model.Person;

import java.util.List;

/**
 * Created by wuzhiyu on 16-1-10.
 */
public interface IPersonService extends BasicService<Person> {
    /*List<Person> list();
    Person show(int id);
    void add(Person p);
    void update(Person p);
    void destory(int id);*/
    public List<Person> queryPersonList(Person person);
    public Person queryPerson(Person person);
}
