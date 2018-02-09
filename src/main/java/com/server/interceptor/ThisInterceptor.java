package com.server.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
public class ThisInterceptor implements HandlerInterceptor {
    Logger logger = LoggerFactory.getLogger(ThisInterceptor.class);


    /*
     *  进入拦截器要做三件事
     *  1、 判断程序是否已经注册
     *  2、 判断用户是否已经登录
     *  3、 判断用户是否有功能权限
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        logger.info("---进入拦截器--- : " + httpServletRequest.getRequestURI());
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("------postHandle------ : " + httpServletRequest.getRequestURI());
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("------afterCompletion------ : " + httpServletRequest.getRequestURI());
    }
}
