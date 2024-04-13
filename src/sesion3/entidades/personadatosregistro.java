/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.entidades;

public class personadatosregistro {
    private String usuriop;
    private String contraseña;
    private String email;
    
    public personadatosregistro(String usuriop, String contraseña, String email) {
        this.usuriop = usuriop;
        this.contraseña = contraseña;
        this.email = email;
    }
    
    public String getUsuriop() {
        return usuriop;
    }
    public void setUsuriop(String usuriop) {
        this.usuriop = usuriop;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }  
}
    
