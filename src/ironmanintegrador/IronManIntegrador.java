package ironmanintegrador;

import Entity.Armadura;
import Service.ArmaduraService;

public class IronManIntegrador {

    public static void main(String[] args) {
        
       ArmaduraService armS = new ArmaduraService();
       Armadura tony = new Armadura() {};
       
       armS.llenarDatosArmadura(tony);
       armS.caminar(tony);
       armS.correr(tony);
       armS.propulsar(tony);
       armS.volar(tony);
       armS.hablar(tony);
       armS.escribir(tony);
       
    }
    
}
