package com.example.trivia.controllers;

import com.example.trivia.models.PreguntasExistentes;
import com.example.trivia.repositories.PreguntasExistentesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/preguntas")
public class PreguntasExistentesController {

    @Autowired
    private PreguntasExistentesRepository repository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<PreguntasExistentes> getAllNotifications() {
        System.out.println("Hola prros");
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PreguntasExistentes getQuestionsById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }


    @RequestMapping(value = "/toUser/{id}", method = RequestMethod.GET)
    public List<PreguntasExistentes> getByToUser(@PathVariable String id){
        return  repository.findByToUserId(id);
    }

    @RequestMapping(value = "/fromUser/{id}", method = RequestMethod.GET)
    public List<PreguntasExistentes> getByFromUser(@PathVariable String id){
        return  repository.findByFromUserId(id);
    }

}

