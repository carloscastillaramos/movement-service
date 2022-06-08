package com.nttdata.movementservice.businness;

import com.nttdata.movementservice.model.api.RequestMovement;
import com.nttdata.movementservice.model.entity.Movement;
import com.nttdata.movementservice.model.api.ResponseAudit;
import com.nttdata.movementservice.model.api.ResponseMovement;
import com.nttdata.movementservice.repository.MovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
public class MovementServiceImpl implements MovementService{

    final private static String CODE_OK = "0000";
    final private static String CODE_ERROR = "0001";
    final private static String CODE_EXCEPTION = "0002";
    final private static String CODE_NO_DATA = "0003";
    final private static String CODE_UNKNOWN = "0004";
    final private static String CODE_NO_EXIST = "0005";

    @Autowired
    private MovementRepository movementRepository;
    @Override
    public Mono<ResponseMovement> createMovement(RequestMovement request) {
        ResponseMovement response = new ResponseMovement();
        Mono<Movement> monoMovement;

        response.setAudit(new ResponseAudit());
        response.getAudit().setDate(new Date());

        /*try{
            monoMovement = movementRepository.createMovement(request);

            if(null != monoMovement){
                if(0 < monoMovement.block().getId()){
                    response.getAudit().setCode(CODE_OK);
                    response.setList(new ArrayList<>());
                    response.getList().add(monoMovement.block());
                }
                else{
                    response.getAudit().setCode(CODE_ERROR);
                }
            } else {
                response.getAudit().setCode(CODE_UNKNOWN);
            }
        } catch(Exception e){
            response.getAudit().setCode(CODE_EXCEPTION);
            response.getAudit().setMessage(e.getMessage());
        }*/

        return Mono.just(response);
    }

    @Override
    public Mono<ResponseMovement> findAllMovement(RequestMovement request) {
        ResponseMovement response = new ResponseMovement();
        Flux<Movement> list;

        response.setAudit(new ResponseAudit());
        response.getAudit().setDate(new Date());

        /*try{
            list = movementRepository.findAllMovement(request);

            if(null != list){
                if(0 < list.count().block().longValue()){
                    response.getAudit().setCode(CODE_OK);
                    response.setList(new ArrayList<>());
                    response.getList().addAll(list.collectList().block());
                }
                else{
                    response.getAudit().setCode(CODE_NO_DATA);
                }
            } else{
                response.getAudit().setCode(CODE_UNKNOWN);
            }

        } catch(Exception e){
            response.getAudit().setCode(CODE_EXCEPTION);
            response.getAudit().setMessage(e.getMessage());
        }*/

        return Mono.just(response);
    }

    @Override
    public Mono<ResponseMovement> updateMovement(RequestMovement request) {
        ResponseMovement response = new ResponseMovement();
        Mono<Movement> monoMovement;

        response.setAudit(new ResponseAudit());
        response.getAudit().setDate(new Date());

        /*try{
            monoMovement = movementRepository.updateMovement(request);

            if(null != monoMovement){
                if(request.getId() != monoMovement.block().getId()){
                    response.getAudit().setCode(CODE_OK);
                    response.setList(new ArrayList<>());
                    response.getList().add(monoMovement.block());
                }
                else{
                    response.getAudit().setCode(CODE_ERROR);
                }
            } else {
                response.getAudit().setCode(CODE_UNKNOWN);
            }
        } catch(Exception e){
            response.getAudit().setCode(CODE_EXCEPTION);
            response.getAudit().setMessage(e.getMessage());
        }*/

        return Mono.just(response);
    }

    @Override
    public Mono<ResponseMovement> deleteMovement(RequestMovement request) {
        ResponseMovement response = new ResponseMovement();
        Mono<Movement> monoMovement;

        response.setAudit(new ResponseAudit());
        response.getAudit().setDate(new Date());

        /*try{
            monoMovement = movementRepository.deleteMovement(request);

            if(null != monoMovement){
                if(request.getId() != monoMovement.block().getId()){
                    response.getAudit().setCode(CODE_OK);
                    response.setList(new ArrayList<>());
                    response.getList().add(monoMovement.block());
                }
                else{
                    response.getAudit().setCode(CODE_ERROR);
                }
            } else {
                response.getAudit().setCode(CODE_UNKNOWN);
            }
        } catch(Exception e){
            response.getAudit().setCode(CODE_EXCEPTION);
            response.getAudit().setMessage(e.getMessage());
        }*/

        return Mono.just(response);
    }
}
