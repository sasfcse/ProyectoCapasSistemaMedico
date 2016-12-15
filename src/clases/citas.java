
package clases;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class citas {
    private int id_citas;
    private Date fecha;
    private String hora;
    private pacientes paciente;
    private pacientes cedula;
    private String precio;
    private especialidades especialidad;
    private medicos medico;

    public citas(int id_citas, Date fecha, String hora, pacientes paciente, pacientes cedula, String precio, especialidades especialidad, medicos medico) {
        this.id_citas = id_citas;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.cedula = cedula;
        this.precio = precio;
        this.especialidad = especialidad;
        this.medico = medico;
    }

    public citas(Date fecha, String hora, pacientes paciente, pacientes cedula, String precio, especialidades especialidad, medicos medico) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.cedula = cedula;
        this.precio = precio;
        this.especialidad = especialidad;
        this.medico = medico;
    }

    public int getId_citas() {
        return id_citas;
    }

    public void setId_citas(int id_citas) {
        this.id_citas = id_citas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(pacientes paciente) {
        this.paciente = paciente;
    }

    public pacientes getCedula() {
        return cedula;
    }

    public void setCedula(pacientes cedula) {
        this.cedula = cedula;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(especialidades especialidad) {
        this.especialidad = especialidad;
    }

    public medicos getMedico() {
        return medico;
    }

    public void setMedico(medicos medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "citas{" + "id_citas=" + id_citas + ", fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", cedula=" + cedula + ", precio=" + precio + ", especialidad=" + especialidad + ", medico=" + medico + '}';
    }
    
    
    

   
}