package br.com.gerenciamentofinanceiro.conta;

import br.com.gerenciamentofinanceiro.cartao.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ContaData extends JpaRepository<Conta, Integer> {

    List<Conta> findContaByCartaoAndVencimentoEquals(Cartao cartao, LocalDate data);
}
