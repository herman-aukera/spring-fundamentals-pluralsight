package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import lombok.Data;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
