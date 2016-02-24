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
    public List<Person> queryPersonList(Person person) {
        return mapper.select(person);
    }

    @Override
    public Person queryPerson(Person person) {
        return mapper.selectOne(person);
    }

    @Override
    public Person queryOne(Person record) {
        return null;
    }

    @Override
    public List<Person> queryAll(Person record) {
        return null;
    }

    @Override
    public int queryCount(Person record) {
        return 0;
    }

    @Override
    public Person queryByPrimaryKey(Object key) {
        return null;
    }

    @Override
    public int add(Person record) {
        return 0;
    }

    @Override
    public int addSelective(Person record) {
        return 0;
    }

    @Override
    public int delete(Person record) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Object key) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Person record) {
        return 0;
    }

    @Override
    public int queryCountByExample(Person example) {
        return 0;
    }

    @Override
    public List<Person> queryByExample(Person example) {
        return null;
    }

    /*@Override
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

    }*/
}
