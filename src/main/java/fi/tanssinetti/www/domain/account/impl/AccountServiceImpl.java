package fi.tanssinetti.www.domain.account.impl;

import fi.tanssinetti.www.domain.account.AccountService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;

/**
 * Created by Hannu Lohtander on 25.9.2016.
 */
public class AccountServiceImpl implements AccountService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new AccountImpl(username, "-", new ArrayList<GrantedAuthority>());
    }
}
