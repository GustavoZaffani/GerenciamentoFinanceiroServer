package br.com.gerenciamentofinanceiro.credenciadora;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CredenciadoraData extends JpaRepository<Credenciadora, Long> {
}
