/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3;


import sesion3.entidades.persona;
import sesion3.entidades.persona2;
import sesion3.entidades.perasonadatosbasicos;
import sesion3.entidades.personadatoscontacto;
import sesion3.entidades.personadatosregistro;

public class Sesion3 {

    public static void main(String[] args) {
        persona per = new persona();
        per.setNombre("juan");
        per.setApellido("diaz");
        per.setDni("0005555");
        per.setDireccion("Av manzanitas 456");
        per.setTelefono("991847595");
        per.setCorreo("");
        per.setUsurio("");
        per.setContraseña("");
        per.setEmail("");
        
        perasonadatosbasicos dataB 
                = new perasonadatosbasicos("juan","diaz","0005555");
        personadatoscontacto dataC
                = new personadatoscontacto("Av manzanitas 456","991847595","");
        personadatosregistro dataR 
                = new personadatosregistro("","","");                        
                
        persona2 per2 = new persona2(dataB,dataC,dataR);
        
        persona carlitos = persona.carlo();
        persona marco = persona.marcos();
        persona juana = persona.juana();
        
    }
    
}
