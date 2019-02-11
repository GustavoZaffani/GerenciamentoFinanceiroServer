package br.com.gerenciamentofinanceiro.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
