package com.gaurav.springoauthserver.repository;

import com.gaurav.springoauthserver.entity.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SecurityUser, Integer>{

	SecurityUser findByUsername(String username);
}
