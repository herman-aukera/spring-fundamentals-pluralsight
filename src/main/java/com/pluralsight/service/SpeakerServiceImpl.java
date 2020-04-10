package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import lombok.Data;

import java.util.List;
@Data
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public List<Speaker> findAll() {

    return repository.findAll();

    }
}
