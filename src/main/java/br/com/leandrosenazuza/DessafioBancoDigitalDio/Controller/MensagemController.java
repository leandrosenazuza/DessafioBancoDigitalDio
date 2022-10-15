package br.com.leandrosenazuza.DessafioBancoDigitalDio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MensagemController {
    @RequestMapping("/teste")
    @ResponseBody
    public String EnvioDeMensagemController(){
        return "oi";
    }

}
