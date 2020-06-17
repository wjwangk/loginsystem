/**
 * fshows.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.xiaowenzi.example.demo.controller;

import antlr.StringUtils;
import com.sun.org.glassfish.gmbal.ParameterNames;
import com.xiaowenzi.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author mj
 * @version helloWorld.java, v 0.1 2020-05-30 16:22
 */

/**
 * @Controller + @ResponseBody 相当于 @RestController
 * 1。@Controller 和 @ResponseBody 配合使用，若都放在类上，则请求返回类型是value值，而不能是view视图
 * 2。但实际使用中可能用到视图，所以把 @Controller 放在类上，@ResponseBody放在具体需要返回值的方法上
 * 3。
 *
 */

@Controller
//@RequestMapping("/wj")  //作用于类上，则为类中所有方法的请求头（父路径），作为请求地址映射
public class HelloWorldController {

    /**@Autowired 注解的作用是自动匹配，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作
     *  通过 @Autowired的使用来消除 set ，get方法。
     */

    /**private HelloWorldService helloWorldService;
     * 当接口只有一个实现类时，这里的属性名字可以随便写，因为按照类型匹配只有一个；
     * 当接口有多个实现类时，这里的属性名字要和实现类名称一致。  一般保持一致绝对没错啦，例如如下
    */
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")  //作用于方法上，用于处理请求方法中的地址映射
    @ResponseBody
    public String index(@RequestParam("name") String name,
                        @RequestParam("age") Integer age) {
        String result = helloWorldService.sayHello(name, age);
        return result;
    }

    @RequestMapping("/say")
//    @ResponseBody   加上此注释，则返回类型为值类型，不加可以是视图
    /**classpath:/templates/success.html   在类路径下的template文件夹下添加 success.html文件，
       注意文件名称必须和返回值的名称相同，返回 success就要写 success.html
     */
    public String success(Map<String,Object> map){
        map.put("hello","你好");
       return "success";
     //   return "backstage";
    }


    @RequestMapping("/login1")
    @ResponseBody
    public String indexPage(String name, String pwd){
        return helloWorldService.login1(name,pwd);
    }

    @RequestMapping("/login")
    public String login(@RequestParam("name") String name,
                        @RequestParam("pwd") String pwd,
                        Model model, HttpSession session){
        if( name.length()!=0 && "123456".equals(pwd)){
            session.setAttribute("loginUser",name);
            return "backstage";

        }else

            model.addAttribute("用户名或密码错误");
            model.addAttribute("msg","用户名或密码错误");
            return "success";


    }

}