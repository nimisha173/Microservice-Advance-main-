package com.example.UserService.repository;


import com.example.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository<Uesr> extends JpaRepository<Uesr,Long> {
    User saveUserName(User user);

    User findByUserId(Long uid);
}
