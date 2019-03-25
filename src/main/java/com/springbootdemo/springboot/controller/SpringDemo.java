package com.springbootdemo.springboot.controller;

import com.springbootdemo.springboot.entity.TestVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class SpringDemo {
    @RequestMapping("/index")
    @ResponseBody
    public  String index(){
        return  "hello world";
    }

    @RequestMapping("/test")
    public String test(){
        return  "aaa";
    }
/*
* 首页
* */
    @RequestMapping("/")
    public  String page(ModelMap map){
        ArrayList<TestVo> arrayList = new ArrayList<>();
        arrayList.add(new TestVo("数学",10,1,new Date()));
        arrayList.add(new TestVo("语文",90,2,new Date()));
        arrayList.add(new TestVo("英语",68,1,new Date()));

        for (int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i).getScore());

        }
        map.put("test",arrayList);
        map.put("msgUtext","<b> 1111 </b>");

        return  "system/index";
    }

    /*
    * 跳转
    *
    * */
    @RequestMapping("/redirect")
    public  String page2(){
        return "redirect/redirect";
    }

    /*
    *
    * 视图
    * */
    @RequestMapping("/model")
    public String page3(Model model){
        boolean testBoolean = true;

        model.addAttribute("name","sss");
        model.addAttribute("testBoolean",testBoolean);
        return  "hello";
    }
}
