package br.com.gerenciamentofinanceiro.credenciadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credenciadora")
public class CredenciadoraController {

    @Autowired
    private CredenciadoraService credenciadoraService;

    @GetMapping("/{id}")
    public Credenciadora findOne(@PathVariable("id") Long id) {
        return credenciadoraService.findOne(id);
    }

     @GetMapping
    public List<Credenciadora> findAll() {
        return credenciadoraService.findAll();
    }

    @PostMapping("/save")
    public Credenciadora save(@RequestBody Credenciadora credenciadora) {
        return credenciadoraService.save(credenciadora);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        credenciadoraService.delete(id);
    }
}
