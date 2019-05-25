/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: usercontrol
 * Author:   1
 * Date:     2019/4/23 17:13
 * Description: usercontrol
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.springboot.controll;

import com.java.springboot.beans.User;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;//wqewqe
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * 〈一句话功能简述〉<br>
 * 〈usercontrol〉
 *
 * @author 1
 * @create 2019/4/23
 * @since 1.0.0
 */
@Controller
@EnableAutoConfiguration
public class usercontrol {

    private  String name;

    @RequestMapping("/user")
    @ResponseBody
    public String test2() {
        System.out.println("测试asa");
        return "你好啊，springboot";
    }

    @RequestMapping("/user2")
    @ResponseBody
    public String test1(){

        String a=null;
        if("zs".equals(a)){
            return  "哈哈哈";
        }

        System.out.println("测试2");
        return "你好！！！";

    }
    @RequestMapping("/userList")
   public String userlist(Model model){
        List<User> list= new ArrayList<>();
        List<User> list2= new ArrayList<>();
        User u1=new User("zhangsan",1,"男");
        User u2=new User("历史",2,"女");
        User u3=new User("wangwu",3,"女");
        User u4=new User("zhaoliu",4,"男");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);

        list2.add(u1);

        model.addAttribute("usernames",list);
        return  "user/userList";
    }

}
