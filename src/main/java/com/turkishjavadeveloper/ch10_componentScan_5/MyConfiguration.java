package com.turkishjavadeveloper.ch10_componentScan_5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(useDefaultFilters = false)
@ComponentScan(useDefaultFilters = false, basePackages = "com.turkishjavadeveloper.branch")
public class MyConfiguration {
}
