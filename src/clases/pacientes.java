
package clases;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class pacientes {
   private int id_personas;
   private String cedula;
   private String nombres;
   private Date fechanacimineto;
   private String sexo;
   private String altura;
   private String peso;
   private String tiposangre;
   private String alergias;
   private String telefono;
   private String domicilio;
   private String e_mail;
   private ciudades ciudad; 

    public pacientes(int id_personas, String cedula, String nombres, Date fechanacimineto, String sexo, String altura, String peso, String tiposangre, String alergias, String telefono, String domicilio, String e_mail, ciudades ciudad) {
        this.id_personas = id_personas;
        this.cedula = cedula;
        this.nombres = nombres;
        this.fechanacimineto = fechanacimineto;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.tiposangre = tiposangre;
        this.alergias = alergias;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.e_mail = e_mail;
        this.ciudad = ciudad;
    }

    public pacientes(String cedula, String nombres, Date fechanacimineto, String sexo, String altura, String peso, String tiposangre, String alergias, String telefono, String domicilio, String e_mail, ciudades ciudad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.fechanacimineto = fechanacimineto;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.tiposangre = tiposangre;
        this.alergias = alergias;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.e_mail = e_mail;
        this.ciudad = ciudad;
    }

    
    public int getId_personas() {
        return id_personas;
    }

    public void setId_personas(int id_personas) {
        this.id_personas = id_personas;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechanacimineto() {
        return fechanacimineto;
    }

    public void setFechanacimineto(Date fechanacimineto) {
        this.fechanacimineto = fechanacimineto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(ciudades ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "pacientes{" + "id_personas=" + id_personas + ", cedula=" + cedula + ", nombres=" + nombres + ", fechanacimineto=" + fechanacimineto + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + ", tiposangre=" + tiposangre + ", alergias=" + alergias + ", telefono=" + telefono + ", domicilio=" + domicilio + ", e_mail=" + e_mail + ", ciudad=" + ciudad + '}';
    }
   
}
