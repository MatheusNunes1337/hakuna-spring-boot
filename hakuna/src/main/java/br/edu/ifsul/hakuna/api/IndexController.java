package br.edu.ifsul.hakuna.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public ResponseEntity<String> getIndex() {
        return ResponseEntity.ok("Consulte a documentação da API.");
    }

    //UserDetails representa o usuário logado na sessão
//    @GetMapping("/user/userInfo")
//    public UserDetails userInfo(@AuthenticationPrincipal UserDetails user) {
//        return user;
//    }

}
