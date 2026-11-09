package com.maplife.api.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Habito {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false, length = 100)
    private String nome;

    @Column( nullable = false, length = 250)
    private String descricao;

    @Column( nullable = false)
    private LocalDate dataDeCriacao;



    // Construtor vazio obrigatório pelo JPA para instanciar a entidade internamente
    public Habito(){

    }

     // Construtor usado ao criar um Habito novo (sem ID, pois o banco gera)
    public Habito( String nome, String descricao, LocalDate dataDeCriacao){
        this.nome = nome;
        this.descricao = descricao;
        this.dataDeCriacao = dataDeCriacao;

    }

    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public LocalDate getDataDeCriacao(){
        return dataDeCriacao;

    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao( String descricao){
        this.descricao = descricao;
    }

    public void setDataDeCriacao( LocalDate dataDeCriacao){
        this.dataDeCriacao = dataDeCriacao;
    }


}       

