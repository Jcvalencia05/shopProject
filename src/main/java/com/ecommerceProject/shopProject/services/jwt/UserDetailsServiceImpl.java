package com.ecommerceProject.shopProject.services.jwt;

import com.ecommerceProject.shopProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Optional;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*Optional<User> optionalUser=userRepository.findByEmail(username);
        if (optionalUser.isEmpty()) throw new UsernameNotFoundException("Usuario no encontrado", null);
        User user=optionalUser.get();
        return new org.springframework.security.core.userdetails.User(optionalUser.get().getEmail(), optionalUser.get().getPassword(),new ArrayList<>());*/

       User user = userRepository.findByEmail(s);
        if (user==null) throw new UsernameNotFoundException("Usuario no encontrado", null);
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),new ArrayList<>());
    }
}
