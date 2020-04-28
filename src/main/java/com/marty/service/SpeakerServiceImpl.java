package com.marty.service;

import com.marty.model.Speaker;
import com.marty.repository.HibernateSpeakerRepositoryImpl;
import com.marty.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository ;
    //adding a constructor
    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
            repository = speakerRepository;
    }
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
