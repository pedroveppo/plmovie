package com.plv.plmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plv.plmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
