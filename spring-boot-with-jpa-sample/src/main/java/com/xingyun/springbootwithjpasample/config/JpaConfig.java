package com.xingyun.springbootwithjpasample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author 星云
 * @功能
 * @date 10/1/2019 5:45 PM
 */
@EnableJpaRepositories(basePackages = "com.xingyun.springbootwithjpasample.dao.jpa")
@Configuration
public class JpaConfig {}