package Entity;

import PartesArmadura.Botas;
import PartesArmadura.Casco;
import PartesArmadura.Guantes;

public class Armadura {

    protected String colorPrimario;
    protected String colorSecundario;
    protected String nivelDeResistencia;  // durezaRockwell
    protected int nivelDeSalud;
    protected int bateria;
    private Botas botas;
    private Guantes guantes;
    private Casco casco;

    public Armadura() {
        botas = new Botas();
        guantes = new Guantes();
        casco = new Casco();

    }

    public Armadura(String colorPrimario, String colorSecundario, String nivelDeResistencia, int nivelDeSalud, int bateria) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelDeResistencia = nivelDeResistencia;
        this.nivelDeSalud = nivelDeSalud;
        this.bateria = bateria;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getNivelDeResistencia() {
        return nivelDeResistencia;
    }

    public void setNivelDeResistencia(String nivelDeResistencia) {
        this.nivelDeResistencia = nivelDeResistencia;
    }

    public int getNivelDeSalud() {
        return nivelDeSalud;
    }

    public void setNivelDeSalud(int nivelDeSalud) {
        this.nivelDeSalud = nivelDeSalud;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return "Armadura {" + "\nColor Primario: " + colorPrimario + ""
                + "\n Color Secundario:" + colorSecundario + ""
                + "\n Nivel De Resistencia: " + nivelDeResistencia + ""
                + "\n Nivel De Salud: " + nivelDeSalud + "\n Batería: " + "\n Botas: " + botas + ""
                + "\n Guantes:" + guantes + "\n Casco: " + casco + '}';
    }

}

//En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele toda la
//información y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
//Iron Man es un exoesqueleto mecánico ficticio usado por Tony Stark cuando asume la identidad
//de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron
//prisioneros.
//Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
//encuentran compuestas de dos propulsores, uno en cada bota; y dos repulsores, uno en cada
//guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.
//La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
//se mide con un número entero cuya unidad de medida de dureza es Rockwell
//(https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras poseen un nivel de salud el
//cual se mide de 0 a 100. Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
//cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
//de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
//parte de la armadura.
//La armadura también posee una consola en el casco, a través de la cual JARVIS le escribe
//información a Iron Man. En el casco también se encuentra un sintetizador por donde JARVIS
//susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
//consola y sintetizador) tienen un consumo de energía asociado.
//Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le pasa
//el nivel de intensidad y el tiempo. El dispositivo debe retornar la energía consumida y la
//armadura deberá informar al generador se ha consumido esa cantidad de energía.
//En esta primera etapa con una armadura podremos: caminar, correr, propulsar, volar, escribir y
//leer.
//• Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//establecida como consumo en la bota por el tiempo en el que se camine.
//• Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//energía establecida como consumo en la bota por el tiempo en el que se corra.
//• Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//energía por el tiempo que dure la propulsión.
//• Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
//consumiendo el triple de la energía establecida para las botas y el doble para los guantes.
//• Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
//• Al utilizar las botas para caminar o correr el consumo es normal durante el tiempo que se
//camina o se corra.
//• Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
//establecido en estos dispositivos. Solo se usa en nivel básico.
//• Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le pasa
//el nivel de intensidad y el tiempo. El dispositivo debe retornar la energía consumida y la
//armadura le deberá informar al generador que se ha consumido esa cantidad de energía.
//Modele las clases, los atributos y los métodos necesarios para poder obtener un modelo real de la
//armadura y del estado de la misma.
