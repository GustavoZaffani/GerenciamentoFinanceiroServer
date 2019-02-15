package br.com.gerenciamentofinanceiro.conta;

import br.com.gerenciamentofinanceiro.cartao.Cartao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    ContaData contaData;

    @Override
    public Conta findOne(Integer id) {
        return contaData.findById(id).orElse(null);
    }

    @Override
    public List<Conta> findAll() {
        return contaData.findAll();
    }

    @Override
    public Conta save(Conta conta) {
        return contaData.save(conta);
    }

    @Override
    public void delete(Integer id) {
        contaData.deleteById(id);
    }

    @Override
    public List<Conta> findContaByCartaoAndVencimentoEquals(Cartao cartao, LocalDate data) {
        return contaData.findContaByCartaoAndVencimentoEquals(cartao, data);
    }
}
