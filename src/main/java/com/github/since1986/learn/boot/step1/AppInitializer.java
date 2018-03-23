package com.github.since1986.learn.boot.step1;

import com.github.since1986.learn.boot.step1.controller.ServletConfig;
import com.github.since1986.learn.boot.step1.mapper.MapperConfig;
import com.github.since1986.learn.boot.step1.service.ServiceConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

import static com.github.since1986.learn.boot.step1.AppConstants.DEFAULT_CHARACTER_ENCODING;
import static com.github.since1986.learn.boot.step1.AppConstants.DISPATCHER_SERVLET_MAPPINGS;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class, MyBatisConfig.class, MapperConfig.class, ServiceConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return DISPATCHER_SERVLET_MAPPINGS;
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding(DEFAULT_CHARACTER_ENCODING);
        HttpPutFormContentFilter httpPutFormContentFilter = new HttpPutFormContentFilter();
        return new Filter[]{characterEncodingFilter, httpPutFormContentFilter};
    }
}
