package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.MajorEntity;
import com.raptorplan.raptorplan.data.entity.McAdvisingTemplateEntity;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.customObject.AttributeCustom;
import com.raptorplan.raptorplan.model.customObject.MajorCustom;
import com.raptorplan.raptorplan.model.response.CourseInfoMcTemplateResponse;
import com.raptorplan.raptorplan.model.response.McAdvisingTemplateResponse;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class McAdvisingTemplateEntityToMcAdvisingTemplateResponse implements Converter<McAdvisingTemplateEntity,McAdvisingTemplateResponse> {
    AttributeEntityToAttributeCustom converterAttribute = new AttributeEntityToAttributeCustom();
    CourseInfoTemplateToCourseInfoTemplateResponse converterCourseInfo = new CourseInfoTemplateToCourseInfoTemplateResponse();

    @Override
    public McAdvisingTemplateResponse convert(McAdvisingTemplateEntity source) {
        McAdvisingTemplateResponse response = new McAdvisingTemplateResponse();

        response.setId(source.getId());

        MajorEntity sourceMajor = source.getMajor();
        MajorCustom majorResponse = new MajorCustom(sourceMajor.getId(),sourceMajor.getCode(), sourceMajor.getName());
        Links majorLink = new Links();
        Self majorSelf = new Self();
        majorSelf.setRef(ResourceConstant.MAJOR_PATH + "/" + sourceMajor.getId());
        majorLink.setSelf(majorSelf);
        majorResponse.setLinks(majorLink);
        response.setMajor(majorResponse);
        response.setInstCredit(source.getInstCredit());


        List<AttributeCustom> attributes = new ArrayList<>();
        source.getInstAttributes().forEach(e -> {
            attributes.add(converterAttribute.convert(e));
        });
        response.setInstAttributes(attributes);

        List<CourseInfoMcTemplateResponse> courseInfo = new ArrayList<>();
        source.getCourseInfo().forEach(e -> {
            courseInfo.add(converterCourseInfo.convert(e));
        });
        response.setCourseInfo(courseInfo);
        return response;
    }
}
