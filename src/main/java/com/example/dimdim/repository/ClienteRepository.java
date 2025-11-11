package com.example.dimdim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dimdim.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Não precisa implementar nada!
    // findAll(), save(), findById(), deleteById() já existem automaticamente
}
