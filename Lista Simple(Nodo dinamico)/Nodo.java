public class Nodo {
    String datos = null;
    Nodo next;
    public String data;

    public Nodo(int newData){
        this.datos = newData;
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
