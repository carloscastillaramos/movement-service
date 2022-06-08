package com.nttdata.movementservice.repository;

import com.nttdata.movementservice.model.api.RequestMovement;
import com.nttdata.movementservice.model.entity.Movement;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovementRepository {
    Mono<Movement> createMovement(RequestMovement request);
    Flux<Movement> findAllMovement(RequestMovement request);
    Mono<Movement> updateMovement(RequestMovement request);
    Mono<Movement> deleteMovement(RequestMovement request);
}
