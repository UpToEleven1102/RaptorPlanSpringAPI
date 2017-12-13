package com.raptorplan.raptorplan.config;

import com.raptorplan.raptorplan.config.converter.AttributeEntityToAttributeResponse;
import com.raptorplan.raptorplan.config.converter.AttributeRequestToAttributeEntity;
import com.raptorplan.raptorplan.config.converter.CourseEntityToCourseResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;


import java.util.HashSet;
import java.util.Set;

@Configuration
public class ConversionConfig {
    public Set<Converter> getConverters(){

        Set<Converter> converters = new HashSet<>();
        converters.add(new AttributeRequestToAttributeEntity());
        converters.add(new AttributeEntityToAttributeResponse());
        converters.add(new CourseEntityToCourseResponse());
        return converters;
    }

    @Bean
    public ConversionService conversionService(){
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        bean.setConverters(getConverters());
        bean.afterPropertiesSet();
        return bean.getObject();
    }
}
