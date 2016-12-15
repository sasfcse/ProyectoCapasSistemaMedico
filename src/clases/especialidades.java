
package clases;

/**
 *
 * @author usuario
 */
public class especialidades {
    int id_especialidad;
    String nombre;
    int pago;

    public especialidades(int id_especialidad, String nombre, int pago) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
        this.pago = pago;
    }

    public especialidades(String nombre, int pago) {
        this.nombre = nombre;
        this.pago = pago;
    }

    public especialidades(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
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

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "escpecialidades{" + "id_especialidad=" + id_especialidad + ", nombre=" + nombre + ", pago=" + pago + '}';
    }
    
}
