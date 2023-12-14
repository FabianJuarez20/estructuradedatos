public class ferreteria {
    public String nombre;
    public String marca;
    public double id;
    public String color;
    public int precio;
    public String caracteristica;
    public ferreteria[] pb = new ferreteria[100];

    

    
    public ferreteria(String nombre, String marca, double id, String color, int precio, String caracteristica){
        this.nombre = nombre;
        this.marca = marca;
        this.id = id;
        this.color = color;
        this.precio = precio;
        this.caracteristica = caracteristica;

    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", caracteristica='" + caracteristica + '\'' +
                '}';
    }
}
