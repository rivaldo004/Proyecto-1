import java.util.Date;

public class Compra {
    private Date fecha;
    private Cliente cliente;
    private Producto productos;
    private double total;
    private String metodoPago;
    private String estado;
    private Sting descripcion;

    public Compra(Date fecha, Cliente cliente, list<Producto> productos) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
        this.metodoPago = "";
        this.estado = "";
        this.descripcion = "";
    }

    private double calcularTotal(){
        double total = 0;
        for (productos productos : productos){
            total = productos.obtenerPrecio();
        }
        return total;
    }

    public void actualozarEstado(String estado){
        this.estado = estado;
    }

    public void actualizarMetodoPago(String metodoPago){
        this.metodoPago = metodoPago;
    }

    public void agregarDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    private class Producto {
    }