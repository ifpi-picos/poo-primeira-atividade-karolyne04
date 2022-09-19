package br.edu.ifpi;
public class Professor {

    private String nome;
    public String getNomeP(){
        return nome;
    }
    private String email;
    public String getEmailP(){
        return email;
    }
    private String formacao;
    public String getFormacao(){
        return formacao;
    }

    public Professor(String nome, String email, String formacao){
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;
    }
}
    