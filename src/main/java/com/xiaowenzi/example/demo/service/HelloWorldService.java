/**
 * fshows.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.xiaowenzi.example.demo.service;

import org.springframework.ui.Model;

/**
 *
 * @author mj
 * @version HelloWordService.java, v 0.1 2020-06-06 14:20
 */
public interface HelloWorldService {

    String sayHello(String name, Integer age);

    String login(String userName, String passWord,Model model);

    String login1(String usname,String pwd);
}