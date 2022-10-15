package br.com.leandrosenazuza.DessafioBancoDigitalDio.Controller;

import br.com.leandrosenazuza.DessafioBancoDigitalDio.DTO.ContaDTOResponse;
import br.com.leandrosenazuza.DessafioBancoDigitalDio.Model.ModeloConta;
import br.com.leandrosenazuza.DessafioBancoDigitalDio.Service.ContaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Vai acionar o service que aciona o repository
@Controller
public class ContaController {
    //preciso injetar o service no controle
    final ContaService contaService;

    public ContaController(ContaService contaService) {
        this.contaService = contaService;
    }

    //A request body is data sent by the client to your API. A response body is the data your API sends to the client.
    @PostMapping("/PostConta")
    public ResponseEntity<Object> saveConta(@RequestBody ContaDTOResponse contaDTOResponse) {
        ModeloConta modeloConta = new ModeloConta();
        BeanUtils.copyProperties(contaDTOResponse, modeloConta);
        return ResponseEntity.status(HttpStatus.CREATED).body(contaService.save(modeloConta));
    }

   @GetMapping("/GetAllAccount")
    public ResponseEntity<List<ContaDTOResponse>> getAllConta(){
        //Crio a a classe find all em Service, pois ele puxa  a classe findAll() de repository
        return ResponseEntity.ok().body((contaService.listarTodasContas()));
   }

   @GetMapping("/GetOneAccount")
   public ResponseEntity<<ContaDTOResponse> getOneConta(){
        return ResponseEntity.ok().body(contaService.listarUmaConta());
   }
}

