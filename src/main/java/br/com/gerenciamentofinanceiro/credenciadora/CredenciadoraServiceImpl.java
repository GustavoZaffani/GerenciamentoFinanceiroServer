package br.com.gerenciamentofinanceiro.credenciadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredenciadoraServiceImpl implements CredenciadoraService {

    @Autowired
    private CredenciadoraData credenciadoraData;

    @Override
    public Credenciadora findOne(Long id) {
        return credenciadoraData.findById(id).orElse(null);
    }

    @Override
    public List<Credenciadora> findAll() {
        return credenciadoraData.findAll();
    }

    @Override
    public Credenciadora save(Credenciadora credenciadora) {
        return credenciadoraData.save(credenciadora);
    }

    @Override
    public void delete(Long id) {
        credenciadoraData.deleteById(id);
    }
}
