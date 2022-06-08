package com.nttdata.movementservice.repository;

import com.nttdata.movementservice.model.api.RequestMovement;
import com.nttdata.movementservice.model.entity.Movement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
class MovementRepositoryImpl implements MovementRepository {

    //@Autowired
    //private MongoTemplate mongoTemplate;

    @Override
    public Mono<Movement> createMovement(RequestMovement request) {
        return null;
    }

    @Override
    public Flux<Movement> findAllMovement(RequestMovement request) {
        return null;
    }

    @Override
    public Mono<Movement> updateMovement(RequestMovement request) {
        return null;
    }

    @Override
    public Mono<Movement> deleteMovement(RequestMovement request) {
        return null;
    }
}
