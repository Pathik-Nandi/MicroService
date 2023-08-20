package com.miroservice.user.service.UserService.repository;

import com.miroservice.user.service.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
