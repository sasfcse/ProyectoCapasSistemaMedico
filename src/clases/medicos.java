
package clases;

/**
 *
 * @author usuario
 */
public class medicos {
    int id_medico;
    String nombre;
    String domicilio;
    String telefono;
    String e_mail;
    String especialidad;
    especialidades id_especialidad;

    public medicos(int id_medico, String nombre, String domicilio, String telefono, String e_mail, String especialidad, especialidades id_especialidad) {
        this.id_medico = id_medico;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.e_mail = e_mail;
        this.especialidad = especialidad;
        this.id_especialidad = id_especialidad;
    }

    public medicos(String nombre, String domicilio, String telefono, String e_mail, String especialidad, especialidades id_especialidad) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.e_mail = e_mail;
        this.especialidad = especialidad;
        this.id_especialidad = id_especialidad;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public especialidades getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(especialidades id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    @Override
    public String toString() {
        return "medicos{" + "id_medico=" + id_medico + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", e_mail=" + e_mail + ", especialidad=" + especialidad + ", id_especialidad=" + id_especialidad + '}';
    }

    
}
