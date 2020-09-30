package com.example.trivia.repositories;

import com.example.trivia.models.Trivia;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TriviaRepository extends MongoRepository<Trivia, String> {
    Trivia findBy_id(ObjectId _id);

    @Query("{ 'toUserId' : ?0 }")
    List<Trivia> findByToUserId(String toUserId);

    @Query("{ 'fromUserId' : ?0 }")
    List<Trivia> findByFromUserId(String fromUserId);

    @Query("{ 'toUserId' : ?0, 'status' : ?1 }")
    List<Trivia> findByToUserIdAndStatus(String fromUserId, String status);

    @Query("{ 'fromUserId' : ?0, 'status' : ?1 }")
    List<Trivia> findByFromUserIdAndStatus(String fromUserId, String status);


    Trivia findByStatus(String status);


}
