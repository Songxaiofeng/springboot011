/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: testcontroll
 * Author:   1
 * Date:     2019/4/25 9:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.springboot.controll;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 1
 * @create 2019/4/25
 * @since 1.0.0
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("/test")
public class testcontroll {

    @RequestMapping("/b/{s}")
   // @ResponseBody
    //@RequestParam("s")  String s
    public Object test33(@PathVariable("s") String s) {
       /* Map<String,Object> map= new HashMap<>();
        map.put("wahah",0);*/
        return "hello:+" + s;
    }

    @RequestMapping("/c")
    //@ResponseBody
    public  String tets() {

      //   ModelAndView model =  new ModelAndView();
        System.out.println("进来了");
       // int i = 3/0;
      // model.setViewName("forward:templates/index.html");

        return "index2.html";
    }

/*
    public static void main(String[] args) {

        SpringApplication.run(testcontroll.class);
        System.out.println("====================");

    }
*/

}
