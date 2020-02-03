package br.com.gerenciamentofinanceiro.conta;

import br.com.gerenciamentofinanceiro.cartao.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ContaData extends JpaRepository<Conta, Integer> {

    List<Conta> findContaByCartaoAndVencimentoEquals(Cartao cartao, LocalDate data);

    @Query(value = "SELECT * FROM CONTAS WHERE ID_CARTAO = :IDCARTAO AND VENCIMENTO BETWEEN :DTINI AND :DTFIM", nativeQuery = true)
    List<Conta> findContaByCartaoAndVencimento(@Param("IDCARTAO") Integer idCartao,
                                               @Param("DTINI") String dtIni,
                                               @Param("DTFIM") String dtFim);
}
