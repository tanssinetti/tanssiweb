package fi.tanssinetti.www.domain.account;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by Hannu Lohtander on 25.9.2016.
 */
public interface Account extends UserDetails, CredentialsContainer {
}
