package br.com.salvemi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne; // Para relacionamento muitos para um
import jakarta.persistence.JoinColumn; // Para especificar a coluna de junção

@Entity // ESSENCIAL: Marca esta classe como uma entidade JPA
@Table(name = "comentario") // Opcional: Especifica o nome da tabela no banco de dados
public class Comentario {

    @Id // ESSENCIAL: Marca este campo como a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Opcional: Configura o ID para ser auto-incrementável
    private int id;
    private String texto;
    private String data; // Considere usar java.time.LocalDate ou java.util.Date para datas

    @ManyToOne // Define o relacionamento: muitos comentários para um usuário
    @JoinColumn(name = "usuario_id") // Especifica a coluna de chave estrangeira na tabela 'comentario'
    private Usuario usuario;

    // Construtor padrão (sem argumentos) é necessário para JPA
    public Comentario() {
    }

    public Comentario(int id, String texto, String data, Usuario usuario) {
        this.id = id;
        this.texto = texto;
        this.data = data;
        this.usuario = usuario;
    }

    // Getters e Setters (necessários para JPA)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    // REMOVA o método exibirComentario() daqui
}
