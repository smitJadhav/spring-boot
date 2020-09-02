package com.auth.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Smit.Jadhav on 9/2/2020
 */

@Entity
@Table(name = "role")
@Getter
@Setter
public class Role implements Serializable {

    @Id
    @NonNull
    @Column(name = "name", nullable = false)
    private String name;
}
