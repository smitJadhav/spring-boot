package com.auth.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by Smit.Jadhav on 9/2/2020
 */

@Getter
@Setter
public class UserDetailsDTO implements UserDetails {

    private Long id;
    private String userName;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String email;
    private boolean isLocked;
    private boolean isActive;
    private Integer numberOfAttempts;
    private String statusChangeReason;
    private Gender gender;
    private String role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return AuthorityUtils.createAuthorityList(role);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
