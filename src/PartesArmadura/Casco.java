package PartesArmadura;

import Entity.Armadura;

public class Casco { 
    
    protected Consola consola;
    protected Sintetizador sintetizador;
    protected int energiaConsola;
    protected int energiaSintetizador;
    public Casco() {
    }

    public Casco(Consola consola, Sintetizador sintetizador, int energiaConsola, int energiaSintetizador) {
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.energiaConsola = energiaConsola;
        this.energiaSintetizador = energiaSintetizador;
    }
    public Consola getConsola() {
        return consola;
    }
    public void setConsola(Consola consola) {
        this.consola = consola;
    }
    public Sintetizador getSintetizador() {
        return sintetizador;
    }
    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }
    public int getEnergiaConsola() {
        return energiaConsola;
    }
    public void setEnergiaConsola(int energiaConsola) {
        this.energiaConsola = energiaConsola;
    }
    public int getEnergiaSintetizador() {
        return energiaSintetizador;
    }
    public void setEnergiaSintetizador(int energiaSintetizador) {
        this.energiaSintetizador = energiaSintetizador;
    }

    @Override
    public String toString() {
        return "Casco [consola=" + consola + ", sintetizador=" + sintetizador + ", energiaConsola=" + energiaConsola
                + ", energiaSintetizador=" + energiaSintetizador + "]";
    }

    
}

//casco: consola y sintetizador

//Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
//establecido en estos dispositivos. Solo se usa en nivel básico.