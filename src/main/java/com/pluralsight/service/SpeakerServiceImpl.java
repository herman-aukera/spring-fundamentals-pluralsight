package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository repository;

    public SpeakerServiceImpl(){}

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {

        return repository.findAll();

    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
