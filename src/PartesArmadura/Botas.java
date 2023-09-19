package PartesArmadura;

//import Entity.Armadura;
//import Interface.IArmadura;
//import Interface.IBotas;
//import Interface.IVolar;

public class Botas { //extends Armadura implements IArmadura, IBotas, IVolar
    
    protected int energia;

    public Botas() {
        this.energia = 5;
    }

//    public Botas(int energia) {
//        this.energia = energia;
//    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Botas{" + "energia=" + energia + '}';
    }


    
    
    }
    
//}

//Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//establecida como consumo en la bota por el tiempo en el que se camine.

//• Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//energía establecida como consumo en la bota por el tiempo en el que se corra.

//• Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//energía por el tiempo que dure la propulsión.

//• Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
//consumiendo el triple de la energía establecida para las botas y el doble para los guantes.