package br.com.gerenciamentofinanceiro.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioData usuarioData;

    @Override
    public Usuario save(Usuario usuario) {
//        usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
        return usuarioData.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioData.findAll();
    }

    @Override
    public Usuario findOne(Long id) {
        return usuarioData.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        usuarioData.deleteById(id);
    }
}
