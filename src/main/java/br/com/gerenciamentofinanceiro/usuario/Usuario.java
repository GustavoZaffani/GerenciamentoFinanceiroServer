package br.com.gerenciamentofinanceiro.usuario;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "O campo 'nome' é de preenchimento obrigatório.")
    @Column(name = "nome")
    private String nome;

    @NotEmpty(message = "O campo 'usuario' é de preenchimento obrigatório.")
    @Column(name = "usuario")
    private String usuario;

    @NotEmpty(message = "O campo 'senha' é de preenchimento obrigatório.")
    @Column(name = "senha")
    private String senha;
}
