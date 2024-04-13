/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.entidades;

/**
 *
 * @author Estudiante
 */
public class personadatoscontacto {
    private String telefono;
    private String direcciono;
    private String correo;
    public personadatoscontacto(String telefono, String direcciono, String correo) {
        this.telefono = telefono;
        this.direcciono = direcciono;
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDirecciono() {
        return direcciono;
    }
    public void setDirecciono(String direcciono) {
        this.direcciono = direcciono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }   
}
