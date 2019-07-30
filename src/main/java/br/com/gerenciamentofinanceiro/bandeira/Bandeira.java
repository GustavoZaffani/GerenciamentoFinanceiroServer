package br.com.gerenciamentofinanceiro.bandeira;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "BANDEIRA")
@Entity
public class Bandeira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;
}
