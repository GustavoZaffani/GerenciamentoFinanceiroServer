package br.com.gerenciamentofinanceiro.conta;

import java.util.List;

public interface ContaService {

    Conta findOne(Integer id);

    List<Conta> findAll();

    Conta save(Conta conta);

    void delete(Integer id);
}
