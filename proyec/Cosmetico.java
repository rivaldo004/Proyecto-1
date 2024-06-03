import java.util.ArrayList;
import java.util.List;
class cosmetico {

    private int idCosmetico;
    private String nombre;
    private String marca;
    private String tipoCosmetico;
    private String genero;
    private String tono;
    private double precio;
    private int existencias;


    public void Main(int idCosmetico, String nombre, String marca, String tipoCosmetico, String genero, String tono, double precio, int existencias) {
        this.idCosmetico = idCosmetico;
        this.nombre = nombre;
        this.marca = marca;
        this.tipoCosmetico = tipoCosmetico;
        this.genero = genero;
        this.tono = tono;
        this.precio = precio;
        this.existencias = existencias;
    }

    public int getIdCosmetico() {
        return idCosmetico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoCosmetico() {
        return tipoCosmetico;
    }
    public void setGenero(String genero) {
        if (validarGenero(genero)) {
            this.genero = genero;
        } else {
            System.out.println("Error: El género " + genero + " no es válido.");
        }
    }

    public String getTono() {
        return tono;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setIdCosmetico(int nuevoIdCosmetico) {
        if (nuevoIdCosmetico >= 0) {
            this.idCosmetico = nuevoIdCosmetico;
        } else {
            System.out.println("Error: No se puede establecer un ID de cosmético negativo.");
        }
    }

    private void setNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            this.nombre = nuevoNombre;
        } else {
            System.out.println("Error: El nombre del cosmético no puede ser vacío.");
        }
    }

    public void setMarca(String nuevaMarca) {
        if (nuevaMarca != null && !nuevaMarca.isEmpty()) {
            this.marca = nuevaMarca;
        } else {
            System.out.println("Error: La marca del cosmético no puede ser vacía.");
        }
    }

    public void setTipoCosmetico(String nuevoTipoCosmetico) {
        if (nuevoTipoCosmetico != null && !nuevoTipoCosmetico.isEmpty()) {
            this.tipoCosmetico = nuevoTipoCosmetico;
        } else {
            System.out.println("Error: El tipo de cosmético no puede ser vacío.");
        }
    }

    public boolean validarGenero(String genero) {
        List<String> generosValidos = new ArrayList<>();
        generosValidos.add("Hombre");
        generosValidos.add("Mujer");
        generosValidos.add("Unisex");

        genero = genero.toLowerCase();
        return generosValidos.contains(genero);
    }

    public void setTono(String nuevoTono) {
        if (nuevoTono != null) {
            this.tono = nuevoTono;
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