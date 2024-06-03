public class Main {
    public static void main(String[] args) {
        TiendaRopa tienda = new TiendaRopa();
        tienda.iniciarVenta();
    }
}

class TiendaRopa {
    private String nombreTienda;
    private String descripcionTienda;
    private Vendedor vendedor;
    private Cliente cliente;

    public TiendaRopa() {
        this.nombreTienda = "Ropa Española";
        this.descripcionTienda = "Tienda de ropa en español";
        this.vendedor = new Vendedor("Juan", "Hola, ¿en qué puedo ayudarte?");
        this.cliente = new Cliente("María", "Hola, estoy buscando una camisa");
    }

    public void iniciarVenta() {
        System.out.println("Bienvenido a " + this.nombreTienda + ". " + this.descripcionTienda);
        this.vendedor.saludar();
        this.cliente.saludar();
        this.realizarVenta();
    }

    private void realizarVenta() {
        System.out.println("¿Qué deseas comprar?");
        // Aquí se puede agregar la lógica para realizar la venta
    }
}

class Vendedor {
    private String nombre;
    private String saludo;

    public Vendedor(String nombre, String saludo) {
        this.nombre = nombre;
        this.saludo = saludo;
    }

    public void saludar() {
        System.out.println(this.saludo);
    }
}

class Cliente {
    private String nombre;
    private String saludo;

    public Cliente(String nombre, String saludo) {
        this.nombre = nombre;
        this.saludo = saludo;
    }

    public void saludar() {
        System.out.println(this.saludo);
    }
}