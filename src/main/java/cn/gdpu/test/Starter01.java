package cn.gdpu.test;

import cn.gdpu.App;
import cn.gdpu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:ws
 * @Date:2021/3/1
 * @description:learning
 */
public class Starter01 {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService= (UserService) ac.getBean("userService");
        UserService userService2= (UserService) ac.getBean("userService");
        userService.test();
        userService2.test();
    }
}
