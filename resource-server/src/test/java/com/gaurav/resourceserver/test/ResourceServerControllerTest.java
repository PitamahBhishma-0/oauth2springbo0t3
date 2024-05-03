package com.gaurav.resourceserver.test;
import com.gaurav.resourceserver.controller.GetPrincipal;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
/**
 * Author: Gaurav Basyal
 */
@SpringBootTest
public class ResourceServerControllerTest {
    @Autowired
    private GetPrincipal controller;

    @Before
    public void setUp() {
        controller = new GetPrincipal();
    }

    @Test
    public void testGetPrincipal() {
        SecurityContext securityContext = mock(SecurityContext.class);
        SecurityContextHolder.setContext(securityContext);
        Authentication authentication = mock(Authentication.class);
        when(securityContext.getAuthentication()).thenReturn(authentication);
        String expectedPrincipalName = "testUser";
        when(authentication.getName()).thenReturn(expectedPrincipalName);
        String actualPrincipalName = controller.getPrincipal();
        assertEquals(expectedPrincipalName, actualPrincipalName);
    }
}
