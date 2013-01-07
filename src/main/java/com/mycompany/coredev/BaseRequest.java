package com.mycompany.coredev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BaseRequest {
    @RequestMapping("/")
    public String home() {
        return "base";
    }
}
