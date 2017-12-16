package com.raptorplan.raptorplan;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBootstrap implements CommandLineRunner {

    CategoryRepository repoCategory;

    AttributeRepository repoAttribute;

    @Autowired
    public DataBootstrap(CategoryRepository repoCategory, AttributeRepository repoAttribute){
        this.repoCategory = repoCategory;
        this.repoAttribute = repoAttribute;
    }
    @Override
    public void run(String... args) throws Exception {

        CategoryEntity entity1 = new CategoryEntity();
        entity1.setName("foundation");
        CategoryEntity entity2 = new CategoryEntity();
        entity2.setName("distribution");
        CategoryEntity entity3 = new CategoryEntity();
        entity3.setName("program");
//        AttributeEntity attribute1 = new AttributeEntity();
//        attribute1.setName("english_foundation");
//        AttributeEntity attribute2 = new AttributeEntity();
//        attribute2.setName("math_foundation");
//        AttributeEntity attribute3 = new AttributeEntity();
//        attribute3.setName("speech_foundation");
//        AttributeEntity attribute4 = new AttributeEntity();
//        attribute4.setName("art_distribution");
//        AttributeEntity attribute5 = new AttributeEntity();
//        attribute5.setName("behavioral_distribution");
//        AttributeEntity attribute6 = new AttributeEntity();
//
//        AttributeEntity attribute7 = new AttributeEntity();
//        AttributeEntity attribute8 = new AttributeEntity();
//        AttributeEntity attribute9 = new AttributeEntity();
//        AttributeEntity attribute10 = new AttributeEntity();


        repoCategory.save(entity1);
        repoCategory.save(entity2);
        repoCategory.save(entity3);

    }
}
