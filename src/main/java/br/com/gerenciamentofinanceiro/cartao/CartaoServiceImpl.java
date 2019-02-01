package br.com.gerenciamentofinanceiro.cartao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoServiceImpl implements CartaoService {

    @Autowired
    CartaoData cartaoData;

    @Override
    public Cartao findOne(Integer id) {
        return cartaoData.findById(id).orElse(null);
    }

    @Override
    public List<Cartao> findAll() {
        return cartaoData.findAll();
    }

    @Override
    public Cartao save(Cartao cartao) {
        return cartaoData.save(cartao);
    }

    @Override
    public void delete(Integer id) {
        cartaoData.deleteById(id);
    }
}
