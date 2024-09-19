package Poo;

import java.util.Arrays;
import java.util.Scanner;

public class Poo {
  /*public static void main(String[] args) {
        // Ejercicio 1
        calcularSalarioAnual(3000, 10);

        // Ejercicio 2
        int[] cantidades = {5, 3, 10, 1};
        verificarStock(cantidades, 4);

        // Ejercicio 3
        System.out.println("Costo Total de Producción: " + calcularCostoTotal(5000, 3000, 2000));

        // Ejercicio 4
        double[] ganancias = {12000, 15000, 9000, 20000};
        System.out.println("Mejor Rendimiento: " + evaluarRendimiento(ganancias));

        // Ejercicio 5
        System.out.println("Depreciación Anual: " + calcularDepreciacion(20000, 2000, 5));

        // Ejercicio 6
        System.out.println("Valor Futuro: " + calcularRentabilidad(10000, 5, 10));

        // Ejercicio 7
        String[] empleados = {"Juan", "Maria", "Pedro"};
        int[] horasExtras = {5, 10, 7};
        generarInformeHorasExtras(empleados, horasExtras);

        // Ejercicio 8
        System.out.println("Costo Total del Proyecto: " + calcularCostoProyecto(7000, 3000, 2000));

        // Ejercicio 9
        double[][] horasYSalarios = {{40, 15}, {35, 20}, {45, 10}};
        System.out.println("Nómina Total: " + calcularNomina(horasYSalarios));

        // Ejercicio 10
        System.out.println("Tiempo Estimado de Entrega: " + calcularTiempoEntrega(100, 50) + " horas");

        // Ejercicio 11
        double[][] distanciaYCombustible = {{200, 20}, {150, 15}, {300, 30}};
        System.out.println("Consumo Promedio de Combustible: " + calcularConsumoPromedio(distanciaYCombustible));

        // Ejercicio 12
        int[] puntosEquipos = {10, 15, 20, 25};
        System.out.println("Equipo con Más Puntos: " + determinarEquipoConMasPuntos(puntosEquipos));

        // Ejercicio 13
        double[] calificaciones = {85, 90, 78, 92};
        System.out.println("Promedio Académico: " + calcularPromedio(calificaciones));

        // Ejercicio 14
        double[] calificacionesProductos = {4.5, 3.8, 4.9, 4.0};
        System.out.println("Mejor Producto: " + determinarMejorProducto(calificacionesProductos));

        // Ejercicio 15
        double[][] consumoYRendimiento = {{100, 90}, {200, 180}, {150, 130}};
        calcularEficienciaEnergetica(consumoYRendimiento);

        // Ejercicio 16
        System.out.println("Costo Total del Evento: " + calcularCostoEvento(2000, 5000, 3000, 1000));

        // Ejercicio 17
        double[] puntuacionesSatisfaccion = {4.0, 5.0, 3.5, 4.2};
        System.out.println("Promedio de Satisfacción: " + calcularPromedioSatisfaccion(puntuacionesSatisfaccion));

        // Ejercicio 18
        System.out.println("Porcentaje de Cumplimiento: " + calcularPorcentajeCumplimiento(15, 20) + "%");

        // Ejercicio 19
        System.out.println("Capacidad Restante: " + calcularCapacidadRestante(1000, 600));

        // Ejercicio 20
        System.out.println("Costo por Kilómetro: " + calcularCostoPorKilometro(150, 75));
    }

    // Ejercicio 1
    public static void calcularSalarioAnual(double salarioMensual, double porcentajeRetencion) {
        double salarioAnual = salarioMensual * 12;
        double deduccionRetencion = salarioAnual * (porcentajeRetencion / 100);
        System.out.println("Salario Anual: " + salarioAnual);
        System.out.println("Deducción Retención: " + deduccionRetencion);
    }

    // Ejercicio 2
    public static void verificarStock(int[] cantidades, int nivelMinimo) {
        for (int i = 0; i < cantidades.length; i++) {
            if (cantidades[i] < nivelMinimo) {
                System.out.println("Es necesario realizar un pedido para el producto " + (i + 1));
            } else {
                System.out.println("Stock suficiente para el producto " + (i + 1));
            }
        }
    }

    // Ejercicio 3
    public static double calcularCostoTotal(double materiales, double manoDeObra, double gastos) {
        return materiales + manoDeObra + gastos;
    }

    // Ejercicio 4
    public static double evaluarRendimiento(double[] ganancias) {
        double mejorRendimiento = ganancias[0];
        for (double ganancia : ganancias) {
            if (ganancia > mejorRendimiento) {
                mejorRendimiento = ganancia;
            }
        }
        return mejorRendimiento;
    }

    // Ejercicio 5
    public static double calcularDepreciacion(double valorInicial, double valorResidual, int vidaUtil) {
        return (valorInicial - valorResidual) / vidaUtil;
    }

    // Ejercicio 6
    public static double calcularRentabilidad(double capital, double tasa, int anos) {
        return capital * Math.pow(1 + (tasa / 100), anos);
    }

    // Ejercicio 7
    public static void generarInformeHorasExtras(String[] empleados, int[] horasExtras) {
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado: " + empleados[i] + ", Horas Extras: " + horasExtras[i]);
        }
    }

    // Ejercicio 8
    public static double calcularCostoProyecto(double materiales, double manoDeObra, double equipos) {
        return materiales + manoDeObra + equipos;
    }

    // Ejercicio 9
    public static double calcularNomina(double[][] horasYSalarios) {
        double nominaTotal = 0;
        for (double[] hs : horasYSalarios) {
            nominaTotal += hs[0] * hs[1]; // horas trabajadas * salario por hora
        }
        return nominaTotal;
    }

    // Ejercicio 10
    public static double calcularTiempoEntrega(double distancia, double velocidad) {
        return distancia / velocidad;
    }

    // Ejercicio 11
    public static double calcularConsumoPromedio(double[][] datos) {
        double totalConsumo = 0;
        for (double[] d : datos) {
            totalConsumo += d[1] / d[0]; // combustible / distancia
        }
        return totalConsumo / datos.length;
    }

    // Ejercicio 12
    public static int determinarEquipoConMasPuntos(int[] puntos) {
        int maxPuntos = puntos[0];
        for (int p : puntos) {
            if (p > maxPuntos) {
                maxPuntos = p;
            }
        }
        return maxPuntos;
    }

    // Ejercicio 13
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.length;
    }

    // Ejercicio 14
    public static double determinarMejorProducto(double[] calificaciones) {
        return calcularPromedio(calificaciones); // Mejor producto se determina por calificación promedio
    }

    // Ejercicio 15
    public static void calcularEficienciaEnergetica(double[][] datos) {
        for (double[] d : datos) {
            double eficiencia = d[1] / d[0];
            System.out.println("Eficiencia Energética: " + eficiencia);
        }
    }

    // Ejercicio 16
    public static double calcularCostoEvento(double alquiler, double catering, double entretenimiento, double otrosGastos) {
        return alquiler + catering + entretenimiento + otrosGastos;
    }

    // Ejercicio 17
    public static double calcularPromedioSatisfaccion(double[] puntuaciones) {
        return calcularPromedio(puntuaciones);
    }

    // Ejercicio 18
    public static double calcularPorcentajeCumplimiento(int metasCumplidas, int metasTotales) {
        return ((double) metasCumplidas / metasTotales) * 100;
    }

    // Ejercicio 19
    public static double calcularCapacidadRestante(double capacidadTotal, double espacioOcupado) {
        return capacidadTotal - espacioOcupado;
    }

    // Ejercicio 20
    public static double calcularCostoPorKilometro(double distancia, double tarifa) {
        return tarifa / distancia;
    }*/
    /*
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 21
        gestionarBiblioteca();

        // Ejercicio 22
        gestionarAlquilerVehiculos();

        // Ejercicio 23
        gestionarReservasRestaurante();

        // Ejercicio 24
        gestionarInventarioTiendaRopa();

        // Ejercicio 25
        gestionarProyectosSoftware();

        // Ejercicio 26
        gestionarMiembrosClubDeportes();

        // Ejercicio 27
        gestionarReservasCine();

        // Ejercicio 28
        gestionarSociosClubLectura();

        // Ejercicio 29
        gestionarInscripcionesClubNatacion();

        // Ejercicio 30
        gestionarMiembrosClubAjedrez();

        // Ejercicio 31
        gestionarJugadoresLigaFutbol();

        // Ejercicio 32
        gestionarNadadoresLigaNatacion();

        // Ejercicio 33
        gestionarTenistasLigaTenis();
        
        scanner.close();
    }

    // Ejercicio 21
    public static void gestionarBiblioteca() {
        String[][] biblioteca = {
            {"sangre de campeon", "anonimo", "10"},
            {"Cien Años de Soledad", "Gabriel García", "5"},
            {"Don Quijote de la Mancha", "Miguel", "8"}
        };


        System.out.println("Inventario de la Biblioteca:");
        for (String[] libro : biblioteca) {
            System.out.println("Título: " + libro[0] + " Autor: " + libro[1] + " Cantidad en stock: " + libro[2]);
        }
    }

    // Ejercicio 22
    public static void gestionarAlquilerVehiculos() {
        String[][] vehiculos = {
            {"Ford ", "ABC", "50", "Disponible"},
            {"Toyota", "XYZ", "70", "No disponible"},
            {"Honda ", "789", "60", "Disponible"}
        };

       
        System.out.println("Lista de Vehículos:");
        for (String[] vehiculo : vehiculos) {
            System.out.println("Modelo: " + vehiculo[0] + " Matrícula: " + vehiculo[1] + " Precio por día: " + vehiculo[2] + " Disponibilidad: " + vehiculo[3]);
        }
    }

    // Ejercicio 23
    public static void gestionarReservasRestaurante() {
        String[][] mesas = {
            {"Mesa 1", "Disponible", "4"},
            {"Mesa 2", "Ocupada", "2"},
            {"Mesa 3", "Disponible", "6"}
        };

     
        System.out.println("Disponibilidad de Mesas:");
        for (String[] mesa : mesas) {
            System.out.println("Nombre: " + mesa[0] + " Disponibilidad: " + mesa[1] + " Capacidad: " + mesa[2]);
        }
    }

    // Ejercicio 24
    public static void gestionarInventarioTiendaRopa() {
        String[][] productos = {
            {"Camisa", "20", "25.0"},
            {"Pantalón", "15", "40.0"},
            {"Zapatos", "10", "50.0"}
        };

 
        System.out.println("Inventario de Ropa:");
        for (String[] producto : productos) {
            System.out.println("Tipo: " + producto[0] + " Cantidad en stock: " + producto[1] + " Precio: " + producto[2]);
        }
    }

    // Ejercicio 25
    public static void gestionarProyectosSoftware() {
        String[][] proyectos = {
            {"Proyecto A", "30", "En progreso"},
            {"Proyecto B", "15", "Completado"},
            {"Proyecto C", "45", "En progreso"}
        };

   
        System.out.println("Proyectos:");
        for (String[] proyecto : proyectos) {
            System.out.println("Nombre: " + proyecto[0] + " Duración: " + proyecto[1] + " días Estado: " + proyecto[2]);
        }
    }

    // Ejercicio 26
    public static void gestionarMiembrosClubDeportes() {
        String[][] miembros = {
            {"juan", "25", "Fútbol", "30"},
            {"sebastian", "22", "Natación", "20"},
            {"muñoz", "28", "Baloncesto", "25"}
        };

      
        System.out.println("Miembros del Club de Deportes:");
        for (String[] miembro : miembros) {
            System.out.println("Nombre: " + miembro[0] + " Edad: " + miembro[1] + " Deporte: " + miembro[2] + " Cuota: " + miembro[3]);
        }
    }

    // Ejercicio 27
    public static void gestionarReservasCine() {
        String[][] reservas = {
            {"maria", "Avengers", "2", "20"},
            {"jose", "Inception", "3", "30"},
            {"julio", "Titanic", "1", "10"}
        };

        
        System.out.println("Reservas en el Cine:");
        for (String[] reserva : reservas) {
            System.out.println("Cliente: " + reserva[0] + " Película: " + reserva[1] + " Entradas: " + reserva[2] + " Precio Total: " + reserva[3]);
        }
    }

    // Ejercicio 28
    public static void gestionarSociosClubLectura() {
        String[][] socios = {
            {"laura", "30", "1984"},
            {"luis", "25", "El Principito"},
            {"alfonso", "35", "Cien Años de Soledad"}
        };

     
        System.out.println("Socios del Club de Lectura:");
        for (String[] socio : socios) {
            System.out.println("Nombre: " + socio[0] + " Edad: " + socio[1] + " Libro Favorito: " + socio[2]);
        }
    }

    // Ejercicio 29
    public static void gestionarInscripcionesClubNatacion() {
        String[][] inscripciones = {
            {"cristian", "Intermedio", "20"},
            {"alejandra", "Principiante", "15"},
            {"santiago", "Avanzado", "25"}
        };

        
        System.out.println("Inscripciones en el Club de Natación:");
        for (String[] inscripcion : inscripciones) {
            System.out.println("Miembro: " + inscripcion[0] + " Nivel: " + inscripcion[1] + " Cuota: " + inscripcion[2]);
        }
    }

    // Ejercicio 30
    public static void gestionarMiembrosClubAjedrez() {
        String[][] miembros = {
            {"camilo", "32", "Intermedio", "25"},
            {"amilcar", "28", "Principiante", "20"},
            {"julian", "34", "Avanzado", "30"}
        };

       
        System.out.println("Miembros del Club de Ajedrez:");
        for (String[] miembro : miembros) {
            System.out.println("Nombre: " + miembro[0] + " Edad: " + miembro[1] + " Nivel: " + miembro[2] + " Cuota: " + miembro[3]);
        }
    }

    // Ejercicio 31
    public static void gestionarJugadoresLigaFutbol() {
        String[] nombres = {"juan", "pedro", "maría", "julian"};
        double[] pesos = {70, 80, 60, 75};
        int[] edades = {25, 30, 22, 28};

        double promedioPeso = Arrays.stream(pesos).average().orElse(0);

        System.out.println("Jugadores que clasifican:");
        for (int i = 0; i < nombres.length; i++) {
            if ((pesos[i] < promedioPeso && edades[i] <= 30) ||
                (pesos[i] == promedioPeso && edades[i] > 18)) {
                System.out.println(nombres[i]);
            }
        }
    }

    // Ejercicio 32
    public static void gestionarNadadoresLigaNatacion() {
        String[] nombres = {"ana", "luis", "maría", "pedro"};
        double[] tiempos = {30, 25, 20, 28};
        int[] edades = {24, 22, 19, 26};

        double promedioTiempo = Arrays.stream(tiempos).average().orElse(0);

        System.out.println("Nadadores que clasifican:");
        for (int i = 0; i < nombres.length; i++) {
            if ((tiempos[i] < promedioTiempo && edades[i] <= 25) ||
                (tiempos[i] == promedioTiempo && edades[i] > 18)) {
                System.out.println(nombres[i]);
            }
        }
    }

    // Ejercicio 33
    public static void gestionarTenistasLigaTenis() {
        String[] nombres = {"natalia", "sofía", "fernando", "eliana"};
        int[] rankings = {1, 5, 3, 2};
        int[] edades = {29, 22, 31, 19};

        double promedioRanking = Arrays.stream(rankings).average().orElse(0);

        System.out.println("Tenistas que clasifican:");
        for (int i = 0; i < nombres.length; i++) {
            if ((rankings[i] < promedioRanking && edades[i] <= 30) ||
                (rankings[i] == promedioRanking && edades[i] > 20)) {
                System.out.println(nombres[i]);
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 34
        inventarioLibreria(scanner);

        // Ejercicio 35
        reservasHotel(scanner);

        // Ejercicio 36
        notasEstudiantes(scanner);

        // Ejercicio 37
        pedidosRestaurante(scanner);

        // Ejercicio 38
        encuestaEstudiantes(scanner);

        // Ejercicio 39
        clientesGimnasio(scanner);

        // Ejercicio 40
        pacientesHospital(scanner);

        scanner.close();
    }

    // Ejercicio 34
    public static void inventarioLibreria(Scanner scanner) {
        System.out.print("¿Cuántos libros deseas ingresar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[][] inventario = new String[n][5];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los datos del libro " + (i + 1));
            System.out.print("Título: ");
            inventario[i][0] = scanner.nextLine();
            System.out.print("Autor: ");
            inventario[i][1] = scanner.nextLine();
            System.out.print("ISBN: ");
            inventario[i][2] = scanner.nextLine();
            System.out.print("Precio: ");
            inventario[i][3] = scanner.nextLine();
            System.out.print("Cantidad en stock: ");
            inventario[i][4] = scanner.nextLine();
        }

       
        double valorTotal = 0;
        for (String[] libro : inventario) {
            valorTotal += Double.parseDouble(libro[3]) * Integer.parseInt(libro[4]);
        }

        System.out.println("Valor total del inventario: $" + valorTotal);
        System.out.println("Información detallada de cada libro:");
        for (String[] libro : inventario) {
            double valorLibro = Double.parseDouble(libro[3]) * Integer.parseInt(libro[4]);
            System.out.println("Título: " + libro[0] + ", Autor: " + libro[1] + ", ISBN: " + libro[2] +
                               ", Precio: $" + libro[3] + ", Cantidad: " + libro[4] + ", Valor total: $" + valorLibro);
        }
    }

    // Ejercicio 35
    public static void reservasHotel(Scanner scanner) {
        System.out.print("¿Cuántas reservas deseas registrar? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[][] reservas = new String[n][6];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los datos de la reserva " + (i + 1));
            System.out.print("Nombre: ");
            reservas[i][0] = scanner.nextLine();
            System.out.print("Apellido: ");
            reservas[i][1] = scanner.nextLine();
            System.out.print("Cédula: ");
            reservas[i][2] = scanner.nextLine();
            System.out.print("Número de habitación: ");
            reservas[i][3] = scanner.nextLine();
            System.out.print("Fecha de entrada: ");
            reservas[i][4] = scanner.nextLine();
            System.out.print("Fecha de salida: ");
            reservas[i][5] = scanner.nextLine();
        }


        for (int i = 0; i < n; i++) {
            System.out.print("Costo por noche: ");
            double precioPorNoche = scanner.nextDouble();
            int cantidadNoches = 2; 
            double costoTotal = cantidadNoches * precioPorNoche;
            System.out.println("Reserva " + (i + 1) + " - Costo total de la estancia: $" + costoTotal);
        }
    }


    public static void notasEstudiantes(Scanner scanner) {
        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[][] estudiantes = new String[n][4]; 
        double[][] notas = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1));
            System.out.print("Nombre: ");
            estudiantes[i][0] = scanner.nextLine();
            System.out.print("Apellido: ");
            estudiantes[i][1] = scanner.nextLine();
            System.out.print("Número de identificación: ");
            estudiantes[i][2] = scanner.nextLine();
            System.out.print("Curso: ");
            estudiantes[i][3] = scanner.nextLine();

            // Ingresar notas
            System.out.println("Ingrese las notas del estudiante " + estudiantes[i][0] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); 
        }

  
        for (int i = 0; i < n; i++) {
            double sumaNotas = 0;
            for (double nota : notas[i]) {
                sumaNotas += nota;
            }
            double promedio = sumaNotas / notas[i].length;

            System.out.println("Estudiante: " + estudiantes[i][0] + " " + estudiantes[i][1]);
            System.out.println("Promedio: " + promedio);
        }
    }

    // Ejercicio 37
    public static void pedidosRestaurante(Scanner scanner) {
        System.out.print("¿Cuántos pedidos deseas registrar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[][] pedidos = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los datos del pedido " + (i + 1));
            System.out.print("Nombre del cliente: ");
            pedidos[i][0] = scanner.nextLine();
            System.out.print("Número de mesa: ");
            pedidos[i][1] = scanner.nextLine();
            System.out.print("Lista de platos solicitados: ");
            pedidos[i][2] = scanner.nextLine();
            System.out.print("Precio total: ");
            pedidos[i][3] = scanner.nextLine();
        }

        // Mostrar información detallada
        System.out.println("Pedidos registrados:");
        for (String[] pedido : pedidos) {
            System.out.println("Cliente: " + pedido[0] + ", Mesa: " + pedido[1] + 
                               ", Platos: " + pedido[2] + ", Total a pagar: $" + pedido[3]);
        }
    }

    // Ejercicio 38
    public static void encuestaEstudiantes(Scanner scanner) {
        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int n = scanner.nextInt();
        String[] facultades = {"Ingeniería", "Medicina", "Derecho", "Ciencias Sociales", "Administración"};
        int[] edades = new int[n];
        double[] promedios = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
            System.out.print("Ingrese el promedio del estudiante " + (i + 1) + ": ");
            promedios[i] = scanner.nextDouble();
        }

     
        for (String facultad : facultades) {
            int conteo = 0;
            double sumaEdades = 0;
            for (int edad : edades) {
             
                sumaEdades += edad;
                conteo++;
            }
            double promedioEdad = sumaEdades / conteo;
            System.out.println("Promedio de edad en " + facultad + ": " + promedioEdad);
        }
        
   
        int total18_25 = 0, total26_35 = 0, total35yMas = 0;
        for (int edad : edades) {
            if (edad >= 18 && edad <= 25) total18_25++;
            else if (edad >= 26 && edad <= 35) total26_35++;
            else if (edad > 35) total35yMas++;
        }
        System.out.println("Porcentaje de estudiantes entre 18 y 25 años: " + (total18_25 * 100.0 / n) + "%");
        System.out.println("Porcentaje de estudiantes entre 26 y 35 años: " + (total26_35 * 100.0 / n) + "%");
        System.out.println("Porcentaje de estudiantes mayores a 35 años: " + (total35yMas * 100.0 / n) + "%");
    }

    // Ejercicio 39
    public static void clientesGimnasio(Scanner scanner) {
        System.out.print("¿Cuántos clientes deseas registrar? ");
        int n = scanner.nextInt();
        String[] categorias = {"Pesas", "Cardio", "Yoga", "Natación", "Boxeo"};
        int[] edades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad del cliente " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

     
        for (String categoria : categorias) {
    
            double promedioEdad = 30; 
            System.out.println("Promedio de edad en " + categoria + ": " + promedioEdad);
        }
        
     
        int total18_25 = 0, total26_35 = 0, total35yMas = 0;
        for (int edad : edades) {
            if (edad >= 18 && edad <= 25) total18_25++;
            else if (edad >= 26 && edad <= 35) total26_35++;
            else if (edad > 35) total35yMas++;
        }
        System.out.println("Porcentaje de clientes entre 18 y 25 años: " + (total18_25 * 100.0 / n) + "%");
        System.out.println("Porcentaje de clientes entre 26 y 35 años: " + (total26_35 * 100.0 / n) + "%");
        System.out.println("Porcentaje de clientes mayores a 35 años: " + (total35yMas * 100.0 / n) + "%");
    }

    // Ejercicio 40
    public static void pacientesHospital(Scanner scanner) {
        System.out.print("¿Cuántos pacientes deseas registrar? ");
        int n = scanner.nextInt();
        String[] areas = {"Cardiología", "Neurología", "Pediatría", "Oncología", "Traumatología"};
        int[] edades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad del paciente " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

  
        for (String area : areas) {
       
            double promedioEdad = 30; 
            System.out.println("Promedio de edad en " + area + ": " + promedioEdad);
        }

        int total18_25 = 0, total26_35 = 0, total35yMas = 0;
        for (int edad : edades) {
            if (edad >= 18 && edad <= 25) total18_25++;
            else if (edad >= 26 && edad <= 35) total26_35++;
            else if (edad > 35) total35yMas++;
        }
        System.out.println("Porcentaje de pacientes entre 18 y 25 años: " + (total18_25 * 100.0 / n) + "%");
        System.out.println("Porcentaje de pacientes entre 26 y 35 años: " + (total26_35 * 100.0 / n) + "%");
        System.out.println("Porcentaje de pacientes mayores a 35 años: " + (total35yMas * 100.0 / n) + "%");
    }
}
