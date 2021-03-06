package com.auth.domain;

import com.auth.domain.base.AbstractEntity;
import com.auth.model.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Smit.Jadhav on 9/2/2020
 */

@Entity
@Table(name = "user")
@Getter
@Setter
public class User extends AbstractEntity implements Serializable {

    private String userName;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String email;
    private boolean isNonLocked;
    private boolean isActive;
    private Integer numberOfAttempts;
    private String statusChangeReason;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne
    private Role role;
}
