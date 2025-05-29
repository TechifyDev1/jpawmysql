package com.qudus.jpawsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qudus.jpawsql.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{
}
