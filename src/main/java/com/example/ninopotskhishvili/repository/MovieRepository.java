package com.example.ninopotskhishvili.repository;

import com.example.ninopotskhishvili.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
