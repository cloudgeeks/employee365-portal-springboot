package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import twitter4j.TwitterException;



@Controller
public class JenkinsController {

    @RequestMapping("/jenkins")
    public String openJenkinsJSP()  {//TwitterException {
        return "redirect:http://34.209.93.161:8080";
    }
}
