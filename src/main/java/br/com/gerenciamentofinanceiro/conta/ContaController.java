package br.com.gerenciamentofinanceiro.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/extrato")
    public List<Conta> findContaByCartaoAndVencimento(@RequestBody Extrato extrato) {
        return contaService.findContaByCartaoAndVencimento(extrato.getCartao().getId(), converterTeste(extrato.getDtIni()), converterTeste(extrato.getDtFim()));
    }

    private String converterTeste(String data) {
        String[] split = data.split("/");
        return split[2] + "-" + split[1] + "-" + split[0];
    }

}
