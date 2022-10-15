package br.com.leandrosenazuza.DessafioBancoDigitalDio.Model;
// A classe Model fala quais sãos as tuplas nas bases de dados
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data

@Entity
@Table(name = "TB_CONTA")
public class ModeloConta implements Serializable {
    private static final long serialVersionUUID = 1L;
    private static final long serialVersion = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idConta;
    @Column
    private String nomeDoTitular;
}
