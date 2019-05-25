/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Student
 * Author:   1
 * Date:     2019/5/17 9:43
 * Description: Student
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.springboot.beans;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Student〉
 *
 * @author 1
 * @create 2019/5/17
 * @since 1.0.0
 */
public class Student {

    private int id;
    private  String name;

    public Student() {
        super();
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }





}
