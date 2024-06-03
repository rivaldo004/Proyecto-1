import java.util.ArrayList;
import java.util.List;

public class Accesorio {

    private int idAccesorio;
    private String nombre;
    private String tipo;
    private String genero;
    private String marca;
    private String material;
    private String color;
    private double precio;
    private int existencias;

    public Accesorio(int idAccesorio, String nombre, String tipo, String genero, String marca, String material, String color, double precio, int existencias) {
        this.idAccesorio = idAccesorio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.marca = marca;
        this.material = material;
        this.color = color;
        this.precio = precio;
        this.existencias = 0;
    }

    public int getIdAccesorio() {
        return idAccesorio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public String getMarca() {
        return marca;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void setGenero(String genero) {
        if (validarGenero(genero)) {
            this.genero = genero;
        } else {
            System.out.println("Error: El género " + genero + " no es válido.");
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: No se puede establecer un precio negativo.");
        }
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int nuevasExistencias) {
        if (nuevasExistencias >= 0) {
            this.existencias = nuevasExistencias;
        } else {
            System.out.println("Error: No se puede establecer una cantidad de existencias negativa.");
        }
    }

    private boolean validarGenero(String genero) {
        List<String> generosValidos = new ArrayList<>();
        generosValidos.add("Hombre");
        generosValidos.add("Mujer");
        generosValidos.add("Unisex");

        genero = genero.toLowerCase();
        return generosValidos.contains(genero);
    }

    public void sumarExistencias(int unidades) {
        if (unidades >= 0) {
            this.existencias += unidades;
        } else {
            System.out.println("Error: No se puede sumar una cantidad negativa de existencias.");
        }
    }

    public void reducirExistencias(int unidades) {
        if (unidades >= 0) {
            if (this.existencias >= unidades) {
                this.existencias -= unidades;
            } else {
                System.out.println("Error: No se puede restar una cantidad de existencias mayor a la cantidad disponible.");
            }
        } else {
            System.out.println("Error: No se puede restar una cantidad negativa de existencias.");
        }
    }

    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precio = nuevoPrecio;
        } else {
            System.out.println("Error: No se puede establecer un precio negativo.");
        }
    }
}