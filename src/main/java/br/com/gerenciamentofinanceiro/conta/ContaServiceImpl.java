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

    // TODO verificar replicacao quando houver parcelas
    @Override
    public Conta save(Conta conta) {
        Conta contaAux = null;
        if (conta.getParcelas() != null) {
            for (int i = 1; i <= conta.getParcelas(); i++) {
                contaAux = new Conta();
                contaAux = conta;

                // se não é a primeira parcela, adiciona mais um mês
                if (i != 1) {
                    contaAux.setVencimento(contaAux.getVencimento().plusMonths(1));
                }

                // se é a última parcela, sai do for e retorna o resultado ao client
                if (i == conta.getParcelas()) {
                    contaAux = contaData.save(contaAux);
                    break;
                }
                contaData.save(contaAux);
                conta.setVencimento(conta.getVencimento().plusMonths(1));
            }
        } else {
            contaAux = contaData.save(conta);
        }
        return contaAux;
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
