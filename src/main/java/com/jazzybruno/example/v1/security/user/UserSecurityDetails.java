package com.jazzybruno.example.v1.security.user;

import com.jazzybruno.example.v1.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UserSecurityDetails implements UserDetails {
    public String username;
    public String password;
    public List<GrantedAuthority> grantedAuthorities;

    public UserSecurityDetails(User user){
        this.username = user.getEmail();
        this.password = user.getPassword();
        ArrayList<GrantedAuthority> grantedAuthorities1 =new ArrayList<>();
        grantedAuthorities1.add(new UserAuthority(user.getUser_id() , user.getNational_id()));
    }

    public List<GrantedAuthority> getGrantedAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
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
