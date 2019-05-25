/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: controller
 * Author:   1
 * Date:     2019/4/23 16:52
 * Description: controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.springboot.controll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈controller〉
 *
 * @author 1
 * @create 2019/4/23
 * @since 1.0.0
 */


//这里如果开发的是API最好是使用rest风格 开发后台的时候最好使用control
@Controller
@EnableAutoConfiguration
@RequestMapping
public class controller {
    @RequestMapping("/aa/username={username}/id={id}")
    @ResponseBody
    public Map<String, Object> test(@PathVariable("username") String username, @PathVariable("id") String id) {
        Map<String, Object> map = new HashMap<>();
        System.out.println("合理咯");
        if ("zs".equals(username) && "123".equals(id)) {

            map.put("code", 0);
            map.put("msg", "登陆成功！！");

        } else {
            map.put("code", 1);
            map.put("msg", "登陆失败！！");
        }

        return map;
    }


  /*  public static void main(String[] args) {


        SpringApplication.run(controller.class);
        System.out.println("结束了吗？");
    }
*/
}
