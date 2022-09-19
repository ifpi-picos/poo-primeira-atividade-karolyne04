package br.edu.ifpi;

import java.time.LocalDate;



public class Aluno{
    private String nome;
    public void setNomeA(String nome){
        this.nome = nome;
    }
    public String getNomeA(){
        return nome;
    }
    private LocalDate dataNascimento;
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    private String email;
    public String getEmailA(){
        return email;
    }

    public Aluno(String nome, LocalDate dataNascimento, String email){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }
}