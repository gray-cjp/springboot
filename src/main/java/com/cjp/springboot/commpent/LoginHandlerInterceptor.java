package com.cjp.springboot.commpent;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object User = request.getSession().getAttribute("userLogin");
        if (StringUtils.isEmpty(User)){
            return false;
        } else {
            return true;
        }
    }
}
