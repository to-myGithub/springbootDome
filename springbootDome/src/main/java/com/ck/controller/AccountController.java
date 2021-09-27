package com.ck.controller;


import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ck.common.msg.Msg;
import com.ck.entity.Account;
import com.ck.service.IAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author springbootdome
 * @since 2021-09-27
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private IAccountService accountService;

    @GetMapping
    public boolean add() {
        Account account = new Account();
        account.setName("chen");
        account.setMoney(6.0);
        return accountService.save(account);
    }

    @GetMapping("list")
    public Msg page(Page<Account> page, Account account) {
        return Msg.ok(accountService.page(page, Wrappers.<Account>lambdaQuery()
                .eq(ObjectUtils.isNotNull(account.getName()), Account::getName, account.getName())
                .eq(ObjectUtils.isNotNull(account.getMoney()), Account::getMoney, account.getMoney())
        ));
    }

}
