package com.movie.movieservice.repository;

import com.movie.movieservice.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
