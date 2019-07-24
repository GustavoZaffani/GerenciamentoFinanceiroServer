package br.com.gerenciamentofinanceiro.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioData extends JpaRepository<Usuario, Long> {

    Usuario findByUsuario(String usuario);
}
