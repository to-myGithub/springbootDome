package com.ck.service.impl;

import com.ck.entity.Account;
import com.ck.mapper.AccountMapper;
import com.ck.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author springbootdome
 * @since 2021-09-27
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
