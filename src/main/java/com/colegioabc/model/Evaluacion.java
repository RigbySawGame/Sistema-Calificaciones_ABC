package com.colegioabc.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;
    
    @Column(nullable = false)
    private double peso;  // Ej: 0.3 para 30%

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public Asignatura getAsignatura() { return asignatura; }
    public void setAsignatura(Asignatura asignatura) { this.asignatura = asignatura; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
}
