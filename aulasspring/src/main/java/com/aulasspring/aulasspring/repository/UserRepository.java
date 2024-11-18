package com.aulasspring.aulasspring.repository;

import com.aulasspring.aulasspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
