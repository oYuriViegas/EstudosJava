package entities;

import java.util.Objects;

public class Hotel implements Cloneable {
    private Apartment[] apartments;

    // Construtor
    public Hotel(int floors) throws Exception {
        if (floors <= 0) throw new Exception("Quantidade inválida de classes");

        int totalApartments = calculateTotalApt(floors);
        this.apartments = new Apartment[totalApartments];

        int index = 0;

        int qntFloE = Math.round(floors * 0.20f);   // Andares tipo E: 20% dos andares com 10 apartamentos de casal com cama adicional
        int qntFloD = Math.round(floors * 0.15f);   // Andares tipo D: 15% dos andares com 20 apartamentos single
        int qntFloC = Math.round(floors * 0.15f);   // Andares tipo C: 15% dos andares com 15 apartamentos duplos
        int qntFloB = Math.round(floors * 0.30f);   // Andares tipo B: 30% dos andares com 15 apartamentos triplos
        int qntFloA = floors - (qntFloB + qntFloC + qntFloD + qntFloE); // Andares tipo A: demais andares do hotel com 5 apartamentos quádruplos e 5 apartamentos decasal sem cama adicional


        //  Adicionando apartamentos dos andares do tipo E
        for (int i = 1; i <= qntFloE && index < totalApartments; i++) {
            for (int j = 1; j <= 10 && index < totalApartments; j++) {
                int aptNumber = i * 100 + j;
                apartments[index++] = new Apartment(aptNumber, (byte) 3, true, false, false);
            }
        }

        //  Adicionando apartamentos dos andares do tipo D
        for (int i = qntFloE + 1; i <= qntFloE + qntFloD && index < totalApartments; i++) {
            for (int j = 1; j <= 20 && index < totalApartments; j++) {
                int aptNumber = i * 100 + j;
                apartments[index++] = new Apartment(aptNumber, (byte) 1, false, false, false);
            }
        }

        //  Adicionando apartamentos dos andares do tipo C
        for (int i = qntFloE + qntFloD + 1; i <= qntFloE + qntFloD + qntFloC && index < totalApartments; i++) {
            for (int j = 1; j <= 15 && index < totalApartments; j++) {
                int aptNumber = i * 100 + j;
                apartments[index++] = new Apartment(aptNumber, (byte) 2, false, false, false);
            }
        }

        //  Adicionando apartamentos dos andares do tipo B
        for (int i = (qntFloE + qntFloC + qntFloD) + 1; i <= qntFloE + qntFloC + qntFloD + qntFloB && index < totalApartments; i++) {
            for (int j = 1; j <= 15 && index < totalApartments; j++) {
                int aptNumber = i * 100 + j;
                apartments[index++] = new Apartment(aptNumber, (byte) 3, false, false, false);
            }
        }

        //  Adicionando apartamentos dos andares do tipo A
        for (int i = (qntFloE + qntFloC + qntFloD + qntFloB) + 1; i <= qntFloE + qntFloC + qntFloD + qntFloB + qntFloA && index < totalApartments; i++) {
            for (int j = 1; j <= 10 && index < totalApartments; j++) {
                int aptNumber = i * 100 + j;
                if (j <= 5) {
                    apartments[index++] = new Apartment(aptNumber, (byte) 4, false, false, false);
                } else {
                    apartments[index++] = new Apartment(aptNumber, (byte) 2, true, false, false);
                }
            }
        }

    }

    private int calculateTotalApt(int floor) {
        int total = 0;

        total += (int) (floor * 0.2) * 10;  // 20% dos floor com 10 aptos
        total += (int) (floor * 0.15) * 20; // 15% dos floor com 20 aptos
        total += (int) (floor * 0.15) * 15; // 15% dos floor com 15 aptos
        total += (int) (floor * 0.3) * 15;  // 30% dos floor com 15 aptos

        return total;
    }

    public void closeOff(int apartmentNumber) {
        for (Apartment apt : apartments) {
            if (apt.getNumber() == apartmentNumber) {
                apt.setInterdict(true);
                break;
            }
        }
    }

    public void occupy(int apartmentNumber) {
        for (Apartment apt : apartments) {
            if (apt.getNumber() == apartmentNumber) {
                apt.setBusy(true);
            }
        }
    }

    public void vacate(int apartmentNumber) {
        for (Apartment apt : apartments) {
            if (apt.getNumber() == apartmentNumber) {
                apt.setBusy(false);
            }
        }
    }

    public int getCapacity() {
        int aux = 0;
        for (Apartment apt : apartments) {
            if (!apt.getBusy() && !apt.getInterdict()) {
                aux += apt.getCapacity();
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel{");
        sb.append("apartments=");
        if (apartments != null) {
            sb.append("[");
            for (int i = 0; i < apartments.length; i++) {
                sb.append(apartments[i]);
                if (i < apartments.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
        } else {
            sb.append("null");
        }
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Hotel hotel = (Hotel) obj;
        if (apartments.length != hotel.apartments.length) return false;
        for (int i = 0; i < apartments.length; i++) {
            if (!apartments[i].equals(hotel.apartments[i])) return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        int result = 1;
        for (int i = 0; i < apartments.length; i++) {
            result = 31 * result + (apartments[i] == null ? 0 : apartments[i].hashCode());
        }
        return result;
    }

    @Override
    public Hotel clone() {
        try {
            Hotel cloned = (Hotel) super.clone();
            cloned.apartments = apartments.clone();
            for (int i = 0; i < apartments.length; i++) {
                if (apartments[i] != null) {
                    cloned.apartments[i] = (Apartment) apartments[i].clone();
                }
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();  // Can't happen
        }
    }
}
