package com.project.code;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> { // object and key type
    // JpaRepository provides basic CRUD operations out of the box
}