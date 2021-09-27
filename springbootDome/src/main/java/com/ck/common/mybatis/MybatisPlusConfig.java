package com.ck.common.mybatis;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.ck.common.constant.Constants;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis-plus 分页插件
 *
 * @author ck
 * @since 16:40 2021/9/27
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * 分页插件
     *
     * @return PaginationInterceptor
     */
    @Bean
    @ConditionalOnMissingBean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //分页最多10000一页
        paginationInterceptor.setLimit(Constants.TEN_THOUSAND);
        return new PaginationInterceptor();
    }
}
