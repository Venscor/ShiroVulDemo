package com.jadyer.demo.controller;

import org.apache.shiro.io.ClassResolvingObjectInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName Test
 * @Description TODO
 * @Author wangyu89
 * @Create Time 2019/4/23 10:55
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassResolvingObjectInputStream c = new ClassResolvingObjectInputStream(new FileInputStream("D:\\vul_analysis\\weblogic\\poc\\lib\\e.txt"));
        c.readObject();

//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\vul_analysis\\weblogic\\poc\\lib\\d.txt"));
//        objectInputStream.readObject();
    }
}
