package com.javastackspaceit.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastackspaceit.com.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
