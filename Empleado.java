
/**
 * Write a description of class Empleados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado extends Registro
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String cargo;
    private int codigo;

    /**
     * Constructor for objects of class Empleados
     */
    public Empleado(String nombre, String cargo, int codigo)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.cargo=cargo;
        this.codigo=codigo;
    }
    
    /**
     * Gets&Sets
     */
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCodigo(int newCodigo){
        this.codigo= newCodigo;
    }
    public void setNombre(String newNombre){
        this.nombre= newNombre;
    }
    public void setCargo(String newCargo){
        this.cargo= newCargo;
    }
    
    /**
     *Operationals 
     */
    public void verRegistro()
    {}
    public void editarRegistro()
    {}
    public void generarContrato()
    {}
    public void cerrarContrato()
    {}
}
