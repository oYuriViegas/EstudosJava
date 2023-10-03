package entities;

import java.util.Objects;

public class Classe implements Cloneable {
    private char nivel; // '1': fundamental I, '2': fundamental II ou 'M': médio
    private int ano;
    private char turma;
    private int tamanho;
    private char onde; // 'C': em casa, 'A': em aula, 'L': em laboratório, 'F': na educação física ou 'X': em atividade externa

    // a) Construtor
    public Classe(char nivel, int ano, char turma, int tamanho, char onde) {
        this.nivel = nivel;
        this.ano = ano;
        this.turma = turma;
        this.tamanho = tamanho;
        this.onde = onde;
    }

    // b) Getters
    public char getNivel() { return nivel; }
    public int getAno() { return ano; }
    public char getTurma() { return turma; }
    public int getTamanho() { return tamanho; }
    public char getOnde() { return onde; }

    // c) Setters
    public void setNivel(char nivel) { this.nivel = nivel; }
    public void setAno(int ano) { this.ano = ano; }
    public void setTurma(char turma) { this.turma = turma; }
    public void setTamanho(int tamanho) { this.tamanho = tamanho; }
    public void setOnde(char onde) { this.onde = onde; }

    // d) Métodos: toString, equals, hashCode, clone
    @Override
    public String toString() {
        return "Classe{" +
                "nivel=" + nivel +
                ", ano=" + ano +
                ", turma=" + turma +
                ", tamanho=" + tamanho +
                ", onde=" + onde +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classe classe = (Classe) o;
        return nivel == classe.nivel &&
                ano == classe.ano &&
                turma == classe.turma &&
                tamanho == classe.tamanho &&
                onde == classe.onde;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivel, ano, turma, tamanho, onde);
    }

    @Override
    public Object clone() {
        return new Classe(this.nivel, this.ano, this.turma, this.tamanho, this.onde);
    }
}
