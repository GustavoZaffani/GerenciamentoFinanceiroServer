package br.com.gerenciamentofinanceiro.cartao;

import java.util.List;

public interface CartaoService {

    Cartao findOne(Integer id);

    List<Cartao> findAll();

    Cartao save(Cartao cartao);

    void delete(Integer id);

    List<Cartao> complete(String query);
}
