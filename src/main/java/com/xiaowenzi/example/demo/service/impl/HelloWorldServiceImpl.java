/**
 * fshows.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.xiaowenzi.example.demo.service.impl;

import com.xiaowenzi.example.demo.service.HelloWorldService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author mj
 * @version HelloWorldServiceImpl.java, v 0.1 2020-06-06 14:22
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    public static final Map<String, String> userMap = new HashMap<>();

    static {
        userMap.put("mj", "123");
        userMap.put("xiaoming", "1234");
        userMap.put("zhangsan", "123");
        userMap.put("lisi", "12345");
        userMap.put("wwj", "123");
    }


    @Override
    public String sayHello(String name, Integer age) {
        return "hello " + name + ", I am " + age + " years old";
    }

    @Override
    public String login(String name, String pwd) {
        String result = "用户名或密码错误";
        if (userMap.containsKey(name) && userMap.get(name).equals(pwd)) {
            result = "恭喜" + name + "登陆成功";
        }
        return result;
    }

    @Override
    public String login1(String usname,String pwd){

        Set<String> set = userMap.keySet();   //获取map中key键的集合
        for(String key:set)  //遍历map中的key
            if(usname.equals(key)){
                String value = userMap.get(key);   //获取map中key对应的value值
                if(pwd.equals(value)){

                    return  "恭喜" + usname + "登陆成功";

                }
                return  "用户名或密码错误";
            }
        return "您输入的用户不存在";
    }
}