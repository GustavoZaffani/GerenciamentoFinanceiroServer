package br.com.gerenciamentofinanceiro.bandeira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandeiraServiceImpl implements BandeiraService {

    @Autowired
    private BandeiraData bandeiraData;

    @Override
    public List<Bandeira> findAll() {
        return bandeiraData.findAll();
    }

    @Override
    public Bandeira findOne(Long id) {
        return bandeiraData.findById(id).orElse(null);
    }

    @Override
    public Bandeira save(Bandeira bandeira) {
        return bandeiraData.save(bandeira);
    }

    @Override
    public void delete(Long id) {
        bandeiraData.deleteById(id);
    }

    @Override
    public List<Bandeira> complete(String descricao) {
        if ("".equalsIgnoreCase(descricao)) {
            return bandeiraData.findAll();
        } else {
            return bandeiraData.findByDescricaoLike(descricao);
        }
    }
}
