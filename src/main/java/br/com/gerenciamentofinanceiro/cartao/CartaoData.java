package br.com.gerenciamentofinanceiro.cartao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoData extends JpaRepository<Cartao, Integer> {
}
