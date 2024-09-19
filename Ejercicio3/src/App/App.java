package App;

public class App {
     public static void main(String[] args) {

        Libro libro = new Libro("978-3-16-148410-0", "El Principito", "Antoine de Saint-Exupéry", true);
        libro.imprimirDetalles();

        Estudiante estudiante = new Estudiante("Juan Pérez", 20, "Ingeniería", 4.5);
        estudiante.imprimirDetalles();

        Empleado empleado = new Empleado("Ana Gómez", "Gerente", 50000, 5);
        empleado.imprimirDetalles();

        Producto producto = new Producto("P001", "Laptop", 1200.00, 10);
        producto.imprimirDetalles();

        Coche coche = new Coche("Toyota", "Corolla", 2020, 20000);
        coche.imprimirDetalles();

        Cliente cliente = new Cliente("Pedro López", "Calle Falsa 123", "3216549870", "pedro@example.com");
        cliente.imprimirDetalles();

        Paciente paciente = new Paciente("María Ruiz", 30, "Gripe", "Dr. Smith");
        paciente.imprimirDetalles();

        Curso curso = new Curso("Programación", "PROG101", 4, "Dr. Pérez");
        curso.imprimirDetalles();

        Pedido pedido = new Pedido("P001", "Laptop", 2, 2400.00);
        pedido.imprimirDetalles();

        Evento evento = new Evento("Concierto de Música", "2024-09-30", "Auditorio Principal", 500);
        evento.imprimirDetalles();
    } 
}

