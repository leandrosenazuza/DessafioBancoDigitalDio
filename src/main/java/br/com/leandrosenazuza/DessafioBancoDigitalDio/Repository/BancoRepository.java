package br.com.leandrosenazuza.DessafioBancoDigitalDio.Repository;

import br.com.leandrosenazuza.DessafioBancoDigitalDio.Model.ModeloConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
/*O @Repository tem como objetivo criar beans para a parte de persistência, além de capturar exceções específicas
        de persistência e repeti-las novamente como uma das exceções não verificadas e unificadas do Spring.*/
@Repository
public interface BancoRepository extends JpaRepository <ModeloConta, UUID> {
}
