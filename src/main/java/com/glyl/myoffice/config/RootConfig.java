package com.glyl.myoffice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jay on 2017/2/7.
 *
 * @author jay
 */
@Configuration
@ComponentScan(basePackages = {"com.glyl.myoffice"},
		excludeFilters = {
				@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
		})
public class RootConfig {






}
