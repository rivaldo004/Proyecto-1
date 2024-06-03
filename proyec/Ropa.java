import java.util.ArrayList;
import java.util.List;

public class Ropa {

    private int idRopa;
    private String marca;
    private String diseño;
    private String talla;
    private String color;
    private String tipoRopa;
    private String genero;
    private double precio;
    private int existencias;
    public Ropa(int idRopa, String marca, String diseño, String talla, String color, String tipoRopa, String genero, double precio, int existencias) {
        this.idRopa = idRopa;
        this.marca = marca;
        this.diseño = diseño;
        this.talla = talla;
        this.color = color;
        this.tipoRopa = tipoRopa;
        this.genero = genero;
        this.precio = precio;
        this.existencias = existencias;
    }


    public int getIdRopa() {
        return idRopa;
    }

    public String getMarca() {
        return marca;
    }

    public String getDiseño() {
        return diseño;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getTipoRopa() {
        return tipoRopa;
    }

    public String getGenero() {
        return genero;
    }
    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setIdRopa(int nuevoIdRopa) {
        if (nuevoIdRopa >= 0) {
            this.idRopa = nuevoIdRopa;
        } else {
            System.out.println("Error: No se puede establecer un ID de ropa negativo.");
        }
    }

    public void setMarca(String nuevaMarca) {
        if (nuevaMarca != null && !nuevaMarca.isEmpty()) {
            this.marca = nuevaMarca;
        } else {
            System.out.println("Error: La marca de la ropa no puede ser vacía.");
        }
    }

    public void setDiseño(String nuevoDiseño) {
        if (nuevoDiseño != null && !nuevoDiseño.isEmpty()) {
            this.diseño = nuevoDiseño;
        } else {
            System.out.println("Error: El diseño de la ropa no puede ser vacío.");
        }
    }

    public void setTalla(String nuevaTalla) {
        if (nuevaTalla != null && !nuevaTalla.isEmpty()) {
            this.talla = nuevaTalla;
        } else {
            System.out.println("Error: La talla de la ropa no puede ser vacía.");
        }
    }

    public void setColor(String nuevoColor) {
        if (nuevoColor != null && !nuevoColor.isEmpty()) {
            this.color = nuevoColor;
        } else {
            System.out.println("Error: El color de la ropa no puede ser vacío.");
        }
    }

    public void setTipoRopa(String nuevoTipoRopa) {
        if (nuevoTipoRopa != null && !nuevoTipoRopa.isEmpty()) {
            this.tipoRopa = nuevoTipoRopa;
        } else {
            System.out.println("Error: El tipo de ropa no puede ser vacío.");
        }
    }

    private void setGenero(String genero) {
        if (validarGenero(genero)) {
            this.genero = genero;
        } else {
            System.out.println("Error: El género " + genero + " no es válido.");
        }
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precio = nuevoPrecio;
        } else {
            System.out.println("Error: No se puede establecer un precio negativo.");
        }
    }

    public void setExistencias(int nuevasExistencias) {
        if (nuevasExistencias >= 0) {
            this.existencias = nuevasExistencias;
        } else {
            System.out.println("Error: No se puede establecer una cantidad de existencias negativa.");
        }
    }

    // Métodos adicionales (ejemplos)
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