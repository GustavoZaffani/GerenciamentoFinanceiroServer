package br.com.gerenciamentofinanceiro.credenciadora;

import java.util.List;

public interface CredenciadoraService {

    Credenciadora findOne(Long id);

    List<Credenciadora> findAll();

    Credenciadora save(Credenciadora credenciadora);

    void delete(Long id);

    List<Credenciadora> complete(String credenciadora);
}
