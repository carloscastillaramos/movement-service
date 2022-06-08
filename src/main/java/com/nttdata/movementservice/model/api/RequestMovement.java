package com.nttdata.movementservice.model.api;

import lombok.*;

import java.util.Date;

//@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestMovement {
    private Integer id;
    private Integer idProduct;
    private Date fecMovement;
    private Integer idTypeMovement;
    private Number numAmount;
    private Boolean fgActive;

}
