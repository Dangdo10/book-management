package com.example.project.repository;

import com.example.project.entity.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}

