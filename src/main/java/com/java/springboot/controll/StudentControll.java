/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StudentControll
 * Author:   1
 * Date:     2019/4/25 10:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.springboot.controll;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 1
 * @create 2019/4/25
 * @since 1.0.0
 */
@Controller
@RequestMapping("/student")
public class StudentControll {
    @RequestMapping(value = {"/", "/jsp"})
    public String view(Map<String, Object> map) {
        map.put("name", "SpringBoot");
        map.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "index2";
    }
}
