/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: commonexpections
 * Author:   1
 * Date:     2019/4/25 15:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.springboot.Expections;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 1
 * @create 2019/4/25
 * @since 1.0.0
 */
@ControllerAdvice
public class commonexpections {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exception(){
        Map<String,Object> map = new HashMap<>();

        map.put("code",-1);
        map.put("msg","服务器错误！！！");

        return  map;


    }

}
