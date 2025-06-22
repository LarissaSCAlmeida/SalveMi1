package br.com.salvemi.controller;

import br.com.salvemi.entity.Comentario;
import br.com.salvemi.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios" )
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @PostMapping
    public ResponseEntity<Comentario> criarComentario(@RequestBody Comentario comentario) {
        Comentario novoComentario = comentarioService.salvar(comentario);
        return new ResponseEntity<>(novoComentario, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Comentario>> listarComentarios() {
        List<Comentario> comentarios = comentarioService.listarTodos();
        return new ResponseEntity<>(comentarios, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarComentario(@PathVariable Long id) {
        comentarioService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
