package br.com.gerenciamentofinanceiro.credenciadora;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CredenciadoraData extends JpaRepository<Credenciadora, Long> {

    List<Credenciadora> findByCredenciadoraLike(String credenciadora);
}
