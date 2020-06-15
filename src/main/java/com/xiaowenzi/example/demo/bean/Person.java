/**
 * fshows.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.xiaowenzi.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.print.attribute.IntegerSyntax;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mj
 * @version Person.java, v 0.1 2020-06-06 11:52
 */

@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String,Object> map;
    private List<Object> list;
    private Dog dog;


    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    /**
     * Setter method for property <tt>lastName</tt>.
     *
     * @param lastName value to be assigned to property lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Setter method for property <tt>age</tt>.
     *
     * @param age value to be assigned to property age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Setter method for property <tt>boss</tt>.
     *
     * @param boss value to be assigned to property boss
     */
    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    /**
     * Setter method for property <tt>birth</tt>.
     *
     * @param birth value to be assigned to property birth
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * Setter method for property <tt>map</tt>.
     *
     * @param map value to be assigned to property map
     */
    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    /**
     * Setter method for property <tt>list</tt>.
     *
     * @param list value to be assigned to property list
     */
    public void setList(List<Object> list) {
        this.list = list;
    }

    /**
     * Setter method for property <tt>dog</tt>.
     *
     * @param dog value to be assigned to property dog
     */
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    /**
     * Getter method for property <tt>lastName</tt>.
     *
     * @return property value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Getter method for property <tt>age</tt>.
     *
     * @return property value of age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Getter method for property <tt>boss</tt>.
     *
     * @return property value of boss
     */
    public Boolean getBoss() {
        return boss;
    }

    /**
     * Getter method for property <tt>birth</tt>.
     *
     * @return property value of birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * Getter method for property <tt>map</tt>.
     *
     * @return property value of map
     */
    public Map<String, Object> getMap() {
        return map;
    }

    /**
     * Getter method for property <tt>list</tt>.
     *
     * @return property value of list
     */
    public List<Object> getList() {
        return list;
    }

    /**
     * Getter method for property <tt>dog</tt>.
     *
     * @return property value of dog
     */
    public Dog getDog() {
        return dog;
    }
}