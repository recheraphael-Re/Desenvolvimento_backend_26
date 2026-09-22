package com.senai.cit_senai.models;

import java.math.BigDecimal;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity; // biblioteca para persistencia de dados
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// Cria tabela para relacionar com o banco de dados
@Entity 
@Table (name="consultor") // Cria tabela chamada consultor
public class Consultor {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "id_consultor")
    private Long idConsultor; // id do consultor   
    
// Cria coluna da tabela consultor

@Column (name= "nome",nullable = false, length = 150)
private  String nome;

@Column (name = "email", nullable = false, unique = true, length = 150)
private  String email;

@Column (name = "telefone", length = 30)
private  String telefone;   

// Relacionamento para cliente, entao um consultor pode ter mais de um cliente  
@OneToMany (mappedBy = "consultor")
private List<Cliente> clientes = new ArrayList<>(); // Atributo clientes do tipo lista de clientes

// Cria um construtor vazio para a classe Consultor

// Cria o construtor cliente vazio, pois posso criar um cliente inicial sem passar parametros quando cria

public Consultor(){

}

// Cria outro construtor com parametros para iniciar

public Consultor(String nome, String email, String telefone){
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
}

public Long getIdLong(){
    return idConsultor;
}

public  void setIdConsultor(Long idConsultor){
    this.idConsultor = idConsultor;
}

public String getNome(){
    return  nome;
}

public void setNome(String nome){
    this.nome = nome;

}

public String getEmail(){
    return  email;
}

public void setEmail(String email){
    this.email = email;
}

public String getTelefone(){
    return telefone;
}

public void setTelefone(String telefone){
    this.telefone = telefone;
  
}

public List<Cliente> getClientes(){
    return clientes;
}

public void setClientes(List<Cliente> clientes){
    this.clientes = clientes;

}
