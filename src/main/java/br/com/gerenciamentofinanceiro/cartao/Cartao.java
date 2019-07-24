package br.com.gerenciamentofinanceiro.cartao;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "cartao")
@Data
public class Cartao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @NotNull
    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "CREDENCIADORA")
    private String credenciadora;

    @Column(name = "CNPJ")
    private Long cnpj;

    @Column(name = "LIMITE")
    private Long limite;

    @Column(name = "VENCIMENTO")
    private Integer vencimento;

    @NotNull
    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "BANDEIRA")
    private String bandeira;

    @Column(name = "MELHOR_DATA")
    private Integer melhorData;
}
