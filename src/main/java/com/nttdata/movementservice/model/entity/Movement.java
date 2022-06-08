package com.nttdata.movementservice.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import java.util.Date;


//@Data
//@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movement")
public class Movement {
    @Id
    private Integer id;
    private Integer idProduct;
    private Date fecMovement;
    private Integer idTypeMovement;
    private Number numAmount;
    private Boolean fgActive;
}
