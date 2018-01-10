package com.raptorplan.raptorplan.auth.config;

import com.raptorplan.raptorplan.auth.model.UserEntity;
import com.raptorplan.raptorplan.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository repoUser;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = repoUser.findByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException("Could not find user " + username);
        }

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        user.getRoles().forEach(role -> {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        });

        return new User(user.getEmail(),user.getPassword(),grantedAuthorities);
    }


}
