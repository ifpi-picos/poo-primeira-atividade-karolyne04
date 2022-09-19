package br.edu.ifpi;

public class Certificado {
    
    private String nomeAluno;
    public String getNomeAluno(){
        return nomeAluno;
    }
    private String nomeCurso;
    public String getNomeCurso(){
        return nomeCurso;
    }
    private int cargaHoraria;
    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public Certificado(String nomeAluno, String nomeCurso, int cargaHoraria){
        this.nomeAluno = nomeAluno;
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
        }
    }