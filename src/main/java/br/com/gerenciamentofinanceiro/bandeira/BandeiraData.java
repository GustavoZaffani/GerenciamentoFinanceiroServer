package br.com.gerenciamentofinanceiro.bandeira;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BandeiraData extends JpaRepository<Bandeira, Long> {

    List<Bandeira> findByDescricaoLike (String descricao);
}
