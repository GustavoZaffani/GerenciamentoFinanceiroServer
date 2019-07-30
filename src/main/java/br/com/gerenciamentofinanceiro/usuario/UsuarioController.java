package br.com.gerenciamentofinanceiro.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findOne(@PathVariable("id") Long id) {
        return usuarioService.findOne(id);
    }

    @PostMapping
    public Usuario save(@RequestBody @Valid Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        usuarioService.delete(id);
    }
}
