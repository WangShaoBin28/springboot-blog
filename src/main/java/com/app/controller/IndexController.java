package com.app.controller;

import com.app.entity.UserEntity;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @Package com.app.controller
 * @ClassName index
 * @Author shaobin.wang
 * @Date 2019/03/22 10:23
 * @Version 1.0
 * @Description:
 **/
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("userList", userService.findAll());
        return "index";
    }

    @PostMapping("/saveUser")
    public String saveUser(UserEntity userEntity) {
        userService.save(userEntity);
        return "redirect:/";
    }

    @GetMapping("/from")
    public String from() {
        return "from";
    }
}
