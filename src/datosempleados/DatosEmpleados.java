
package datosempleados;


public class DatosEmpleados {

    private String nombre; 
    private int edad;  
    private String direccion; 
    private String telefono; 
   
    
    public DatosEmpleados() { 
       
    }  
    
    public DatosEmpleados(String nombre,int edad, String direccion, String telefono ){
        this. nombre=nombre;
        this.edad=edad; 
        this.direccion=direccion; 
        this.telefono=telefono; 
        
        
    }

   
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
