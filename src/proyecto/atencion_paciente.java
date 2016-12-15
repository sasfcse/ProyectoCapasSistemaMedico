package proyecto;




import proyecto.cola_pacientes_1;
import javax.swing.table.DefaultTableModel;

public class atencion_paciente {
    class Nodo{
        int id_citas;
        String fecha,hora, paciente,cedula,medico;
        
        Nodo siguiente;
        public Nodo(){}
        public Nodo(int id_citas , String fecha, String hora,String paciente, String cedula, String medico, Nodo sgte){
            this.id_citas=id_citas;
            this.fecha=fecha;
            this.hora=hora;
            this.paciente=paciente;
            this.cedula=cedula;
            this.medico=medico;
            this.siguiente=sgte;    
        }

        public int getId_citas() {
            return id_citas;
        }

        public void setId_citas(int id_citas) {
            this.id_citas = id_citas;
        }
        
        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public String getPaciente() {
            return paciente;
        }

        public void setPaciente(String paciente) {
            this.paciente = paciente;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getMedico() {
            return medico;
        }

        public void setMedico(String medico) {
            this.medico = medico;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
           
    }
    Nodo inicio, fondo;
        
        public atencion_paciente(){
            inicio=null ; fondo=null;
        }
        public boolean ColaVacia(){
        if (inicio == null)
            return true;
        else 
            return false;
    }
         //2.METODO: INSERTAS NODOS A LA COLA EN FORMA DE LISTA 
    public void InsertarCola(int id,String f, String h, String cli, String ced, String med){
        //a. CREAR EL NODO Y PASARLE LA INFORMACION RESPECTIVA
        Nodo nuevo = new Nodo(id,f,h,cli,ced,med,null);
        if(ColaVacia()){
            inicio= nuevo;
            fondo =nuevo;
        }
        else{
            fondo.setSiguiente(nuevo);
            fondo = nuevo;
        }
    }
    public void llenarTabla(){
       DefaultTableModel tabla =  (DefaultTableModel)cola_pacientes_1.tablamostrar.getModel();
       Object obj[]=new Object[cola_pacientes_1.tablamostrar.getColumnCount()];
       Nodo temp = inicio;
       while(temp!=null){
           obj[0]=temp.id_citas;
           obj[1]=temp.fecha;
           obj[2]=temp.hora;
           obj[3]=temp.paciente;
           obj[4]=temp.cedula;
           obj[5]=temp.medico;
           tabla.addRow(obj);
           temp=temp.getSiguiente();
   
       }
       cola_pacientes_1.tablamostrar.setModel(tabla);
       
    }  
    
    
}
