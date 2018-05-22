package com.savion.spring_boot_demo.biz;

import com.savion.spring_boot_demo.bean.DBUser;

public interface UserBIZ {

    DBUser getUser(int id);

    boolean saveUser(DBUser user);

}
