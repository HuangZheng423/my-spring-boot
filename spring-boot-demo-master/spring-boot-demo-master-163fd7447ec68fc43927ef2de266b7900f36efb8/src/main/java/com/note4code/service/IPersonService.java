package com.note4code.service;

import com.note4code.model.Person;

import java.util.List;

/**
 * Created by wuzhiyu on 16-1-10.
 */
public interface IPersonService {
    List<Person> list();
    Person show(int id);
    void add(Person p);
    void update(Person p);
    void destory(int id);
}
