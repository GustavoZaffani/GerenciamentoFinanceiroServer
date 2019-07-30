package br.com.gerenciamentofinanceiro.bandeira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bandeira")
public class BandeiraController {

    @Autowired
    private BandeiraService bandeiraService;

    @GetMapping
    public List<Bandeira> findAll() {
        return bandeiraService.findAll();
    }

    @GetMapping("/{id}")
    public Bandeira findOne(@PathVariable("id") Long id) {
        return bandeiraService.findOne(id);
    }

    @GetMapping("/complete")
    public List<Bandeira> complete(@RequestParam("query") String descricao) {
        return bandeiraService.complete(descricao);
    }

    @PostMapping
    public Bandeira save(@RequestBody Bandeira bandeira) {
        return bandeiraService.save(bandeira);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        bandeiraService.delete(id);
    }
}
