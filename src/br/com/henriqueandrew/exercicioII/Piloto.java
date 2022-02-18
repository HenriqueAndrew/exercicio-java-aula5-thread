package br.com.henriqueandrew.exercicioII;

// @author Henrique Andrew da Silva

public class Piloto {
    
    private String nome;
    private int colocacao;
    private int pontos;
    
    public Piloto(){
        
    }
    
    public Piloto(String nome, int colocacao){
        this.nome = nome;
        this.colocacao = colocacao;       
    }
    
    public Piloto(String nome, int colocacao, int pontos){
        this.nome = nome;
        this.colocacao = colocacao;
        this.pontos = pontos;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getColocacao() {
        return colocacao;
    }

    public void setColocacao(int colocacao) {
        this.colocacao = colocacao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return nome + " >> colocacao = " + colocacao + ", pontos = " + pontos + '\n';
    }       

}
