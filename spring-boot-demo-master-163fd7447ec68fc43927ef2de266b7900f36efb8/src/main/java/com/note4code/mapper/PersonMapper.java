package com.note4code.mapper;

import com.github.abel533.mapper.Mapper;
import com.note4code.model.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wuzhiyu on 16-1-10.
 */
public interface PersonMapper extends Mapper<Person>{
    /*@Select("select id, name, phone, email from person")
    List<Person> getAllPeronInfo();

    @Select("select id, name, phone, email from person where id = ${id}")
    Person getPersonInfo(@Param("id")int id);*/
}
