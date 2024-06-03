import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int idPedido;
    private Date fecha;
    private double total;
    private String estado;
    private ArrayList<Prenda> productos;
    private double impuesto;
    private String formaPago;
    private String direccionEntrega;

    public void solicitar() {
        // Implementar lógica para solicitar pedido
    }

    public void cancelarPedido() {
        // Implementar lógica para cancelar pedido
    }

    public double calcularTotal() {
        // Implementar lógica para calcular total del pedido
        return 0.0;
    }

    public void cambiarEstado() {
        // Implementar lógica para cambiar estado del pedido
    }

    public void agregarProducto(Producto producto1, int i) {
    }