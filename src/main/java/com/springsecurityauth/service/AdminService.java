package com.springsecurityauth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.springsecurityauth.domain.User;
import com.springsecurityauth.repositories.UserRepository;

@Service
public class AdminService {

  @Autowired
  private UserRepository userRepo;
  
  @Secured({"ROLE_ADMIN","ROLE_SUPERUSER"})
  public List<User> getAllUserAccounts () {
    return userRepo.findAll();
  }
}
