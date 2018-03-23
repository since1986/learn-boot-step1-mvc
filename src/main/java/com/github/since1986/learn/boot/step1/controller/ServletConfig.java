package com.github.since1986.learn.boot.step1.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.util.UrlPathHelper;

import java.nio.charset.Charset;
import java.util.List;

import static com.github.since1986.learn.boot.step1.AppConstants.*;

@ComponentScan
@Configuration //ServletConfig与其他Config不在相同的Context，因此定义在其中的Bean在别的Config中是找不到的，如果要定义通用的Bean不要在这里定义
public class ServletConfig extends DelegatingWebMvcConfiguration {

    private final ObjectMapper objectMapper;

    @Autowired
    public ServletConfig(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(!ENABLE_MATRIX_VARIABLES); //相当于命名空间设置中的enable-matrix-variables
        configurer.setUrlPathHelper(urlPathHelper);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter(objectMapper));
        converters.add(new ByteArrayHttpMessageConverter());
        converters.add(new BufferedImageHttpMessageConverter());
        converters.add(new StringHttpMessageConverter(Charset.forName(DEFAULT_CHARACTER_ENCODING)));
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(RESOURCE_HANDLER_PATH_PATTERNS).addResourceLocations(RESOURCE_HANDLER_RESOURCE_LOCATIONS);
    }
}
