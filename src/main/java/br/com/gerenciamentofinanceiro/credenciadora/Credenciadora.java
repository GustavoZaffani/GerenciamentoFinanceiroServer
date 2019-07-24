package br.com.gerenciamentofinanceiro.credenciadora;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "Credenciadora")
public class Credenciadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "O campo 'Credenciadora' é de preenchimento obrigatório.")
    @Column(name = "credenciadora", nullable = false)
    private String credenciadora;

    @NotEmpty(message = "O campo 'Cnpj' é de preenchimento obrigatório.")
    @Column(name = "cnpj", nullable = false)
    private String cnpj;
}
