
package App;
   
    class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String isbn, String titulo, String autor, boolean disponible) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public void imprimirDetalles() {
        System.out.println("ISBN: " + isbn + ", Título: " + titulo + ", Autor: " + autor + ", Disponible: " + disponible);
    }
}


class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Promedio: " + promedio);
    }
}

// Clase Empleado
class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    private int antigüedad;

    public Empleado(String nombre, String puesto, double salario, int antigüedad) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.antigüedad = antigüedad;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario + ", Antigüedad: " + antigüedad + " años");
    }
}

// Clase Producto
class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void imprimirDetalles() {
        System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Precio: $" + precio + ", Stock: " + stock);
    }
}

// Clase Coche
class Coche {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Coche(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public void imprimirDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Precio: $" + precio);
    }
}

// Clase Cliente
class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Cliente(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono + ", Email: " + email);
    }
}

// Clase Paciente
class Paciente {
    private String nombre;
    private int edad;
    private String enfermedad;
    private String doctor;

    public Paciente(String nombre, int edad, String enfermedad, String doctor) {
        this.nombre = nombre;
        this.edad = edad;
        this.enfermedad = enfermedad;
        this.doctor = doctor;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Enfermedad: " + enfermedad + ", Doctor: " + doctor);
    }
}

// Clase Curso
class Curso {
    private String nombre;
    private String codigo;
    private int creditos;
    private String profesor;

    public Curso(String nombre, String codigo, int creditos, String profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", Código: " + codigo + ", Créditos: " + creditos + ", Profesor: " + profesor);
    }
}

// Clase Pedido
class Pedido {
    private String codigoPedido;
    private String producto;
    private int cantidad;
    private double precioTotal;

    public Pedido(String codigoPedido, String producto, int cantidad, double precioTotal) {
        this.codigoPedido = codigoPedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    public void imprimirDetalles() {
        System.out.println("Código del Pedido: " + codigoPedido + ", Producto: " + producto + ", Cantidad: " + cantidad + ", Precio Total: $" + precioTotal);
    }
}

// Clase Evento
class Evento {
    private String nombre;
    private String fecha;
    private String lugar;
    private int asistentes;

    public Evento(String nombre, String fecha, String lugar, int asistentes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.asistentes = asistentes;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", Fecha: " + fecha + ", Lugar: " + lugar + ", Asistentes: " + asistentes);
        }
    }
public static void main(String[] args) {

        App.Libro libro = new App.Libro("978-3-16-148410-0", "El Principito", "Antoine de Saint-Exupéry", true);
        libro.imprimirDetalles();

        App.Estudiante estudiante = new App.Estudiante("Juan Pérez", 20, "Ingeniería", 4.5);
        estudiante.imprimirDetalles();

        App.Empleado empleado = new App.Empleado("Ana Gómez", "Gerente", 50000, 5);
        empleado.imprimirDetalles();

        App.Producto producto = new App.Producto("P001", "Laptop", 1200.00, 10);
        producto.imprimirDetalles();

        App.Coche coche = new App.Coche("Toyota", "Corolla", 2020, 20000);
        coche.imprimirDetalles();

        App.Cliente cliente = new App.Cliente("Pedro López", "Calle Falsa 123", "3216549870", "pedro@example.com");
        cliente.imprimirDetalles();

        Paciente paciente = new App.Paciente("María Ruiz", 30, "Gripe", "Dr. Smith");
        paciente.imprimirDetalles();

        Curso curso = new App.Curso("Programación", "PROG101", 4, "Dr. Pérez");
        curso.imprimirDetalles();

        Pedido pedido = new App.Pedido("P001", "Laptop", 2, 2400.00);
        pedido.imprimirDetalles();

       Evento evento = new Evento("Concierto de Música", "2024-09-30", "Auditorio Principal", 500);
        evento.imprimirDetalles();
    } 




   
