package br.com.leandrosenazuza.DessafioBancoDigitalDio.Service;

import br.com.leandrosenazuza.DessafioBancoDigitalDio.DTO.ContaDTOResponse;
import br.com.leandrosenazuza.DessafioBancoDigitalDio.Model.ModeloConta;
import br.com.leandrosenazuza.DessafioBancoDigitalDio.Repository.BancoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContaService {
    //Injeto o repository no service
    BancoRepository bancoRepository;

    public ContaService(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    @Transactional
    public ModeloConta save(ModeloConta modeloConta) {
        return bancoRepository.save(modeloConta);
    }

    public List<ContaDTOResponse> listarTodasContas() {
        List<ModeloConta> modeloContas = bancoRepository.findAll();
        List<ContaDTOResponse> contaDTOResponses = new ArrayList<>(); // lista que recebe com forma certo
        for (ModeloConta a : modeloContas) {
            ContaDTOResponse contaDTOResponseElemento = ContaDTOResponse.builder()
                    .nomeDoTitular(a.getNomeDoTitular())
                    .build();
            contaDTOResponses.add(contaDTOResponseElemento);
        }
        return contaDTOResponses;
    }


}
