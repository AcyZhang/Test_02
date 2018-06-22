package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by AcY on 2018/6/22.
 */
@Controller
@RequestMapping("/sys")
public class controller {
    @RequestMapping("/index")
    public  String index()
    {
        return "index";
    }
}
