package com.maplife.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn( name = "habito_id", nullable = false)
    private Habito habito;
    
    @Column( nullable = false)
    private LocalDateTime dataHora;
    

     // Construtor vazio obrigatório pelo JPA para instanciar a entidade internamente
    public Registro(){

    }

    // Construtor usado ao criar um Registro novo (sem ID, pois o banco gera)

    public Registro( LocalDateTime dataHora, Habito habito){
        this.dataHora = dataHora;
        this.habito = habito;
    }

    public Long getId(){
        return id;
    }

    public Habito getHabito(){
        return habito;
    }
    
    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public void setDataHora( LocalDateTime dataHora){
        this.dataHora = dataHora;
    }
}