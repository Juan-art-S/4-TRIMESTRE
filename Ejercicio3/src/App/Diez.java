package App;

public class Diez {
    class Libro {
        String ISBN;
        String titulo;
        String autor;
        boolean disponible;

        public Libro(String ISBN, String titulo, String autor, boolean disponible) {
            this.ISBN = ISBN;
            this.titulo = titulo;
            this.autor = autor;
            this.disponible = disponible;
        }

        public void imprimir() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Disponible: " + disponible);
        }
    }

    class Estudiante {
        String nombre;
        int edad;
        String carrera;
        double promedio;

        public Estudiante(String nombre, int edad, String carrera, double promedio) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
            this.promedio = promedio;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Carrera: " + carrera);
            System.out.println("Promedio: " + promedio);
        }
    }

    class Empleado {
        String nombre;
        String puesto;
        double salario;
        int antiguedad;

        public Empleado(String nombre, String puesto, double salario, int antiguedad) {
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = salario;
            this.antiguedad = antiguedad;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Puesto: " + puesto);
            System.out.println("Salario: " + salario);
            System.out.println("Antigüedad: " + antiguedad + " años");
        }
    }

    class Producto {
        String codigo;
        String nombre;
        double precio;
        int stock;

        public Producto(String codigo, String nombre, double precio, int stock) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public void imprimir() {
            System.out.println("Código: " + codigo);
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Stock: " + stock + " unidades");
        }
    }

    class Coche {
        String marca;
        String modelo;
        int año;
        double precio;

        public Coche(String marca, String modelo, int año, double precio) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
            this.precio = precio;
        }

        public void imprimir() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + año);
            System.out.println("Precio: $" + precio);
        }
    }

    class Cliente {
        String nombre;
        String direccion;
        String telefono;
        String email;

        public Cliente(String nombre, String direccion, String telefono, String email) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.email = email;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Email: " + email);
        }
    }

    class Paciente {
        String nombre;
        int edad;
        String enfermedad;
        String doctor;

        public Paciente(String nombre, int edad, String enfermedad, String doctor) {
            this.nombre = nombre;
            this.edad = edad;
            this.enfermedad = enfermedad;
            this.doctor = doctor;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Enfermedad: " + enfermedad);
            System.out.println("Doctor: " + doctor);
        }
    }

    class Curso {
        String nombre;
        String codigo;
        int creditos;
        String profesor;

        public Curso(String nombre, String codigo, int creditos, String profesor) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.creditos = creditos;
            this.profesor = profesor;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Código: " + codigo);
            System.out.println("Créditos: " + creditos);
            System.out.println("Profesor: " + profesor);
        }
    }

    class Pedido {
        String codigoPedido;
        String producto;
        int cantidad;
        double precioTotal;

        public Pedido(String codigoPedido, String producto, int cantidad, double precioTotal) {
            this.codigoPedido = codigoPedido;
            this.producto = producto;
            this.cantidad = cantidad;
            this.precioTotal = precioTotal;
        }

        public void imprimir() {
            System.out.println("Código del Pedido: " + codigoPedido);
            System.out.println("Producto: " + producto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio Total: $" + precioTotal);
        }
    }

    class Evento {
        String nombre;
        String fecha;
        String lugar;
        int asistentes;

        public Evento(String nombre, String fecha, String lugar, int asistentes) {
            this.nombre = nombre;
            this.fecha = fecha;
            this.lugar = lugar;
            this.asistentes = asistentes;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha: " + fecha);
            System.out.println("Lugar: " + lugar);
            System.out.println("Asistentes: " + asistentes);
        }
    }  
}
