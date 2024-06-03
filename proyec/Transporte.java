public class Transporte {
    // Atributo
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private double peso;
    private boolean funciona;
    private double precio;

    // Constructor
    public Transporte() { }

    public Transporte(String marca, String modelo, String color, int año, double peso, boolean funciona, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.peso = peso;
        this.funciona = funciona;
        this.precio = precio;
    }

    // Methods
    public String toString() {
        return "Marca: " + this.marca +
                ", Modelo: " + this.modelo +
                ", Color: " + this.color +
                ", Año: " + this.año +
                ", Peso: " + this.peso +
                ", Funcionamiento: " + (this.funciona? "Si" : "No") +
                ", Precio: " + this.precio;
    }

    public double calcularImpuesto() {
        if (this.peso > 50) {
            return this.precio * 0.15;
        } else {
            return this.precio * 0.10;
        }
    }

    public void reparar() {

        this.funciona = true;
    }

    public void averiar() {

        this.funciona = false;
    }

    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModel(String model) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public int getAño(int año){
        return año;
    }

    public void setAño(int año){
        this.año = año;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public boolean isFunciona(){
        return funciona;
    }

    public void setFunciona(boolean funciona){
        this.funciona = funciona;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
}