package br.com.gerenciamentofinanceiro.conta;

import br.com.gerenciamentofinanceiro.cartao.Cartao;
import br.com.gerenciamentofinanceiro.config.LocalDateDeserializer;
import br.com.gerenciamentofinanceiro.config.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "contas")
@Data
public class Conta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @NotNull
    @Column(name = "DESCRICAO")
    private String descricao;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @NotNull
    @Column(name = "VENCIMENTO")
    private LocalDate vencimento;

    @Column(name = "PARCELAS")
    private String parcelas;

    @ManyToOne
    @JoinColumn(name = "ID_CARTAO")
    private Cartao cartao;


}
