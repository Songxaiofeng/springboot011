/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: testCoontrol02
 * Author:   1
 * Date:     2019/5/25 17:10
 * Description: 似的撒旦
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.springboot.controll;

import com.java.springboot.beans.Student;
import com.java.springboot.beans.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈似的撒旦〉
 *
 * @author 1
 * @create 2019/5/25
 * @since 1.0.0
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("test2/")
public class testCoontrol02 {

    @RequestMapping("a")
    @ResponseBody
    public Map<String, Object> test1(){

         System.out.println("测试代码 okkk");
        Map<String,Object> map1 = new HashMap<>();
        map1.put("1","你好啊 ");
        map1.put("2",2);
        map1.put("3",new Student(1,"张三"));
        map1.put("5",new User("李四",2,"女"));

        return map1;
    }

}
