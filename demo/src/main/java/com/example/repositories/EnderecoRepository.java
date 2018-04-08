package com.example.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}