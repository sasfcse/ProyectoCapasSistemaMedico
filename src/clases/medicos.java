
package clases;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class medicos {
    int id_medico;
    String cedula;
    String nombre;
    String domicilio;
    String telefono;
    String e_mail;
    especialidades especialidad;

    public medicos(int id_medico, String cedula, String nombre, String domicilio, String telefono, String e_mail, especialidades especialidad) {
        this.id_medico = id_medico;
        this.cedula = cedula;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.e_mail = e_mail;
        this.especialidad = especialidad;
    }


    public medicos(String cedula, String nombre, String domicilio, String telefono, String e_mail, especialidades especialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.e_mail = e_mail;
        this.especialidad = especialidad;
    }

    public medicos(int id_medico, String domicilio, String telefono, String e_mail, especialidades especialidad) {
        this.id_medico = id_medico;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.e_mail = e_mail;
        this.especialidad = especialidad;
    }

    

    public medicos(int id_medico ) {
        this.id_medico = id_medico;
        
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(especialidades especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final medicos other = (medicos) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

 
}
