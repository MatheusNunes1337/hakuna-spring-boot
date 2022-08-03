package br.edu.ifsul.hakuna.api.grupo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/grupos")
public class GrupoController {
    @GetMapping
    public ResponseEntity<String> selectAll() {
        return ResponseEntity.ok("select all!");
    }

    @GetMapping("{id}")
    public ResponseEntity<String> selectById(@PathVariable("id") Long id) {
        return ResponseEntity.ok("select by id!"+ id);
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<String> selectByName(@PathVariable("nome") String nome) {
        return ResponseEntity.ok("select by name!"+ nome);
    }

    @PostMapping
    @Secured({"ROLE_ADMIN"})
    public ResponseEntity<String> insert(@RequestBody Grupo grupo) {
        return ResponseEntity.ok("insert!"+ grupo);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> update(@PathVariable("id") Long id, @RequestBody Grupo grupo) {
        return ResponseEntity.ok("update!"+grupo +id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> update(@PathVariable("id") Long id) {
        return ResponseEntity.ok("delete!" +id);
    }


}
