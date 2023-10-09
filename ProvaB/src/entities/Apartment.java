package entities;

import java.util.Objects;

public class Apartment implements Cloneable{
    private int number; // Número do quarto
    private byte capacity; // Capacidade do quarto
    private boolean doubleBed; // Se o quarto tem cama de casal
    private boolean busy; // Verificador se o quarto está ocupado
    private boolean interdict;  // Verificador se o quarto está interditado

    // Construtor
    public Apartment(int number, byte capacity, boolean doubleBed, boolean busy, boolean interdict){
        this.number = number;
        this.capacity = capacity;
        this.doubleBed = doubleBed;
        this.busy = busy;
        this.interdict = interdict;
    }

    // Getters
    public int getNumber() { return number; }
    public byte getCapacity() { return capacity; }
    public boolean getDoubleBed() { return doubleBed; }
    public boolean getBusy() { return busy; }
    public boolean getInterdict() { return interdict;}

    // Setters
    public void setNumber(int number) { this.number = number; }
    public void setCapacity(byte capacity) { this.capacity = capacity; }
    public void setDoubleBed(boolean doubleBed) { this.doubleBed = doubleBed; }
    public void setBusy(boolean busy) { this.busy = busy; }
    public void setInterdict(boolean interdict) { this.interdict = interdict; }

    @Override
    public String toString() {
        return "Apartment{" +
                "number="+ number +
                ", capacity="+ capacity+
                ", doubleBed="+ doubleBed+
                ", busy="+ busy +
                ", interdict="+ interdict+
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Apartment apartment = (Apartment) obj;
        return number == apartment.number &&
                capacity == apartment.capacity &&
                doubleBed == apartment.doubleBed &&
                busy == apartment.busy &&
                interdict == apartment.interdict;
    }

    @Override
    public int hashCode() { return Objects.hash(number, capacity, doubleBed, busy, interdict); }

    @Override
    public Object clone() { return new Classe(this.number, this.capacity, this.doubleBed, this.busy, this.interdict); }
}
