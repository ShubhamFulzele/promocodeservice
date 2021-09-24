/**
 * @Copyright 2021.  Citibank pvt. ltd
 *you should not disclose this info outside
 *otherwise terms and condition will apply
 */
package com.citibank.offers.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Shubham by 17-Sep-2021
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.citibank.offers.controller")
public class PromocodeMvcConfig {

}
