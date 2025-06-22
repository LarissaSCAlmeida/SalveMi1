package br.com.salvemi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table; // Opcional: para especificar o nome da tabela se for diferente do nome da classe

@Entity // ESSENCIAL: Marca esta classe como uma entidade JPA
@Table(name = "usuario") // Opcional: Especifica o nome da tabela no banco de dados
public class Usuario {

    @Id // ESSENCIAL: Marca este campo como a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Opcional: Configura o ID para ser auto-incrementável
    private int id;
    private String nome;
    private String email;
    private String senha;

    // Construtor padrão (sem argumentos) é necessário para JPA
    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters (necessários para JPA)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    // REMOVA o método exibirUsuario() daqui
}
