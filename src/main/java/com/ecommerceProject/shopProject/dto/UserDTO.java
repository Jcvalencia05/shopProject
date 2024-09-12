package com.ecommerceProject.shopProject.dto;

import com.ecommerceProject.shopProject.enums.UserRole;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

}
