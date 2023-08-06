package com.codewithashu.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithashu.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
