package br.com.gerenciamentofinanceiro.usuario;

import java.util.List;

public interface UsuarioService {

    Usuario save(Usuario usuario);

    List<Usuario> findAll();

    Usuario findOne(Long id);

    void delete(Long id);
}
