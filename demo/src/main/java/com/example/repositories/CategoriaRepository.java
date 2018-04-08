package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}