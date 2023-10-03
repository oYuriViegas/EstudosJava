package entities;

import java.util.Objects;

public class Animal implements Cloneable{
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(Animal original){
        this.nome = orginal.nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Animal [nome=" + nome + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return Objects.equals(nome, other.nome);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }

    @Override
    public Animal clone(){
        try{
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }

    }

}
