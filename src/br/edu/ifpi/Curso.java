package br.edu.ifpi;
import java.time.LocalDate;

public class Curso{
    private String nome;
    public String getNomeC(){
        return nome;
    }
    private int cargaHoraria;
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    private String modalidade;
    public String getModalidade(){
        return modalidade;
    }
    private String nivel;
    public String getNivel(){
        return nivel;
    }
    private LocalDate dataInicio;
    public LocalDate getDataInicio(){
        return dataInicio;
    }
    private LocalDate dataFim;
    public LocalDate getDataFim(){
        return dataFim;
    }
    private Professor professor;
    public Professor getProfessor(){
        return professor;
    }

    public Curso(String nome, int cargaHoraria, String modalidade, String nivel,  LocalDate dataInicio, LocalDate dataFim, Professor p){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
        this.nivel = nivel;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professor = p;
    }


}