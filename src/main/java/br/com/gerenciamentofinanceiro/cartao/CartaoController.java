package br.com.gerenciamentofinanceiro.cartao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

    @Autowired
    CartaoService cartaoService;

    @GetMapping("/{id}")
    public Cartao findOne(@PathVariable("id") Integer id) {
        return cartaoService.findOne(id);
    }

    @GetMapping
    public List<Cartao> findAll() {
        return cartaoService.findAll();
    }

    @PostMapping
    public Cartao save(@RequestBody Cartao cartao) {
        return cartaoService.save(cartao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cartaoService.delete(id);
    }

    @GetMapping("/complete")
    public List<Cartao> complete(@RequestParam("query") String query) {
        return cartaoService.complete(query);
    }
}
