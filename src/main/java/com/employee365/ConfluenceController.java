package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import twitter4j.TwitterException;


@Controller
public class ConfluenceController {

    @RequestMapping("/confluence")
    public String openConfluenceJSP()  {
        return "redirect:http://ec2-18-237-171-207.us-west-2.compute.amazonaws.com:8090/plugins/servlet/samlsso";
    }
}
