public class Traballador implements Xefe, Subordinado {

    // Implementa los métodos de las 2 interfaces y ya
    @Override
    public void darOrdes() {

        System.out.println("O xefe está a dar ordes");
    }

    @Override
    public void planificarProxecto() {

        System.out.println("O xefe está a planificar os proxectos");
    }

    @Override
    public void executarTarefas() {

        System.out.println("O subordinado está a executar as tarefas");
    }

    @Override
    public void informar() {

        System.out.println("O subordinado está a informar do progreso");
    }

}
