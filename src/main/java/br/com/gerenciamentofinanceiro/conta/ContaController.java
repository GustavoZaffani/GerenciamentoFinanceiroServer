package br.com.gerenciamentofinanceiro.conta;

import br.com.gerenciamentofinanceiro.cartao.Cartao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping("/{id}")
    public Conta findOne(@PathVariable("id") Integer id) {
        return contaService.findOne(id);
    }

    @GetMapping
    public List<Conta> findAll() {
        return contaService.findAll();
    }

    @PostMapping
    public Conta save(@RequestBody Conta conta) {
        return contaService.save(conta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        contaService.delete(id);
    }

    @GetMapping("/extrato")
    public List<Conta> findContaByCartaoAndVencimentoEquals (@RequestBody Cartao cartao, @PathVariable LocalDate data) {
        return contaService.findContaByCartaoAndVencimentoEquals(cartao, data);
    }

}
