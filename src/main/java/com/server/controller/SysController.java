package com.server.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;

@Controller
@RequestMapping("/sys")
public class SysController {

    /**
     * 获取Cpu序列号
     * @return
     */
    @RequestMapping(value = "/cpu", method = {RequestMethod.GET, RequestMethod.POST}) @ResponseBody
    public String getCpu(){
        try {
            long start = System.currentTimeMillis();
            Process process = Runtime.getRuntime().exec(new String[]{"wmic", "cpu", "get", "ProcessorId"});
            process.getOutputStream().close();
            Scanner sc = new Scanner(process.getInputStream());
            String property = sc.next();
            String serial = sc.next();
            System.out.println(property + ": " + serial);
            System.out.println("time:" + (System.currentTimeMillis() - start));
            return serial;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return "";
        }
    }
}
