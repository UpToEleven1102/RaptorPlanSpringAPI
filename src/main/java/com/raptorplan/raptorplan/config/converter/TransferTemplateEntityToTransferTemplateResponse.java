package com.raptorplan.raptorplan.config.converter;

import com.raptorplan.raptorplan.data.entity.TransferTemplateEntity;
import com.raptorplan.raptorplan.model.customObject.AttributeCustom;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import com.raptorplan.raptorplan.model.response.SemesterTemplateResponse;
import com.raptorplan.raptorplan.model.response.TransferTemplateResponse;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class TransferTemplateEntityToTransferTemplateResponse implements Converter<TransferTemplateEntity,TransferTemplateResponse> {
    AttributeEntityToAttributeCustom converterAttribute = new AttributeEntityToAttributeCustom();
    MajorEntityToMajorResponse converterMajor = new MajorEntityToMajorResponse();
    UniversityEntityToUniversityResponse converterUniversity = new UniversityEntityToUniversityResponse();
    CourseEntityToCourseResponse converterCourse = new CourseEntityToCourseResponse();

    @Override
    public TransferTemplateResponse convert(TransferTemplateEntity source) {
        TransferTemplateResponse response = new TransferTemplateResponse();
        response.setId(source.getId());
        response.setMajor(converterMajor.convert(source.getMajor()));
        response.setUniversity(converterUniversity.convert(source.getUniversity()));
        List<SemesterTemplateResponse> semesters = new ArrayList<>();
        source.getSemesters().forEach(e -> {
            SemesterTemplateResponse semesterResponse = new SemesterTemplateResponse();
            List<AttributeCustom> attributeResponses = new ArrayList<>();
            e.getAttributes().forEach(attribute -> {
                attributeResponses.add(converterAttribute.convert(attribute));
            });

            List<CourseResponse> courseResponses = new ArrayList<>();
            e.getCourses().forEach(course -> {
                courseResponses.add(converterCourse.convert(course));
            });

            semesterResponse.setCourses(courseResponses);
            semesterResponse.setAttributes(attributeResponses);
            semesters.add(semesterResponse);
        });

        response.setSemesters(semesters);
        return response;
    }
}
