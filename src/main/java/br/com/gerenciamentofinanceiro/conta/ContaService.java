package br.com.gerenciamentofinanceiro.conta;

import br.com.gerenciamentofinanceiro.cartao.Cartao;

import java.time.LocalDate;
import java.util.List;

public interface ContaService {

    Conta findOne(Integer id);

    List<Conta> findAll();

    Conta save(Conta conta);

    void delete(Integer id);

    List<Conta> findContaByCartaoAndVencimentoEquals (Cartao cartao, LocalDate data);

    List<Conta> findContaByCartaoAndVencimento (Integer idCartao, String dtIni, String dtFim);
}
