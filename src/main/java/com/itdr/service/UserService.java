package com.itdr.service;

import com.itdr.pojo.Users;

public interface UserService {
    //用户登录
    Users login(String uname,String psd);
    //用户存钱
    int setMoney(String uname,double money);
    //用户取钱
    int getMoney(String uname,double money);
    //用户转账
    int aTob(String aname,String bname,double money);
}
