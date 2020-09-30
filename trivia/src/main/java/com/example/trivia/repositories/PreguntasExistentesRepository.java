package com.example.trivia.repositories;

import com.example.trivia.models.PreguntasExistentes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PreguntasExistentesRepository extends MongoRepository<PreguntasExistentes, String> {
    PreguntasExistentes findBy_id(ObjectId _id);

    @Query("{ 'toUserId' : ?0 }")
    List<PreguntasExistentes> findByToUserId(String toUserId);

    @Query("{ 'fromUserId' : ?0 }")
    List<PreguntasExistentes> findByFromUserId(String fromUserId);

    @Query("{ 'toUserId' : ?0, 'status' : ?1 }")
    List<PreguntasExistentes> findByToUserIdAndStatus(String fromUserId, String status);

    @Query("{ 'fromUserId' : ?0, 'status' : ?1 }")
    List<PreguntasExistentes> findByFromUserIdAndStatus(String fromUserId, String status);

}
