package com.nowcoder.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: AlphaController
 * Package: com.nowcoder.community.community.controller
 * Description:
 *
 * @Author wmy
 * @Create 2023/6/10 17:07
 */
@Controller
@RequestMapping("/alpha")
public class AlphaController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){return "Hello Spring Boot";}


}
