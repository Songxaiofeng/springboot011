package com.java.springboot;
import com.java.springboot.controll.testcontroll;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import javax.annotation.Resource;
import java.lang.reflect.Type;

/**
 * Hello world!
 * freemaker :下一步继续1学习这个模板引擎
 */
@EnableAutoConfiguration
@ComponentScan("com.java.springboot")
//@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        SpringApplication.run(App.class);
        System.out.println("======over=======");
    }
}
