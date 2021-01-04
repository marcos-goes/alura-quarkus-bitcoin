package br.com.alura.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
public class Bitcoin {

    @EqualsAndHashCode.Exclude
    private Long id;

    private Double preco;

    private String tipo;

    private LocalDate data;
}
