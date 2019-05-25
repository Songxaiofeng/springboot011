/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: test
 * Author:   1
 * Date:     2019/4/28 17:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.java.springboot.beans.Student;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 1
 * @create 2019/4/28
 * @since 1.0.0
 */
public class test {



    @Test
    public void test1(){
        int i =1;
        i=++i;
        System.out.println("i="+i);
        i=i++;
        i=i;
        System.out.println("i3"+i);
        System.out.println("==========");
        int j =i++;
        System.out.println("j="+j+"i2="+i);
        int k = i+++i*i++;
        System.out.println(k);
    }

    @Test
    public void test2(){

        int sum=0;
        int n;
        System.out.print("请输入n的值");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            sum=sum+(-1)^n;
        }
    }

    @Test
    public void test3(){
        System.out.println("test3的  n  的值 ：");
        int sum;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0)
             {
                 sum=1;
             }
        else sum=0;
        System.out.print("最后的sum的值为："+sum);
    }


    @Test
    public void test4(){
        Object[] object = new Object[5];

       object[0]="hahha";
       object[1]=123;
       object[2]=true;
       object[3]='a';
       object[4]=1;

       for(Object a:object){

           System.out.println(a);
       }
    }
    @Test
    public void test5(){
    String s1="a";
    String s2=s1+"b";
    String s3="a"+"b";
    String s4= new String("ab");
    System.out.println(s2=="ab");

    System.out.println(s3=="ab");

    System.out.println(s2==s3);

    System.out.println("s2=s4"+s2==s4);
    System.out.println("3=s4"+s3==s4);
    }


}
