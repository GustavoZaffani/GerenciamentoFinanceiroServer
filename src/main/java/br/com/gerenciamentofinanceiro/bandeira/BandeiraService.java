package br.com.gerenciamentofinanceiro.bandeira;

import java.util.List;

public interface BandeiraService {

    List<Bandeira> findAll();

    Bandeira findOne(Long id);

    Bandeira save(Bandeira bandeira);

    void delete(Long id);

    List<Bandeira> complete(String descricao);
}
