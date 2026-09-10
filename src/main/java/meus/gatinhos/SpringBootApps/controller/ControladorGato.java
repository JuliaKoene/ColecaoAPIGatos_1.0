package meus.gatinhos.SpringBootApps.controller;

import meus.gatinhos.SpringBootApps.entity.Gato;
import meus.gatinhos.SpringBootApps.service.ServicoGato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class ControladorGato {
    private final ServicoGato servicoGato;

    @Autowired
    public ControladorGato(ServicoGato servicoGato) {
        this.servicoGato = servicoGato;
    }
    @PostMapping("/gato")
    public ResponseEntity<Gato> saveProduct(@RequestBody Gato gato) {
        Gato novoGato = servicoGato.saveGato(gato);
        return ResponseEntity.ok(novoGato);
    }
    @GetMapping("/gatos")
    public List<Gato> getAllProducts() {
        return servicoGato.getAllGatos();
    }
    /*
    @GetMapping("/gatos/{id}")
    public ResponseEntity<Gato> getProductById(@PathVariable UUID id) {
        Optional<Gato> gato = servicoGato.getGatoById(id);
        return gato.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PutMapping("/gatos/{id}")
    public ResponseEntity<Gato> updateProduct(@PathVariable UUID id, @RequestBody Gato gato) {
        Gato updateGato = servicoGato.updateGato(id, gato);
        return ResponseEntity.ok(updateGato);
    }
    @DeleteMapping("/gatos/{id}")
    public ResponseEntity<String> deletaGato(@PathVariable UUID id) {
        servicoGato.deletaGato(id);
        return ResponseEntity.ok("Gato deletado, tchau gatinho :(");
    }
     */
}
