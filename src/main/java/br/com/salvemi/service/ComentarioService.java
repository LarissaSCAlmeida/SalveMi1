package br.com.salvemi.service;

import br.com.salvemi.entity.Comentario;
import br.com.salvemi.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public Comentario salvar(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public List<Comentario> listarTodos() {
        return comentarioRepository.findAll();
    }

    public void deletar(Long id) {
        comentarioRepository.deleteById(id.intValue()); // JpaRepository usa o tipo da chave primária
    }
}


