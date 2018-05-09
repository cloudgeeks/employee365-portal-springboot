package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class SlackController {

    @RequestMapping("/slack")
    public String openTwitterJSP()  {//TwitterException {
        return "redirect:https://employee-365.auth0.com/samlp/4ILJolQg0APe7JFOi2rFGCUSmxTvBJac?connection=Username-Password-Authentication";
    }
}