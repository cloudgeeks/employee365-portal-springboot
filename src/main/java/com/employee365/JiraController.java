package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import twitter4j.TwitterException;


@Controller
public class JiraController {

    @RequestMapping("/jira")
    public String openTwitterJSP()  {//TwitterException {
        return "redirect:http://ec2-54-202-30-244.us-west-2.compute.amazonaws.com:8080/plugins/servlet/samlsso";
    }
}
