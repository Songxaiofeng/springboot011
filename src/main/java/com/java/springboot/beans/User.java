/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   1
 * Date:     2019/4/24 20:17
 * Description: User
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.springboot.beans;

/**
 * 〈一句话功能简述〉<br> 
 * 〈User〉
 *
 * @author 1
 * @create 2019/4/24
 * @since 1.0.0
 */
public class User {
    private String name ;
    private  int id ;
    private String sex;

    public User() {
    }

    public User(int id, String sex) {
        this.id = id;
        this.sex = sex;
    }

    public User(String name, int id, String sex) {
        this.name = name;
        this.id = id;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
