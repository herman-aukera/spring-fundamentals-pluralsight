package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {


    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100}")
    private double seedNum;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Gonzalo");
        speaker.setLastName("Gonzalez");
        speaker.setSeedNum(seedNum);

        System.out.printf("Calendar: %s \n", calendar.getTime());

        speakers.add(speaker);


        return speakers;
    }

}
