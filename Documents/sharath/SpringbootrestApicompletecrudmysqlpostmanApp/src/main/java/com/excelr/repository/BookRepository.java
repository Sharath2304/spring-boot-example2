package com.excelr.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Book;

public interface BookRepository extends JpaRepository<Book,Serializable>{

}
