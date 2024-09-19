
package App;

public class run {
  /* public static void main(String[] args) {
        Diez Primeros = new Diez();


        Diez.Libro libro = Primeros.new Libro("123-456-789", "Cien años de soledad", "Gabriel García Márquez", true);
        libro.imprimir();

        Diez.Estudiante estudiante = Primeros.new Estudiante("Juan", 20, "Ingeniería", 8.5);
        estudiante.imprimir();

        Diez.Empleado empleado = Primeros.new Empleado("María", "Gerente", 50000, 5);
        empleado.imprimir();

        Diez.Producto producto = Primeros.new Producto("P001", "Laptop", 1500, 10);
        producto.imprimir();

        Diez.Coche coche = Primeros.new Coche("Toyota", "Corolla", 2020, 25000);
        coche.imprimir();

        Diez.Cliente cliente = Primeros.new Cliente("Pedro", "Av. Siempre Viva 123", "555-1234", "pedro@gmail.com");
        cliente.imprimir();

        Diez.Paciente paciente = Primeros.new Paciente("Ana", 30, "Gripe", "Dr. López");
        paciente.imprimir();

        Diez.Curso curso = Primeros.new Curso("Matemáticas", "MAT101", 5, "Dr. Pérez");
        curso.imprimir();

        Diez.Pedido pedido = Primeros.new Pedido("P0001", "Televisor", 2, 1200);
        pedido.imprimir();

        Diez.Evento evento = Primeros.new Evento("Concierto", "12/09/2024", "Auditorio Nacional", 5000);
        evento.imprimir();
    } */
/*public static void main(String[] args) {
        Veinte Segundos20 = new Veinte();


        Veinte.Pelicula pelicula = Segundos20.new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia ficción");
        System.out.println(pelicula.toString());

        Veinte.Restaurante restaurante = Segundos20.new Restaurante("La Pampa", "Av. Libertad 123", "Argentina", 4.5);
        System.out.println(restaurante.toString());

        Veinte.Persona persona = Segundos20.new Persona("Carlos", "Gómez", 35, "Calle Falsa 123");
        System.out.println(persona.toString());

        Veinte.Orden orden = Segundos20.new Orden("12345", "01/09/2024", "Ana Pérez", 250.50);
        System.out.println(orden.toString());

        Veinte.Mascota mascota = Segundos20.new Mascota("Max", "Perro", 3, "Luis García");
        System.out.println(mascota.toString());

        Veinte.Proveedor proveedor = Segundos20.new Proveedor("Juan", "ABC S.A.", "555-5555", "juan@abc.com");
        System.out.println(proveedor.toString());

        Veinte.Factura factura = Segundos20.new Factura("F0001", "02/09/2024", "Carla López", 300.75);
        System.out.println(factura.toString());

        Veinte.Universidad universidad = Segundos20.new Universidad("Universidad Nacional", "Av. Universidad 456", 15000, 5);
        System.out.println(universidad.toString());

        Veinte.Juego juego = Segundos20.new Juego("The Witcher 3", "PC", 2015, "RPG");
        System.out.println(juego.toString());

        Veinte.Hotel hotel = Segundos20.new Hotel("Hotel Plaza", "Calle Central 456", 200, 5);
        System.out.println(hotel.toString());
    }*/
    /* public static void main(String[] args) {
        treinta Treinta = new treinta();

     
        treinta.Venta venta = Treinta.new Venta("Laptop", 2, 1200.50);
        System.out.println(venta.toString());

        treinta.Empleado empleado = Treinta.new Empleado("Laura", 40, 15.5);
        System.out.println(empleado.toString());

        treinta.ProductoInventario productoInventario = Treinta.new ProductoInventario("P001", "Cámara", 10, 299.99);
        System.out.println(productoInventario.toString());

        treinta.Factura factura = Treinta.new Factura("F123", "18/09/2024", 1500);
        System.out.println(factura.toString());

        treinta.Pedido pedido = Treinta.new Pedido("P123", "Carlos", 5, 100.99);
        System.out.println(pedido.toString());

        treinta.Inversion inversion = Treinta.new Inversion("INV001", "Luis", 10000, 5.0);
        System.out.println(inversion.toString());

        treinta.ProductoAlmacen productoAlmacen = Treinta.new ProductoAlmacen("A123", "Teclado", 50, 25.99);
        System.out.println(productoAlmacen.toString());

        treinta.Pago pago = Treinta.new Pago("PA123", "Juan", 1500, 200, 100);
        System.out.println(pago.toString());

        treinta.Servicio servicio = Treinta.new Servicio("S001", "Consultoría", 50, 8);
        System.out.println(servicio.toString());

        treinta.Compra compra = Treinta.new Compra("C123", "Proveedores SA", 20, 199.99);
        System.out.println(compra.toString());
    }*/
    
    public static void main(String[] args) {
        Cuarenta cuarentas = new Cuarenta();

        // Ejemplos de instancias
        Cuarenta.Empleado empleado = cuarentas.new Empleado("Carlos", 1500);
        System.out.println(empleado.toString());

        Cuarenta.Producto producto = cuarentas.new Producto("P001", "Laptop", 1200);
        producto.aplicarDescuento(10);
        System.out.println(producto.toString());

        Cuarenta.Cliente cliente = cuarentas.new Cliente("Luis", "Av. Siempre Viva", "123456789");
        System.out.println(cliente.toString());

        Cuarenta.Factura factura = cuarentas.new Factura("F001", "Luis", 1000);
        System.out.println(factura.toString());

        Cuarenta.Pedido pedido = cuarentas.new Pedido("PED001", "Carlos", 10, 50);
        System.out.println(pedido.toString());

        Cuarenta.Inventario inventario = cuarentas.new Inventario("INV001", 100, 15.5);
        System.out.println(inventario.toString());

        Cuarenta.Proveedor proveedor = cuarentas.new Proveedor("Juan", "Suministros SA", "987654321");
        proveedor.mostrarInformacion();

        Cuarenta.Compra compra = cuarentas.new Compra("C001", "Proveedor SA", 10, 100);
        System.out.println(compra.toString());

        Cuarenta.Venta venta = cuarentas.new Venta("Laptop", 5, 1200);
        System.out.println(venta.toString());

        Cuarenta.Servicio servicio = cuarentas.new Servicio("S001", "Desarrollo de software", 50, 100);
        System.out.println(servicio.toString());
    } 
}
