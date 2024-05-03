package com.gaurav.resourceserver.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;

/**
 * Author: Gaurav Basyal
 */
public class SecurityUtil {
    public static Authentication getAuthentication() {
        if(SecurityContextHolder.getContext().getAuthentication() == null) {
            throw new OAuth2AuthenticationException("No authentication found");
        }
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
