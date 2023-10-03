package entities;

import java.util.Objects;

public class Escola implements Cloneable {
    private Classe[] classes;

    // a) Construtor
    public Escola(int qtdClasses) throws Exception {
        if (qtdClasses <= 0)
            throw new Exception("Quantidade inválida de classes");

        this.classes = new Classe[qtdClasses];

        // Lógica para criar instâncias de `Classe` conforme especificado
        int index = 0;

        int qtdFundamentalI = Math.round(qtdClasses * 0.25f); // 25%
        int qtdFundamentalII = Math.round(qtdClasses * 0.40f); // 40%
        int qtdMedio12 = Math.round(qtdClasses * 0.20f); // 20%
        int qtdMedio3 = qtdClasses - (qtdFundamentalI + qtdFundamentalII + qtdMedio12); // restante

        // Adicionando classes de Ensino Fundamental I
        for (int i = 1; i <= 5 && index < qtdClasses; i++) {
            for (int j = 0; j < (qtdFundamentalI / 5) && index < qtdClasses; j++, index++) {
                classes[index] = new Classe('1', i, (char) ('A' + j), 20, 'A');
            }
        }

        // Adicionando classes de Ensino Fundamental II
        for (int i = 6; i <= 9 && index < qtdClasses; i++) {
            for (int j = 0; j < (qtdFundamentalII / 4) && index < qtdClasses; j++, index++) {
                classes[index] = new Classe('2', i, (char) ('A' + j), 30, 'A');
            }
        }

        // Adicionando classes de Ensino Médio (1º e 2º ano)
        for (int i = 1; i <= 2 && index < qtdClasses; i++) {
            for (int j = 0; j < (qtdMedio12 / 2) && index < qtdClasses; j++, index++) {
                classes[index] = new Classe('M', i, (char) ('A' + j), 40, 'A');
            }
        }

        // Adicionando classes de Ensino Médio (3º ano)
        for (int j = 0; j < qtdMedio3 && index < qtdClasses; j++, index++) {
            classes[index] = new Classe('M', 3, (char) ('A' + j), 40, 'A');
        }
    }


    // b) Métodos setOnde e getOnde
    public void setOnde(char nivel, int ano, char turma, char novoOnde) {
        for (Classe classe : classes) {
            if (classe.getNivel() == nivel && classe.getAno() == ano && classe.getTurma() == turma) {
                classe.setOnde(novoOnde);
                return;
            }
        }
    }

    public char getOnde(char nivel, int ano, char turma) {
        for (Classe classe : classes) {
            if (classe.getNivel() == nivel && classe.getAno() == ano && classe.getTurma() == turma) {
                return classe.getOnde();
            }
        }
        return 'N'; // Não encontrado
    }

    // c) Método capacidade
    public int capacidade() {
        int total = 0;
        for (Classe classe : classes) {
            total += classe.getTamanho();
        }
        return total;
    }

    // d) Métodos toString, equals, hashCode, clone
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Classe classe : classes) {
            sb.append(classe.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escola escola = (Escola) o;
        return Objects.equals(classes, escola.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classes);
    }

    @Override
    public Object clone() {
        Escola clonedEscola;
        try {
            clonedEscola = (Escola) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // won't happen
        }

        clonedEscola.classes = new Classe[this.classes.length];
        for (int i = 0; i < this.classes.length; i++) {
            clonedEscola.classes[i] = (Classe) this.classes[i].clone();
        }
        return clonedEscola;
    }
}
