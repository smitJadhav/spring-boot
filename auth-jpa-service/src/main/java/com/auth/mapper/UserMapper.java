package com.auth.mapper;

import com.auth.domain.User;
import com.auth.model.UserDetailsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(source = "role.name", target = "role")
    UserDetailsDTO mapUserToUserDetailsDTO(User user);
}
