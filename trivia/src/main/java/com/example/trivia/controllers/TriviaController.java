package com.example.trivia.controllers;

import com.example.trivia.models.Trivia;
import com.example.trivia.repositories.TriviaRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/trivia")
public class TriviaController {

    @Autowired
    private TriviaRepository repository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Trivia createTrivia(@Valid @RequestBody Trivia trivia) {
        trivia.set_id(ObjectId.get());
        repository.save(trivia);
        return trivia;
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Trivia> getAllTrivias() {
        System.out.println("Hola prros");
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Trivia getTriviaById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{status}", method = RequestMethod.GET)
    public Trivia getTriviaByStatus(@PathVariable("status") String status) {
        return repository.findByStatus(status);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyTriviaById(@PathVariable("id") ObjectId id, @Valid @RequestBody Trivia trivia) {
        trivia.set_id(id);
        repository.save(trivia);
    }

    /*
    //@RequestMapping(value = "/{status}", method = RequestMethod.PUT)
    //public void setStatus(@PathVariable("status") String status, @Valid @RequestBody Trivia_Sesion trivia) {
    //    trivia.modifyStatus(status);
    //    repository.save(trivia);
    */

    @RequestMapping(value = "/toUser/{id}", method = RequestMethod.GET)
    public List<Trivia> getByToUser(@PathVariable String id){
        return  repository.findByToUserId(id);
    }

    @RequestMapping(value = "/fromUser/{id}", method = RequestMethod.GET)
    public List<Trivia> getByFromUser(@PathVariable String id){
        return  repository.findByFromUserId(id);
    }

    @RequestMapping(value = "/toUserAndStatus/{toUserId}/{status}", method = RequestMethod.GET)
    public List<Trivia> findByToUserIdAndStatus(@PathVariable String toUserId,@PathVariable String status){
        System.out.println(toUserId + status);
        return  repository.findByToUserIdAndStatus(toUserId,status);
    }

    @RequestMapping(value = "/fromUserAndStatus/{fromUserId}/{status}", method = RequestMethod.GET)
    public List<Trivia> findByFromUserIdAndStatus(@PathVariable String fromUserId,@PathVariable String status){
        System.out.println(fromUserId + status);
        return  repository.findByFromUserIdAndStatus(fromUserId,status);
    }




}

