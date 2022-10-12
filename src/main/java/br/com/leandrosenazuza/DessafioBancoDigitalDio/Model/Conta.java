package br.com.leandrosenazuza.DessafioBancoDigitalDio.Model;
// A classe Model fala quais sãos as tuplas nas bases de dados
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.UUID;

@Data

@Entity
public class Conta {
    private static final long serialVersionUUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idConta;
    @Column(nullable = false)
    private String nomeDoTitular;
    @Column(nullable = false)
    private SegmentoConta tipoDeSegmentoDaConta;
    @Column(nullable = false)
    private Long saldoEmConta;
}
