
package clases;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class especialidades {
    int id_especialidad;
    String nombre;
    String pago;

    public especialidades(int id_especialidad, String nombre, String pago) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
        this.pago = pago;
    }
//------------------------------------------------

    public especialidades(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }
   
//-------------------------------------------------
    
    public especialidades(int id_especialidad, String nombre) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
    }
//--------------------------------------------------
    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return  nombre ;
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
        final especialidades other = (especialidades) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
