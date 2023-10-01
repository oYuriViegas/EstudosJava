public class Monomio {
    private double coeficiente, expoente;

    // Getters e setters
    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public double getExpoente() {
        return expoente;
    }

    public void setExpoente(double expoente) {
        this.expoente = expoente;
    }

    // Construtor
    public Monomio(double coeficiente, double expoente) {
        this.coeficiente = coeficiente;
        this.expoente = expoente;
    }

    public Monomio mais(Monomio m) throws Exception {
        if (m == null) {
            throw new Exception("O monômio não pode ser nulo");
        }

        if (this.expoente != m.expoente) {
            throw new Exception("Os expoentes devem ser iguais para a soma");
        }

        return new Monomio(this.coeficiente + m.coeficiente, this.expoente);
    }

    public Monomio menos(Monomio m) throws Exception {
        if (m == null) {
            throw new Exception("O monômio não pode ser nulo");
        }

        if (this.expoente != m.expoente) {
            throw new Exception("Os expoentes devem ser iguais para a subtração");
        }

        return new Monomio(this.coeficiente - m.coeficiente, this.expoente);
    }

    public Monomio vezes(Monomio m) throws Exception {
        if (m == null) {
            throw new Exception("O monômio não pode ser nulo");
        }

        return new Monomio(this.coeficiente * m.coeficiente, this.expoente + m.expoente);
    }

    public Monomio divididoPor(Monomio m) throws Exception {
        if (m == null) {
            throw new Exception("O monômio não pode ser nulo");
        }

        if (m.coeficiente == 0) {
            throw new Exception("Divisão por zero");
        }

        return new Monomio(this.coeficiente / m.coeficiente, this.expoente - m.expoente);
    }

    public double aplicadoA(double x) {
        return this.coeficiente * Math.pow(x, this.expoente);
    }

    @Override
    public String toString() {
        return coeficiente + "x^" + expoente;
    }
}
