public class Nodo {
    String datos = null;
    Nodo next;
    public int data;

    public Nodo(String datos2){
        this.datos = datos2;
        this.next =  null;
    }

    public Nodo(int newData) {
    }

    public String getDatos() {
        return datos;
    }
    public void setDatos(String datos) {
        this.datos = datos;
    }
}
