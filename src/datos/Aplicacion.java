
package datos;

import datosempleados.DatosEmpleados;
import javax.swing.JOptionPane;

public class Aplicacion {
    public static void main(String[] args) {
        DatosEmpleados empleado1=new DatosEmpleados();
        DatosEmpleados empleado2=new DatosEmpleados(); 
        DatosEmpleados empleado3=new DatosEmpleados(); 
        DatosEmpleados empleado4=new DatosEmpleados();  
        DatosEmpleados empleado5=new DatosEmpleados(); 
        
        empleado1.setNombre(JOptionPane.showInputDialog("Ingrese nombre del empleado numero uno")); 
        empleado1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"))); 
        empleado1.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion ")); 
        empleado1.setTelefono(JOptionPane.showInputDialog("Ingrese el numero de telefono")); 
       
        empleado2.setNombre(JOptionPane.showInputDialog("Ingrese nombre del empleado numero dos")); 
        empleado2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"))); 
        empleado2.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion ")); 
        empleado2.setTelefono(JOptionPane.showInputDialog("Ingrese el numero de telefono")); 
        
        empleado3.setNombre(JOptionPane.showInputDialog("Ingrese nombre del empleado numero tres")); 
        empleado3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"))); 
        empleado3.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion ")); 
        empleado3.setTelefono(JOptionPane.showInputDialog("Ingrese el numero de telefono")); 
        
        empleado4.setNombre(JOptionPane.showInputDialog("Ingrese nombre del empleado numero cuatro")); 
        empleado4.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"))); 
        empleado4.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion ")); 
        empleado4.setTelefono(JOptionPane.showInputDialog("Ingrese el numero de telefono"));  
        
        empleado5.setNombre(JOptionPane.showInputDialog("Ingrese nombre del empleado numero cinco")); 
        empleado5.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"))); 
        empleado5.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion ")); 
        empleado5.setTelefono(JOptionPane.showInputDialog("Ingrese el numero de telefono"));  
        
        int empleado;
        empleado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del empleado que desea ver los datos\n 1.Empleado uno\n 2.Empleado dos\n 3.Empleado tres\n 4.Empleado cuatro\n 5.Empleado cinco")); 
        
        switch (empleado){  
            case 1: 
                JOptionPane.showMessageDialog(null, "El nombre es: " +empleado1.getNombre() + "\n La edad es: " +empleado1.getEdad()+"\n La direccion es: "+empleado1.getDireccion()+"\n El numero de telefono es: "+empleado1.getTelefono()); 
            break; 
            case 2: 
                JOptionPane.showMessageDialog(null, "El nombre es: " +empleado2.getNombre() + "\n La edad es: " +empleado2.getEdad()+"\n La direccion es: "+empleado2.getDireccion()+"\n El numero de telefono es: "+empleado2.getTelefono()); 
            break; 
            case 3: 
                JOptionPane.showMessageDialog(null, "El nombre es: " +empleado3.getNombre() + "\n La edad es: " +empleado3.getEdad()+"\n La direccion es: "+empleado3.getDireccion()+"\n El numero de telefono es: "+empleado3.getTelefono()); 
            break; 
            case 4: 
                JOptionPane.showMessageDialog(null, "El nombre es: " +empleado4.getNombre() + "\n La edad es: " +empleado4.getEdad()+"\n La direccion es: "+empleado4.getDireccion()+"\n El numero de telefono es: "+empleado4.getTelefono()); 
            break ; 
            case 5: 
                JOptionPane.showMessageDialog(null, "El nombre es: " +empleado5.getNombre() + "\n La edad es: " +empleado5.getEdad()+"\n La direccion es: "+empleado5.getDireccion()+"\n El numero de telefono es: "+empleado5.getTelefono()); 
            break; 
            default: 
                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida"); 
                
        }
    }
    
}
