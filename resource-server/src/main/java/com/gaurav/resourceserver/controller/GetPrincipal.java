package com.gaurav.resourceserver.controller;

import com.gaurav.resourceserver.util.SecurityUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Gaurav Basyal
 */
@RestController
@Log4j2
public class GetPrincipal {

    @GetMapping
    public String getPrincipal() {
        var securityUser=SecurityUtil.getAuthentication();
        return securityUser.getName();
    }
}
