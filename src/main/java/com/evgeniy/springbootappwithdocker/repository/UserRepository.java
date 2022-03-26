package com.evgeniy.springbootappwithdocker.repository;

import com.evgeniy.springbootappwithdocker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
