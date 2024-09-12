package com.ecommerceProject.shopProject.services.user;

import com.ecommerceProject.shopProject.dto.SingupDTO;
import com.ecommerceProject.shopProject.dto.UserDTO;
import com.ecommerceProject.shopProject.entity.User;
import com.ecommerceProject.shopProject.enums.UserRole;
import com.ecommerceProject.shopProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(SingupDTO singupDTO) {
        User user = new User();
        user.setName(singupDTO.getName());
        user.setEmail(singupDTO.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(singupDTO.getPassword()));
        user.setUserRole(UserRole.USER);
        userRepository.save(user);
        return user.mapUserToUserDTO();
    }
}