package com.savion.spring_boot_demo.biz.imp;

import com.savion.spring_boot_demo.bean.DBUser;
import com.savion.spring_boot_demo.biz.UserBIZ;
import com.savion.spring_boot_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("IUserBiz")
public class UserImp implements UserBIZ {

    private @Autowired
    UserMapper userMapper;

    @Override
    public DBUser getUser(int id) {
        DBUser user = userMapper.getUserByID(id);
        return user;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean saveUser(DBUser user) {
        return userMapper.saveUser(user);
    }
}
