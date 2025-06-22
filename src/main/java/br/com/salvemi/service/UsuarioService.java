package br.com.salvemi.service;
import br.com.salvemi.entity.Usuario;
import br.com.salvemi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
