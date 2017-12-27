package com.raptorplan.raptorplan.config.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.raptorplan.raptorplan.data.entity.TemplateEntity;
import com.raptorplan.raptorplan.model.customObject.InstitutionalAttribute;
import com.raptorplan.raptorplan.model.customObject.TemplateAttribute;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import com.raptorplan.raptorplan.model.response.TemplateResponse;
import org.json.JSONObject;
import org.springframework.core.convert.converter.Converter;



public class TemplateEntityToTemplateResponse implements Converter<TemplateEntity,TemplateResponse> {
    @Override
    public TemplateResponse convert(TemplateEntity source) {
        AttributeEntityToAttributeResponse converter = new AttributeEntityToAttributeResponse();
        CourseEntityToCourseResponse courseConverter = new CourseEntityToCourseResponse();

        JSONObject response = new JSONObject();
        response.put("major", source.getMajor());

        TemplateAttribute englishFoundation = new TemplateAttribute(source.getEnFoundationCredit(),null);
        TemplateAttribute mathFoundation = new TemplateAttribute(source.getMathFoundationCredit(),null);
        TemplateAttribute speechFoundation = new TemplateAttribute(source.getSpeechFoundationCredit(),null);
        TemplateAttribute artDistribution = new TemplateAttribute(source.getArtDistributionCredit(),null);
        TemplateAttribute behavioralDistribution = new TemplateAttribute(source.getBehavioralDistributionCredit(), null);
        TemplateAttribute humanitiesDistribution = new TemplateAttribute(source.getHumanDistributionCredit(), null);
        TemplateAttribute scienceDistribution = new TemplateAttribute(source.getScienceDistributionCredit(),null);
        TemplateAttribute scienceLabDistribution = new TemplateAttribute(source.getScienceLabDistributionCredit(), null);
        TemplateAttribute majorFoundation = new TemplateAttribute(source.getProgramCredit(),null);
        TemplateAttribute electives = new TemplateAttribute(source.getElectivesCredit(),null);

        InstitutionalAttribute institutionalAttribute = new InstitutionalAttribute(source.getInstitutionalCredit(),null);

        source.getInstAttributes().forEach(e ->{
            institutionalAttribute.addAttribute(converter.convert(e));
        });

//        source.getRequiredCourses().forEach(e ->{
//            CourseResponse course = courseConverter.convert(e);
//            if (course.getAttribute().contains("english_foundation"))
//                englishFoundation.addCourse(course);
//            if (course.getAttribute().contains("math_foundation"))
//                mathFoundation.addCourse(course);
//            if (course.getAttribute().contains("speech_foundation"))
//                speechFoundation.addCourse(course);
//            if (course.getAttribute().contains("art_distribution"))
//                artDistribution.addCourse(course);
//            if (course.getAttribute().contains("behavioral_distribution"))
//                behavioralDistribution.addCourse(course);
//            if (course.getAttribute().contains("humanities_distribution"))
//                humanitiesDistribution.addCourse(course);
//            if (course.getAttribute().contains("natural_science_lab_distribution"))
//                scienceLabDistribution.addCourse(course);
//            if (course.getAttribute().contains("natural_science_distribution"))
//                scienceDistribution.addCourse(course);
//            if (course.getAttribute().contains("major"))
//                majorFoundation.addCourse(course);
//            if (course.getAttribute().contains("electives"))
//                electives.addCourse(course);
//        });
        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValueAsString(englishFoundation);

        JSONObject value = new JSONObject();
        try {
            value.put("math_foundation", new JSONObject(mapper.writeValueAsString(mathFoundation)));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return new TemplateResponse(response);
    }
}
