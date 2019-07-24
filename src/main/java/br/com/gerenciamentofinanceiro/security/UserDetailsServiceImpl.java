package br.com.gerenciamentofinanceiro.security;

import br.com.gerenciamentofinanceiro.usuario.Usuario;
import br.com.gerenciamentofinanceiro.usuario.UsuarioData;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UsuarioData usuarioData;

    public UserDetailsServiceImpl(UsuarioData usuarioData) {
        this.usuarioData = usuarioData;
    }

    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
        Usuario appUser = usuarioData.findByUsuario(usuario);
        if (appUser == null) {
            throw new UsernameNotFoundException(usuario);
        } else {
            appUser.setSenha(new BCryptPasswordEncoder().encode(appUser.getSenha()));
            return new User(appUser.getUsuario(), appUser.getSenha(), Collections.emptyList());
        }
    }
}