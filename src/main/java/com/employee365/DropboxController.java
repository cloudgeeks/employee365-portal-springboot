package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import twitter4j.TwitterException;


@Controller
public class DropboxController {



       // return "redirect:https://www.dropbox.com/sso/360357791";

    @RequestMapping("/dropbox")
    public String openDropBox()  {
        return "redirect:https://www.dropbox.com/sso/24645463274";
    }
}
