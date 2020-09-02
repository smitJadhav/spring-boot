package com.auth.domain.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Smit.Jadhav on 9/2/2020
 */

@Getter
@Setter
@MappedSuperclass
public class AbstractEntity extends AbstractTimestampEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Integer version;
}
