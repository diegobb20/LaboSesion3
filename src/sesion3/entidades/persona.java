/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.entidades;

/**
 *
 * @author Estudiante
 */
public class persona {

    private String nombre;
    private String apellido;
    private String dni;
    
    
    private String telefono;
    private String direccion;
    private String correo;
    
    
    private String usurio;
    private String contraseña;
    private String email;
    
    public persona (){}
    
    public persona (String nombre){
        this.nombre = nombre;
    }
    public static persona marcos(){
        return new persona("marcos");
    }
    public static persona carlo(){
        return new persona("carlos");
    }
    public static persona juana(){
        return new persona("juanita");
    }
   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUsurio() {
        return usurio;
    }
    public void setUsurio(String usurio) {
        this.usurio = usurio;
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
