/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.entidades;

public class persona2 {
    private perasonadatosbasicos dataB;
    private personadatoscontacto dataC;
    private personadatosregistro dataR;

    public persona2(perasonadatosbasicos dataB, personadatoscontacto dataC, personadatosregistro dataR) {
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataR;
    }

    public perasonadatosbasicos getDataB() {
        return dataB;
    }
    public void setDataB(perasonadatosbasicos dataB) {
        this.dataB = dataB;
    }
    public personadatoscontacto getDataC() {
        return dataC;
    }
    public void setDataC(personadatoscontacto dataC) {
        this.dataC = dataC;
    }
    public personadatosregistro getDataR() {
        return dataR;
    }
    public void setDataR(personadatosregistro dataR) {
        this.dataR = dataR;
    } 
    public persona2 (){}
}
