package InterfacesEjemplo;

// Interface pura: define o comportamento que deben ter todos os dispositivos conectables
interface Conectable {
    void conectar(); // Obriga ás clases a definir como se conectan

    void desconectar(); // Obriga ás clases a definir como se desconectan

    boolean estaConectado(); // Obriga a devolver o estado da conexión
}
