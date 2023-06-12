public class Plato {

    private String nombre;
    private Double precio;
    private int calorias, tiempoprep;


    public Plato(String nombre, Double precio, int calorias, int tiempoprep) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.tiempoprep = tiempoprep;
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setTiempoprep(int tiempoprep) {
        this.tiempoprep = tiempoprep;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public int getTiempoprep() {
        return tiempoprep;
    }

    @Override
    public String toString() {
        return "\nPlato: " +
                "\nNombre= " + nombre +
                ",\tPrecio= " + precio +
                ",\tCalorias= " + calorias +
                ",\tTiempo de preparación= " + tiempoprep +"\n";
    }
}
