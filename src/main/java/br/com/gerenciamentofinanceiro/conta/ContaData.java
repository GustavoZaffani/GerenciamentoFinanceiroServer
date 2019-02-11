package br.com.gerenciamentofinanceiro.conta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaData extends JpaRepository<Conta, Integer> {
}
