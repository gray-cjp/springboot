package com.cjp.springboot.Contrllo;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserLogin {
    @PostMapping("/user/login")
    public String login(String username, String password, Map<String,Object> map, HttpSession session){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("userLogin",username);
            return "dashboard";
        }else {
            map.put("msg","用户名或者密码错误");
            return "login";
        }
    }
}
