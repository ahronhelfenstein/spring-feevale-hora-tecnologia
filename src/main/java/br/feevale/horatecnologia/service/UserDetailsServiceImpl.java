package br.feevale.horatecnologia.service;

import br.feevale.horatecnologia.entity.UserEntity;
import br.feevale.horatecnologia.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author ahelfenstein
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), roles);
    }

}
