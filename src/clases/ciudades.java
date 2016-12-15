
package clases;

/**
 *
 * @author usuario
 */
public class ciudades {
    private int id_ciudad;
    private String nombre;

    public ciudades(int id_ciudad, String nombre) {
        this.id_ciudad = id_ciudad;
        this.nombre = nombre;
    }

    public ciudades(String nombre) {
        this.nombre = nombre;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ciudades{" + "id_ciudad=" + id_ciudad + ", nombre=" + nombre + '}';
    }

    public ciudades getCiudad(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
