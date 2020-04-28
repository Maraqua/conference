package com.marty.repository;

import com.marty.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Marty");
        speaker.setLastName("Turing");
        speakers.add(speaker);
        return  speakers;

    }
}
