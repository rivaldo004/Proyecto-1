import java.util.ArrayList;

// Tienda class
public class Tienda {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String horario,
    private String descripcion;
    private list<Producto> producto;

    public tienda(String nombre, String direccion, String telefono, String telefono, String correo,String horario, String descripcion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.horario = horario;
        this.descripcion = descripcion;
        this.producto = new ArrayList<>()
    }

    public void removerProducto(Producto producto){
        this.producto.add(producto);
    }

    public void removerProducto(Producto producto){
        this.producto.remove(producto);
    }

    public Producto buscarProducto(String nombre){
        for (Producto producto: producto){
            if (producto.getNombre().equals(nombre)){
                return producto;
            }
        }
        return null;
    }

    public list<Producto> obtenerInventario(){
        return this.producto;
    }
}