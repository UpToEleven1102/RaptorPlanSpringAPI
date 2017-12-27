package com.raptorplan.raptorplan;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.DisciplineEntity;
import com.raptorplan.raptorplan.data.repository.AttributeRepository;
import com.raptorplan.raptorplan.data.repository.DisciplineRepository;
import org.springframework.boot.CommandLineRunner;

//@Component
public class DataBootstrap implements CommandLineRunner {

    DisciplineRepository repoDiscipline;
    AttributeRepository repoAttribute;

//    @Autowired
    public DataBootstrap( AttributeRepository repoAttribute, DisciplineRepository repoDiscipline){
        this.repoAttribute = repoAttribute;
        this.repoDiscipline = repoDiscipline;
    }
    @Override
    public void run(String... args) throws Exception {

        AttributeEntity attribute1 = new AttributeEntity();
        attribute1.setCode("english_foundation");
        attribute1.setName("English Foundation");
        AttributeEntity attribute2 = new AttributeEntity();
        attribute2.setCode("math_foundation");
        attribute2.setName("Math Foundation");
        AttributeEntity attribute3 = new AttributeEntity();
        attribute3.setCode("speech_foundation");
        attribute3.setName("Speech Foundation");
        AttributeEntity attribute4 = new AttributeEntity();
        attribute4.setCode("art_distribution");
        attribute4.setName("Art Distribution");
        AttributeEntity attribute5 = new AttributeEntity();
        attribute5.setCode("behavioral_distribution");
        attribute5.setName("Behavioral Distribution");
        AttributeEntity attribute6 = new AttributeEntity();
        attribute6.setCode("humanities_distribution");
        attribute6.setName("Humanities Distribution");
        AttributeEntity attribute7 = new AttributeEntity();
        attribute7.setCode("natural_science_lab_distribution");
        attribute7.setName("Natural Science with Lab Distribution");
        AttributeEntity attribute8 = new AttributeEntity();
        attribute8.setCode("natural_science_distribution");
        attribute8.setName("Natural Science Distribution");
        AttributeEntity attribute9 = new AttributeEntity();
        attribute9.setCode("major");
        attribute9.setName("Major Requirement");
        AttributeEntity attribute10 = new AttributeEntity();
        attribute10.setCode("electives");
        attribute10.setName("Electives");

        repoAttribute.save(attribute1);
        repoAttribute.save(attribute2);
        repoAttribute.save(attribute3);
        repoAttribute.save(attribute4);
        repoAttribute.save(attribute5);
        repoAttribute.save(attribute6);
        repoAttribute.save(attribute7);
        repoAttribute.save(attribute8);
        repoAttribute.save(attribute9);
        repoAttribute.save(attribute10);

        repoDiscipline.save(new DisciplineEntity("ACCT","Accounting"));
        repoDiscipline.save(new DisciplineEntity("ADS","School of Art & Design"));
        repoDiscipline.save(new DisciplineEntity("AHT","Allied Health"));
        repoDiscipline.save(new DisciplineEntity("ANTH","Anthropology"));
        repoDiscipline.save(new DisciplineEntity("AOSC","Meteorology"));
        repoDiscipline.save(new DisciplineEntity("Arabic","ARAB"));
        repoDiscipline.save(new DisciplineEntity("ARCH","Architectural Technology"));
        repoDiscipline.save(new DisciplineEntity("ART","Art/nc"));
        repoDiscipline.save(new DisciplineEntity("ARTT","Art"));
        repoDiscipline.save(new DisciplineEntity("ASLP","American Sign Language"));
        repoDiscipline.save(new DisciplineEntity("ASTR","Astronomy"));
        repoDiscipline.save(new DisciplineEntity("AUTO","Automotive Technology"));
        repoDiscipline.save(new DisciplineEntity("BIOL","Biological Sciences"));
        repoDiscipline.save(new DisciplineEntity("BIOT","Biotechnology"));
        repoDiscipline.save(new DisciplineEntity("BLDG","Building Trade Technology"));
        repoDiscipline.save(new DisciplineEntity("BSAD","Business Administration"));
        repoDiscipline.save(new DisciplineEntity("CCJS","Criminal Justice"));
        repoDiscipline.save(new DisciplineEntity("CHEM","Chemistry"));
        repoDiscipline.save(new DisciplineEntity("CHIN","Chinese"));
        repoDiscipline.save(new DisciplineEntity("CMAP","Computer Applications"));
        repoDiscipline.save(new DisciplineEntity("CMGT","Construction Technology"));
        repoDiscipline.save(new DisciplineEntity("CMP","Computers"));
        repoDiscipline.save(new DisciplineEntity("CMSC","Computer Science & Technology"));
        repoDiscipline.save(new DisciplineEntity("COED","Cooperative Education"));
        repoDiscipline.save(new DisciplineEntity("COMM","Communication Studies"));
        repoDiscipline.save(new DisciplineEntity("COS","Cosmotology/nc"));
        repoDiscipline.save(new DisciplineEntity("CPR","Cardio Pulmonary Resus"));
        repoDiscipline.save(new DisciplineEntity("CRP","Career Planning"));
        repoDiscipline.save(new DisciplineEntity("CYB","CyberAdvantage"));
        repoDiscipline.save(new DisciplineEntity("DANC","Dance"));
        repoDiscipline.save(new DisciplineEntity("DATA","Data Science"));
        repoDiscipline.save(new DisciplineEntity("ECH","Early Childhood"));
        repoDiscipline.save(new DisciplineEntity("ECON","Economics"));
        repoDiscipline.save(new DisciplineEntity("ECS","Early Childhood/Spanish"));
        repoDiscipline.save(new DisciplineEntity("EDUC","Education"));
        repoDiscipline.save(new DisciplineEntity("ENEE","Electrical Engineering"));
        repoDiscipline.save(new DisciplineEntity("ENES","Engineering Science"));
        repoDiscipline.save(new DisciplineEntity("ENGL","English"));
        repoDiscipline.save(new DisciplineEntity("ESL","English as Second Lang"));
        repoDiscipline.save(new DisciplineEntity("FILM","Film"));
        repoDiscipline.save(new DisciplineEntity("FIRE","Fire Science"));
        repoDiscipline.save(new DisciplineEntity("FLM","Film and Music"));
        repoDiscipline.save(new DisciplineEntity("FREN","French"));
        repoDiscipline.save(new DisciplineEntity("GDES","Graphic Design"));
        repoDiscipline.save(new DisciplineEntity("GEOG","Applied Geography"));
        repoDiscipline.save(new DisciplineEntity("GEOL","Geology"));
        repoDiscipline.save(new DisciplineEntity("GERM","German"));
        repoDiscipline.save(new DisciplineEntity("GHUM","Global Humanities"));
        repoDiscipline.save(new DisciplineEntity("GNDS","Gender Studies"));
        repoDiscipline.save(new DisciplineEntity("HBI","Hispanic Business"));
        repoDiscipline.save(new DisciplineEntity("HHS","Health and Human Service"));
        repoDiscipline.save(new DisciplineEntity("HIND","Hindi"));
        repoDiscipline.save(new DisciplineEntity("HINM","Health Information Management"));
        repoDiscipline.save(new DisciplineEntity("HIST","History"));
        repoDiscipline.save(new DisciplineEntity("HLTH","Health"));
        repoDiscipline.save(new DisciplineEntity("HMGT","Hospitality Management"));
        repoDiscipline.save(new DisciplineEntity("HOS","Hospitality"));
        repoDiscipline.save(new DisciplineEntity("HSCI","Health Sciences"));
        repoDiscipline.save(new DisciplineEntity("IDES","Interior Design"));
        repoDiscipline.save(new DisciplineEntity("ISTD","Interdisciplinary Studies"));
        repoDiscipline.save(new DisciplineEntity("ITAL","Italian"));
        repoDiscipline.save(new DisciplineEntity("ITI","Computers"));
        repoDiscipline.save(new DisciplineEntity("JAPN","Japan"));
        repoDiscipline.save(new DisciplineEntity("KORA","Korean"));
        repoDiscipline.save(new DisciplineEntity("LAN","Languages"));
        repoDiscipline.save(new DisciplineEntity("LATN","Latin"));
        repoDiscipline.save(new DisciplineEntity("LGST","Paralegal Studies"));
        repoDiscipline.save(new DisciplineEntity("LIBR","Library"));
        repoDiscipline.save(new DisciplineEntity("LING","Linguistics"));
        repoDiscipline.save(new DisciplineEntity("MATH","Mathematics"));
        repoDiscipline.save(new DisciplineEntity("MUSC","Music"));
        repoDiscipline.save(new DisciplineEntity("NURS","Nursing"));
        repoDiscipline.save(new DisciplineEntity("NUTR","Nutrition and Food"));
        repoDiscipline.save(new DisciplineEntity("NWIT","Network & Wireless Technology"));
        repoDiscipline.save(new DisciplineEntity("PHED","Physical Education"));
        repoDiscipline.save(new DisciplineEntity("PHIL","Philosophy"));
        repoDiscipline.save(new DisciplineEntity("PHOT","Photography"));
        repoDiscipline.save(new DisciplineEntity("PHYS","Physics"));
        repoDiscipline.save(new DisciplineEntity("POLI","Political Science"));
        repoDiscipline.save(new DisciplineEntity("PORT","Portugese"));
        repoDiscipline.save(new DisciplineEntity("PSYC","Psychology"));
        repoDiscipline.save(new DisciplineEntity("READ","Reading"));
        repoDiscipline.save(new DisciplineEntity("SOCY","Sociology"));
        repoDiscipline.save(new DisciplineEntity("SPAN","Spanish"));
        repoDiscipline.save(new DisciplineEntity("STBR","Study Abroad"));
        repoDiscipline.save(new DisciplineEntity("STSU","Student Development"));
        repoDiscipline.save(new DisciplineEntity("TED","Teacher Education"));
        repoDiscipline.save(new DisciplineEntity("WMST","Women's Studies"));
        repoDiscipline.save(new DisciplineEntity("WRT","Writing"));


    }
}
