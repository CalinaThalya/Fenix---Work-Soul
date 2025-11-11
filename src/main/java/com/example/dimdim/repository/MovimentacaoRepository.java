package com.example.dimdim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dimdim.model.MovimentacaoFinanceira;

@Repository
public interface MovimentacaoRepository extends JpaRepository<MovimentacaoFinanceira, Integer> {
    // Não precisa implementar nada!
}
