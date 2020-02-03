package br.com.gerenciamentofinanceiro.conta;

import br.com.gerenciamentofinanceiro.cartao.Cartao;
import lombok.Data;

@Data
public class Extrato {

    private Cartao cartao;
    private String dtIni;
    private String dtFim;
}
