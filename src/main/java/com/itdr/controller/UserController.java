package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/portal/users/")
public class UserController {
    @Autowired
    UserService userService;
    //用户登录
    @RequestMapping("login.action")
    public ModelAndView login(String uname, String psd, HttpSession session){
        ModelAndView mav=new ModelAndView();
        Users users=userService.login(uname,psd);
        if(users==null){
            mav.addObject("msg","登录失败，请重新登录！");
            mav.setViewName("index");
            return mav;
        }
        //如果用户登录成功，保留用户信息
        session.setAttribute("user",users);
        mav.setViewName("home");
        return mav;
    }
    //用户存钱
    @RequestMapping("setMoney.action")
    public ModelAndView setMoney(String uname, double money,HttpSession session){
        ModelAndView mav=new ModelAndView();
        //此处可以做用户是否登录的验证
        Users u=(Users)session.getAttribute("user");
        //执行业务层操作
        int i=userService.setMoney(u.getUname(),money);
        session.setAttribute("user",u);
        //返回前端，跳转页面
        mav.setViewName("home");
        if(i<=0) {
            mav.addObject("msg", "存款失败！请查询问题！");
            return mav;
        }
        mav.addObject("msg","存款成功！");
        u.setMoney(u.getMoney()+money);
        session.setAttribute("user",u);
        return mav;
    }
    //用户取钱
    @RequestMapping("getMoney.action")
    public ModelAndView getMoney(String uname, double money,HttpSession session){
        ModelAndView mav=new ModelAndView();
        //此处可以做用户是否登录的验证
        Users u=(Users)session.getAttribute("user");
        //执行业务层操作
        int i=userService.getMoney(u.getUname(),money);
        session.setAttribute("user",u);
        //返回前端，跳转页面
        mav.setViewName("home");
        if(i<=0) {
            mav.addObject("msg", "取款失败！请查询问题！");
            return mav;
        }
        mav.addObject("msg","取款成功！");
        u.setMoney(u.getMoney()-money);
        session.setAttribute("user",u);
        return mav;
    }
    //用户转账
    @RequestMapping("atob.action")
    public ModelAndView aToB(String bname, double money,HttpSession session){
        ModelAndView mav=new ModelAndView();
        //此处可以做用户是否登录的验证
        Users u=(Users)session.getAttribute("user");
        //执行业务层操作
        int i=userService.aTob(u.getUname(),bname,money);
        //返回前端，跳转页面
        mav.setViewName("home");
        if(i<=1) {
            mav.addObject("msg", "转账失败！请查询问题！");
            return mav;
        }
        mav.addObject("msg","转账成功！");
        u.setMoney(u.getMoney()-money);
        session.setAttribute("user",u);
        return mav;
    }
}
