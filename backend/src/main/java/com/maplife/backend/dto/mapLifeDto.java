package com.aos.productsapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

//@Schema documenta essa classe na interface swagger
@Schema(description = "Habit data transfer object")
public class mapLifeDto {

    // READ_ONLY indica ao swagger que o cliente nao envia o ID, apenas recebe
    @Schema(description = "Unique identifier of the Habit", example = "1",
     accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    // @NotBlank impede que o campo seja vazio ou tenha so espacos
    // @Size limita os tamanhos minimo e maximo do campo
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 chacacters")
    @Schema(description = "Name of the habit", example = "Notebook")
    private String name;

    @NotBlank(message = "Description is required")
    @Size(max = 100, message = "Description must not exceed 255 chacacters")
    @Schema(description = "Short description of the habit", example = "15-inch laptop")
    private String description;

   // Garante que a dificuldade esteja entre 0 e 10
@Min(value = 0, message = "Difficulty must be at least 0")
@Max(value = 10, message = "Difficulty must be at most 10")
@Schema(description = "Habit difficulty from 0 to 10", example = "9")
private int difficulty;

// Construtor usado pelo ProductMapper para montar o DTO a partir da entidade
    public mapLifeDto(Long id, String name, String descripton, int difficulty) {
        this.id = id;
        this.name = name;
        this.description = descripton;
        this.difficulty = difficulty;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getdificulty() {
        return difficulty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setdificulty(double difficulty) {
        this.difficulty = difficulty;
    }


}




