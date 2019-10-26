package com.itdr.service;

import com.itdr.mapper.UsersMapper;
import com.itdr.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public Users login(String uname,String psd) {
        Users u=null;
        //参数是否为空判断(uname,psd)
        if(StringUtils.isEmpty(uname)){
            return u;
        }
        if(StringUtils.isEmpty(psd)){
            return u;
        }
        u=usersMapper.selectByUnameAndPsd(uname,psd);
        return u;
    }
    //存钱
    @Override
    public int setMoney(String uname, double money) {
        if(money<=0){
            return 0;
        }
        int i=usersMapper.updateByUname(uname,money,0);
        return i;
    }
    //取钱
    @Override
    public int getMoney(String uname, double money) {
        if(money<=0){
            return 0;
        }
        int i=usersMapper.updateByUname(uname,money,1);
        return i;
    }
    //转账
    @Override
    public int aTob(String aname, String bname, double money) {
        if(money<=0){
            return 0;
        }
        int i=usersMapper.updateByUname(aname,money,1);//A用户扣钱
        int i2=usersMapper.updateByUname(bname,money,0);//B用户加钱
        return i+i2;
    }
}
