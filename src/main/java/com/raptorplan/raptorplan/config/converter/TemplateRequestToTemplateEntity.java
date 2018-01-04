package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.McTemplateEntity;
import com.raptorplan.raptorplan.model.request.McTemplateRequest;
import org.springframework.core.convert.converter.Converter;

public class TemplateRequestToTemplateEntity implements Converter<McTemplateRequest,McTemplateEntity>{

    @Override
    public McTemplateEntity convert(McTemplateRequest source) {
        McTemplateEntity entity = new McTemplateEntity();
        return entity;
    }
}
