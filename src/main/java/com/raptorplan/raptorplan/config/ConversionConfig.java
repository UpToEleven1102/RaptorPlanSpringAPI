package com.raptorplan.raptorplan.config;

import com.raptorplan.raptorplan.auth.converter.*;
import com.raptorplan.raptorplan.config.converter.*;
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
        converters.add(new CourseRequestToCourseEntity());
        converters.add(new CourseEntityToCourseResponse());
        converters.add(new DisciplineEntityToDisciplineResponse());
        converters.add(new DisciplineRequestToDisciplineEntity());
        converters.add(new MajorEntityToMajorResponse());
        converters.add(new MajorRequestToMajorEntity());
        converters.add(new UniversityEntityToUniversityResponse());
        converters.add(new UniversityRequestToUniversityEntity());
        converters.add(new McAdvisingTemplateEntityToMcAdvisingTemplateResponse());
        converters.add(new AttributeEntityToAttributeCustom());
        converters.add(new CourseInfoTemplateToCourseInfoTemplateResponse());
        converters.add(new McTemplateEntityToMcTemplateResponse());
        converters.add(new UserRequestToUserEntityConverter());
        converters.add(new UserEntityToUserResponseConverter());
        converters.add(new RoleEntityToRoleResponse());
        converters.add(new RoleRequestToRoleEntity());
        converters.add(new RoleEntityToRoleCustom());
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
