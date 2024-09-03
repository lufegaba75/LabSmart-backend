package com.lufegaba.labsmart.auth;

import com.lufegaba.labsmart.auth.entities.LabUser;
import com.lufegaba.labsmart.auth.entities.dtos.UserDto;
import com.lufegaba.labsmart.repositories.IUserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email).orElseThrow();
    }

    public List<LabUser> getAllUsers() {
        return userRepository.findAll();
    }
}
