package com.ecommerceProject.shopProject.services.user;

import com.ecommerceProject.shopProject.dto.SingupDTO;
import com.ecommerceProject.shopProject.dto.UserDTO;

public interface UserService {
    UserDTO createUser(SingupDTO singupDTO);

    boolean hasUserWithEmail (String email);
}
