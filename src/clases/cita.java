
package clases;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class cita {
    private int id_citas;
    private Date fecha;
    private String hora;
    private String precio;
    private especialidades especialidad;
    private medicos medico;
    private pacientes paciente;

    public cita(int id_citas, Date fecha, String hora, String precio, especialidades especialidad, medicos medico, pacientes paciente) {
        this.id_citas = id_citas;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.especialidad = especialidad;
        this.medico = medico;
        this.paciente = paciente;
    }

    public cita(Date fecha, String hora, String precio, especialidades especialidad, medicos medico, pacientes paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.especialidad = especialidad;
        this.medico = medico;
        this.paciente = paciente;
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

    public pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(pacientes paciente) {
        this.paciente = paciente;
    }

    
}