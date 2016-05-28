package com.justSpring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/messages")
public class messageController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getWelcomeMessage(){
        String message="";
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("welcome","this should be rendered using json");
//        return "{  \n" +
//                "   \"message\":{  \n" +
//                "      \"welcome\":\"this should be rendered using json\"\n" +
//                "   }\n" +
//                "}";
//
        return "{  \n" +
                "   \"messages\":{  \n" +
                "      \"message list\":{  \n" +
                "         \"welcome\":\"good to see you in ember world!\",\n" +
                "         \"wish\":\"all the best in the ember world!\"\n" +
                "      }\n" +
                "   }\n" +
                "}";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/message-list")
    @ResponseBody
    public String getMessageList(){
        String message="";
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("welcome","this should be rendered using json");
        return "{  \n" +
                "   \"message list\":{  \n" +
                "      \"welcome\":\"good to see you in ember world!\",\n" +
                "      \"wish\":\"all the best in the ember world!\"\n" +
                "   }\n" +
                "}";
    }

    @RequestMapping(value="my-message", method= RequestMethod.POST)
    @ResponseBody
    public String foo(@RequestBody String customMessage) {
        return "{\"message\":\""+customMessage+"\"}";
    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String homePage(ModelMap modelMap) {
//        modelMap.addAttribute("message", "initial message");
//        return "index";
//    }

}