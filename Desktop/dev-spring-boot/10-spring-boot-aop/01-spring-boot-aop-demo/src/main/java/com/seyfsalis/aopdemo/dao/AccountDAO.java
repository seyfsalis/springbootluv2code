package com.seyfsalis.aopdemo.dao;

import com.seyfsalis.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}
