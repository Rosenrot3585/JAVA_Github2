package Service;

import Entity.Armadura;
import java.util.Scanner;

public class ArmaduraService {

    Scanner sc;
    int tiempo = 0;

    public ArmaduraService() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public void llenarDatosArmadura(Armadura arm) {

        System.out.println("Ingrese color primario, por favor ");
        arm.setColorPrimario(sc.next());

        System.out.println("\nIngrese color secundario, por favor");
        arm.setColorSecundario(sc.next());

        System.out.println(" \nNivel de resistencia: \n");
        arm.setNivelDeResistencia(medidaRockwell());

        System.out.println(" \nNivel de salud: \n");
        arm.setNivelDeSalud(medirNivelDeSalud());

    }

    public String medidaRockwell() { //Armadura arm

        System.out.println("Ingrese el valor obtenido de la dureza, por favor (número entero del 10 al 80)");
        int dureza = sc.nextInt();
        String letra = "";
        String rockwell = "";

        if (dureza < 10 || dureza > 80) {

            do {
                System.out.println("Ingrese un número del 10 al 80, por favor");
                dureza = sc.nextInt();
                System.out.println("Dureza: " + dureza);
            } while (dureza < 10 || dureza > 80);
        }
        if (dureza > 9 && dureza < 81) {
            System.out.println("Ingrese la letra correspondiente a la escala usada");
            letra = sc.next();
            rockwell = dureza + "HR" + letra.toUpperCase();
        }
        System.out.println("Resistencia: " + rockwell);
        return rockwell;
    }

    public int medirNivelDeSalud() {

        int nivel = 0;

        System.out.println("Ingrese nivel de salud, por favor (número entero del 1 al 100)");
        nivel = sc.nextInt();
        if (nivel > 0 && nivel < 101) {

            //  return nivel;
        } else {
            do {
                System.out.println("Ingrese un número entre 1 y 100, por favor");
                nivel = sc.nextInt();
            } while (nivel < 1 || nivel > 100);
        }
        System.out.println("\nSalud: " + nivel + "\n");
        return nivel;
    }

    public void caminar(Armadura arm) {

        System.out.println("Ingrese cuanto tiempo va a caminar");
        tiempo = sc.nextInt();

        arm.setBateria(arm.getBateria() - (arm.getBotas().getEnergia() * tiempo));

        System.out.println("La energia gastada al caminar es: " + (arm.getBotas().getEnergia() * tiempo));

    }

    public void correr(Armadura arm) {

        System.out.println("Ingrese cuanto tiempo va a caminar");
        tiempo = sc.nextInt();

        arm.setBateria(arm.getBateria() - (arm.getBotas().getEnergia() * 2 * tiempo));

        System.out.println("La energia gastada al correr es: " + (arm.getBotas().getEnergia() * 2 * tiempo));
    }

    public void propulsar(Armadura arm) {

        System.out.println("Ingrese cuanto tiempo va a caminar");
        tiempo = sc.nextInt();

        arm.setBateria(arm.getBateria() - (arm.getBotas().getEnergia() * 3 * tiempo));

        System.out.println("La energia gastada al correr es: " + (arm.getBotas().getEnergia() * 3 * tiempo));

    }
    
     public void volar(Armadura arm) {
         
         System.out.println("Ingrese cuanto tiempo va a caminar");
        tiempo = sc.nextInt();
        
         arm.setBateria(arm.getBateria() - (((arm.getBotas().getEnergia() *3) + (arm.getGuantes().getEnergia()*2)) * tiempo));  

        System.out.println("La energia gastada al correr es: " + (((arm.getBotas().getEnergia() *3) + (arm.getGuantes().getEnergia()*2)) * tiempo));
         
     }
     
     public void escribir(Armadura arm) {
         
         System.out.println("Ingrese cuanto tiempo va a escribir");
        tiempo = sc.nextInt();

        arm.setBateria(arm.getBateria() - (arm.getCasco().getEnergiaConsola() * tiempo));

        System.out.println("La energia gastada al escribir es: " +  (arm.getCasco().getEnergiaConsola() * tiempo));
         
     }
     
      public void hablar(Armadura arm) {
         
         System.out.println("Ingrese cuanto tiempo va a hablar");
        tiempo = sc.nextInt();

        arm.setBateria(arm.getBateria() - (arm.getCasco().getEnergiaSintetizador()* tiempo));

        System.out.println("La energia gastada al escribir es: " +  (arm.getCasco().getEnergiaSintetizador()* tiempo));
         
     }
}

//Las durezas Rockwell y Rockwell superficial vienen dadas por la siguiente fórmula:
//nHR(Letra)
//donde:
// n es el valor de dureza obtenido;
//HR es el identificador del ensayo Rockwell;
// (Letra) va a continuación de {HR} y es la letra correspondiente a la escala usada.
// Un ejemplo para un material en el que se obtiene en el ensayo una dureza de 60 y se ha usado la escala B sería:
// 60 HRB
// nivel de salud, del 1 al 100
//Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//establecida como consumo en la bota por el tiempo en el que se camine.
//• Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//energía establecida como consumo en la bota por el tiempo en el que se corra.
//• Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//energía por el tiempo que dure la propulsión.

//• Al volar la armadura hará un uso intensivo de las botas y de los guantes en uso normal
//consumiendo el triple de la energía establecida para las botas y el doble para los guantes.

//Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
//establecido en estos dispositivos. Solo se usa en nivel básico.