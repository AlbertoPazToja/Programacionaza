public class Plato {

    private int UID;
    private String nombre;

    public Plato(int uID, String nombre) {
        UID = uID;
        this.nombre = nombre;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int uID) {
        UID = uID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
