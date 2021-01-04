package br.com.alura.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    private Double preco;

    private String tipo;

    private LocalDate data;

    private String status;

    @Column(name = "user_id")
    private Long userId;
}
