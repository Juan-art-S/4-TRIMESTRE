
package App;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicios {
//    public static void main(String[] args) {
//     //Ejercicio 1//
//    int edad = 25;
//    System.out.println("Edad: " + edad);
//    //Ejercicio 2//
//    double altura =1.75;
//    System.out.println("Altura: " + altura);
//    //Ejercicio 3//
//    String Nombre = "Juan";
//    System.out.println("Nombre: " + Nombre);
//    //Ejercicio 4//
//    boolean Casado = true;
//    System.out.println("¿Casado?: " + Casado);
//    //Ejercicio 5//
//    int año = 2022;
//    System.out.println("Año: " + año);
//    //Ejercicio 6//
//    char letra = 'A';
//    System.out.println("Letra: " + letra);
//    //Ejercicio 7//
//    float peso = 70.5f;
//     System.out.println("Peso: " + peso);
//    //Ejercicio 8//
//    long dni = 12345678L;
//    System.out.println("Dni: " + dni);
//    //Ejercicio 9//
//    short edadshort = 25;
//    System.out.println("Edad 2: " + edadshort);
//    //Ejercicio 10//
//    byte nota = 8;
//    System.out.println("Nota: " + nota);
//     //Ejercicio 11//
//    String Apellido = "Perez";
//    System.out.println("Apellido: " + Apellido);
//    //Ejercicio 12//
//    boolean mayorEdad =false;
//    System.out.println("¿Es mayor de edad?: " + mayorEdad);
//    //Ejercicio 13//
//    int mes = 6;
//    System.out.println("Mes: " + mes);
//    //Ejercicio 14//
//    double salario = 2500.50;
//    System.out.println("Salario: " + salario);
//    //Ejercicio 15//
//    char sexo = 'M';
//    System.out.println("Sexo: " + sexo);
//    //Ejercicio 16//
//    float alturaFloat = 1.80f;
//    System.out.println("Altura 2: " + alturaFloat);
//    //Ejercicio 17//
//    long telefono = 1234567890L;
//    System.out.println("Telefono: " + telefono);
//    //Ejercicio 18//
//    short anio = 2020;
//    System.out.println("Anio: " + anio);
//    //Ejercicio 19//
//    byte notabyte = 9;
//    System.out.println("Nota 2: " + notabyte);     
//    }
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//          //Ejercicio 20//
//       int precio = 20000;
//       double preciodouble = precio;
//        System.out.println(preciodouble);
//       //Ejercicio 21//
//       double precioP = 10.4;
//       long precioint = Math.round(precioP);
//        System.out.println(precioint);
//       //Ejercicio 22//
//       char Letra = 'y';
//       int numLetra = (int)Letra;
//        System.out.println(numLetra);
//       //Ejercicio 23//
//       int Num2 = 64;
//       int Num = 1; 
//       int num3 = Num2 + Num ;
//       char Let = (char)num3;
//        System.out.println(Let);
//       //Ejercicio 24//
//       String Edad = "24";
//       int EdadNum = Integer.parseInt(Edad);
//        System.out.println("Validacion de edad" + EdadNum);
//       //Ejercicio 25//
//       int Codigo = 02;
//       String Valid = String.valueOf(Codigo);
//       System.out.println("Visualizacion de id:" + Valid);
//       //Ejercicio 26//
//       float Clima = 10.5f;
//       double Preciso = Clima;
//       System.out.println("El clima es" + Preciso);
//       //Ejercicio 27/
//       double Medida = 10.5;
//       float Precisa = (float)Medida;
//       System.out.println("la medida precisa es" + Precisa);
//       //Ejercicio 28//
//       String Num1 = "215";
//       String Nume2 = "245";
//       double NumeroR = Double.parseDouble(Num1);
//       double NumeroR2 = Double.parseDouble(Nume2);
//       double Result = NumeroR + NumeroR2;
//       System.out.println("Su resultado es:" + Result);
//       //Ejercicio 29//
//       double $Banco = 321;
//       String Res= String.valueOf($Banco);
//       System.out.println("" + Res);
//       //Ejercicio 30//
//       long Valor = 315421;
//       int Val = (int)Valor;
//       System.out.println("Numero de votantes" + Val);
//       //Ejercicio 31//
//       int Visitas = 123848;
//       long Vistas = (long)Visitas;
//       System.out.println("Visitas =" + Vistas);
//       //Ejercicio 32//
//       short sPeso = 3124;
//       byte Controlador = (byte)sPeso;
//       System.out.println("Peso =" + Controlador);
//       //Ejercicio 33//
//       byte peso = 23;
//       short calculo = peso;
//       System.out.println("Calculo preciso="+ calculo);
//       //Ejercicio 34//
//       String Recorrido = "32";
//       float Calorias = Float.parseFloat(Recorrido);
//        System.out.println("calorias =" + Calorias);
//       //Ejercicio 35//
//       float Gastos = 1533;
//       String informe = String.valueOf(Gastos);
//        System.out.println("Presupuesto" + informe);
//       //Ejercicio 36//
//       boolean Terminos = true;
//       String Consentimiento =String.valueOf(Terminos);
//       System.out.println("Terminos y condiciones:" + Consentimiento);
//       //Ejercicio 37//
//       String Respuesta = "true";
//       boolean Traductor = Boolean.getBoolean(Respuesta);
//       System.out.println("Respuesta:" + Traductor);
//       //Ejercicio 38//
//       int Valores = 23;
//       byte Peso = (byte)Valores;
//       System.out.println("Nuevo Peso:" + Peso);
//       //Ejercicio 39//
//       byte Datos = 23;
//       int Procesado = (int)Datos;
//       System.out.println("Datos  Procesados" + Procesado);
//       //Ejercicio 40//
//       String FechaC = "2024-07-09";
//       LocalDate FechaL = LocalDate.parse(FechaC);
//       System.out.println("" + FechaL);
//       //Ejercicio 41//
//       String HoraM = "";
//       LocalDateTime Mensajes = LocalDateTime.parse(HoraM);
//       System.out.println("Hora de mensajes "+ Mensajes);
//       //Ejercicio 42//
//       String Hora = "";
//       LocalTime Despertador = LocalTime.parse(Hora);
//       System.out.println("Hora para despertar:" + Despertador);
//       //Ejercicio 43//
//       String Vuelo = "";
//       ZonedDateTime HoraV = ZonedDateTime.parse(Vuelo);
//       System.out.println("" + HoraV);
//       //Ejercicio 44//
//       String Evento = "";
//       Instant Orden = Instant.parse(Evento);
//       System.out.println("Orden = " + Orden);
//       //Ejercicio 45//
//       String Suscripcion = "";
//       Period calculo1 = Period.parse(Suscripcion);
//       System.out.println(" " + calculo1);
//       //Ejercicio 46//
//       String Duracion = "";
//       Duration Tiempo = Duration.parse(Duracion);
//       System.out.println("Duracion de ejercicio =" + Tiempo);
//       //Ejercicio 47//
//       String Fechas = "";
//       OffsetDateTime Evento1 = OffsetDateTime.parse(Fechas);
//       System.out.println(""+ Evento1);
//       //Ejercicio 48//
//       String Horas = "";
//       OffsetTime Horarios = OffsetTime.parse(Horas, DateTimeFormatter.ISO_DATE);
//       System.out.println("" + Horarios);
//       //Ejercicio 49//
//       String Ingreso = "";
//       Year Salida = Year.parse(Ingreso);
//       System.out.println("Tiempo:" + Salida);
//       //Ejercicio 50//
//       String Facturacion = "";
//       YearMonth fechaf = YearMonth.parse(Facturacion, DateTimeFormatter.ISO_DATE);
//       System.out.println("Ciclo de facturacion" + fechaf);
//    }
    
    
    
    
//    public static void main(String[] args) {
    /*Qué maravilloso es que nadie tenga que esperar ni
    un segundo para empezar a mejorar el mundo» —Ana Frank*/
    //Ejercicio 51//
//    System.out.println("\033[3mQué maravilloso es que nadie tenga que esperar ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 52//
//    System.out.println("\033[3mQué maravilloso es que nadie tenga que esperar\033[32m ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 53//
//    System.out.println("\033[31mQué maravilloso es que nadie tenga que esperar ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 54//
//    System.out.println("\033[31m***********************************************************************************************************");
    //Ejercicio 55//
//    System.out.println("\033[32mQué maravilloso es que nadie tenga que esperar ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 56//
//    System.out.println("\033[33mQué maravilloso es que nadie tenga que esperar ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 57//
//    System.out.println("\033[34mQué maravilloso es que nadie tenga que esperar ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 58//
//    System.out.println("\033[35mQué maravilloso es que nadie tenga que esperar ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 59//
//    System.out.println("\033[36mQué maravilloso es que nadie tenga que esperar ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 60//
//    System.out.println("\033[37mQué maravilloso es que nadie tenga que esperar ni un segundo para empezar a mejorar el mundo» —Ana Frank;");
    //Ejercicio 61//
//    System.out.println("\033[33mQué maravilloso es \033[35m que nadie tenga que esperar\033[32m ni un segundo para \033[34m empezar a mejorar el mundo»\033[30m —Ana Frank;");
    //Ejercicio 62//
//    char c = 'J';
//    System.out.printf("Caracter:%c%n",c);
    //Ejercicio 63//
//    int Ent = 50;
//    System.out.printf("Entero:%d%n",Ent);
    //Ejercicio 64//
//    float Num = 2315.123f;
//    System.out.printf("Numero flotante: %e%n",Num);
    //Ejercicio 65//
//    float Num2 = 2131.654f;
//    System.out.printf("Numero flotante especificador: %f%n",Num2);
    //Ejercicio 66//
//    int Num3 = 8;
//    System.out.printf("Numero entero: %o%n",Num3);
    //Ejercicio 67//
//    String Caracteres = "";
//    System.out.printf("Caracter: %s%n",Caracteres);
    //Ejercicio 68//
//    int Num4 = 16;
//    System.out.printf("Numero %x%n",Num4);
    //Ejercicio 69//
//    String Fecha5 = "";
//    LocalTime Fecha6 = LocalTime.parse(Fecha5, DateTimeFormatter.ISO_DATE);
//    System.out.printf("Fecha Local: %t%n",Fecha6);
    //Ejercicio 70//
/*    String nombreEmpresa = "Artesanías Nobsa";
      String direccion = "Carrera 8 Centro";
      String celular = "3136789012";
      String numeroFactura = "F123456";
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      String fechaHora = formatter.format(new Date());
      String[] articulos = {"Jarrón de barro", "Tapete tejido", "Figura de madera", "Pulsera artesanal"};
      int[] cantidades = {2, 1, 3, 5};
      double[] preciosUnitarios = {45000.00, 80000.00, 25000.00, 12000.00};
      System.out.println("*******************************");
      System.out.println("         " + nombreEmpresa);
      System.out.println("       " + direccion);
      System.out.println("         Celular: " + celular);
      System.out.println(" Número de factura: " + numeroFactura);
      System.out.println(" Fecha y hora: " + fechaHora);
      System.out.println("*******************************");
      System.out.println(" Artículo                   Cantidad   Precio Unitario   Total");
      System.out.println("-------------------------------------------------------------");

      double totalGeneral = 0.0;

      for (int i = 0; i < articulos.length; i++) {
        double totalArticulo = cantidades[i] * preciosUnitarios[i];
        totalGeneral += totalArticulo;
        System.out.printf("%-25s %-10d $%-15.2f $%.2f\n", articulos[i], cantidades[i], preciosUnitarios[i], totalArticulo);
    }
      System.out.println("-------------------------------------------------------------");
      System.out.printf("Total General: $%.2f\n", totalGeneral);
      System.out.println("*******************************");
      System.out.println("¡Gracias por su compra!");
      System.out.println("*******************************");*/
    
    
    
    
    
/*    //Ejercicio 71//
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el capital inicial: ");
        double capital = sc.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (en %): ");
        double tasa = sc.nextDouble() / 100;
        System.out.print("Ingrese el número de años: ");
        int años = sc.nextInt();

        double monto = capital * Math.pow(1 + tasa, años);
        System.out.printf("El monto total después de %d años es: $%.2f\n", años, monto);
//
    //Ejercicio 72//
        Scanner scc = new Scanner(System.in);
        System.out.print("Ingrese el precio original: ");
        double precioOriginal = scc.nextDouble();
        System.out.print("Ingrese el descuento porcentual: ");
        double descuento = scc.nextDouble() / 100;

        double precioFinal = precioOriginal * (1 - descuento);
        System.out.printf("El precio final después del descuento es: $%.2f\n", precioFinal);
    
    //Ejercicio 73//
        Scanner ssc = new Scanner(System.in);
        System.out.print("Ingrese el tiempo total del proyecto en horas: ");
        int tiempoProyecto = ssc.nextInt();
        System.out.print("Ingrese las horas que puede trabajar un trabajador en un día: ");
        int horasPorTrabajador = ssc.nextInt();
        System.out.print("Ingrese el trabajo total en horas: ");
        int trabajoTotal = ssc.nextInt();

        int trabajadores = (int) Math.ceil((double) trabajoTotal / (tiempoProyecto * horasPorTrabajador));
        System.out.printf("Número mínimo de trabajadores necesarios: %d\n", trabajadores);
    
    //Ejercicio 74//
    Scanner sscc = new Scanner(System.in);
        System.out.print("Ingrese la distancia en millas: ");
        double millas = sscc.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.printf("La distancia en kilómetros es: %.2f km\n", kilometros);
    
    
    //Ejercicio 75//
     Scanner ssscc = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = ssscc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El área del círculo es: %.2f\n", area);
    
    //Ejercicio 76//
    Scanner sssccc = new Scanner(System.in);
        System.out.print("Ingrese el cateto 1: ");
        double cateto1 = sssccc.nextDouble();
        System.out.print("Ingrese el cateto 2: ");
        double cateto2 = sssccc.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("La hipotenusa es: %.2f\n", hipotenusa);
    
    //Ejercicio 77//
     Scanner sssscc = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro: ");
        double radio1 = sssscc.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = sssscc.nextDouble();
        double volumen = Math.PI * Math.pow(radio1, 2) * altura;
        System.out.printf("El volumen del cilindro es: %.2f\n", volumen);
    
    //Ejercicio 78//
     Scanner ssssc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = ssssc.nextDouble();
        double raiz = Math.sqrt(numero);
        System.out.printf("La raíz cuadrada de %.2f es: %.2f\n", numero, raiz);
    //Ejercicio 79//
    Scanner ssssccc = new Scanner(System.in);
        System.out.print("Ingrese el monto del préstamo: ");
        double principal = ssssccc.nextDouble();
        System.out.print("Ingrese la tasa de interés (en %): ");
        double tasa2 = sc.nextDouble() / 100;
        System.out.print("Ingrese el tiempo en años: ");
        int tiempo = ssssccc.nextInt();

        double costoTotal = principal * (1 + (tasa * tiempo));
        System.out.printf("El costo total del préstamo es: $%.2f\n", costoTotal);
    //Ejercicio 80//
    Scanner sssscccc = new Scanner(System.in);
        System.out.print("Ingrese el valor del seno: ");
        double seno = sssscccc.nextDouble();
        double angulo = Math.asin(seno);
        System.out.printf("El ángulo en radianes es: %.2f\n", angulo);
    
    //Ejercicio 81//
    Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el tiempo inicial en minutos: ");
        int tiempoInicial = scan.nextInt();
        System.out.print("Ingrese el tiempo final en minutos: ");
        int tiempoFinal = scan.nextInt();

        int diferencia = tiempoFinal - tiempoInicial;
        System.out.printf("La diferencia de tiempo es: %d minutos\n", diferencia);
    //Ejercicio 82//
    Scanner scann = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = scann.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("La temperatura en grados Celsius es: %.2f\n", celsius);
    
    //Ejercicio 83//
    Scanner scannn = new Scanner(System.in);
        System.out.print("Ingrese el total anual de ventas: ");
        double totalAnual = scannn.nextDouble();
        System.out.print("Ingrese el número de meses: ");
        int meses = scannn.nextInt();

        double promedioMensual = totalAnual / meses;
        System.out.printf("El promedio de ventas mensuales es: $%.2f\n", promedioMensual);
    
    //Ejercicio 84//
     Scanner scanne = new Scanner(System.in);
        System.out.print("Ingrese la longitud del semi-eje mayor: ");
        double a = scanne.nextDouble();
        System.out.print("Ingrese la longitud del semi-eje menor: ");
        double b = scanne.nextDouble();
        double perimetro = Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
        System.out.printf("El perímetro de la elipse es: %.2f\n", perimetro);
    
    //Ejercicio 85//
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto del préstamo: ");
        double monto2 = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (en %): ");
        double tasa1 = scanner.nextDouble() / 100 / 12; // mensual
        System.out.print("Ingrese el plazo en años: ");
        int años1 = scanner.nextInt();
        int meses1 = años1 * 12;

        double amortizacion = (monto2 * tasa1) / (1 - Math.pow(1 + tasa1, -meses1));
        System.out.printf("La amortización mensual es: $%.2f\n", amortizacion);
    //Ejercicio 86//
    Scanner escaner = new Scanner(System.in);
        System.out.print("Ingrese la distancia recorrida (en km): ");
        double distancia = escaner.nextDouble();
        System.out.print("Ingrese el tiempo (en horas): ");
        double tiempo2 = escaner.nextDouble();

        double velocidad = distancia / tiempo2;
        System.out.printf("La velocidad promedio es: %.2f km/h\n", velocidad);
    //Ejercicio 87//
     Scanner esscan = new Scanner(System.in);
        System.out.print("Ingrese el costo del activo: ");
        double costo = esscan.nextDouble();
        System.out.print("Ingrese el valor residual: ");
        double valorResidual = esscan.nextDouble();
        System.out.print("Ingrese la vida útil en años: ");
        int vidaUtil = esscan.nextInt();

        double depreciacionAnual = (costo - valorResidual) / vidaUtil;
        System.out.printf("La depreciación anual es: $%.2f\n", depreciacionAnual);
    //Ejercicio 88//
    Scanner esc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int aa = esc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int bb = esc.nextInt();

        while (bb != 0) {
            int temp = bb;
            bb = aa % bb;
            aa = temp;
        }
        System.out.printf("El MCD es: %d\n", aa);
    //Ejercicio 89//
        Scanner escc = new Scanner(System.in);
        System.out.print("Ingrese el número de casos favorables: ");
        int casosFavorables = escc.nextInt();
        System.out.print("Ingrese el número total de casos posibles: ");
        int totalCasos = escc.nextInt();

        double probabilidad = (double) casosFavorables / totalCasos;
        System.out.printf("La probabilidad del evento es: %.2f\n", probabilidad);
    //Ejercicio 90//
        Scanner esscc = new Scanner(System.in);
        System.out.print("Ingrese el pago periódico: ");
        double pago = esscc.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (en %): ");
        double tasa3 = esscc.nextDouble() / 100;
        System.out.print("Ingrese el número de períodos: ");
        int n = sc.nextInt();

        double valorFuturo = pago * ((Math.pow(1 + tasa3, n) - 1) / tasa3);
        System.out.printf("El valor futuro de la anualidad es: $%.2f\n", valorFuturo);*/

    
    
    
    
    
    /*    //Ejercicio 91//
    public class ElegibilidadPrestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese el ingreso anual en COP: ");
        double ingresoAnual = sc.nextDouble();
        System.out.print("Ingrese la puntuación crediticia: ");
        int puntuacion = sc.nextInt();

        boolean elegible = edad > 25 && ingresoAnual > 50000000 && puntuacion > 700;
        System.out.println("Elegible para préstamo hipotecario: " + elegible);
    //Ejercicio 92//
     Scanner ssc = new Scanner(System.in);
        double distancia = 500; // en km
        double costoCoche = 1500;
        double costoBus = 900;
        double costoAvion = 3000;

        System.out.print("Ingrese el número de pasajeros: ");
        int pasajeros = ssc.nextInt();

        double costoTotalCoche = distancia * costoCoche;
        double costoTotalBus = distancia * costoBus;
        double costoTotalAvion = distancia * costoAvion;

        if (pasajeros > 3) {
            costoTotalCoche *= 0.9;
            costoTotalBus *= 0.9;
            costoTotalAvion *= 0.9;
        }

        System.out.printf("Costo total en coche: $%.2f\n", costoTotalCoche);
        System.out.printf("Costo total en autobús: $%.2f\n", costoTotalBus);
        System.out.printf("Costo total en avión: $%.2f\n", costoTotalAvion);
        
        //Ejercicio 93//
         Scanner sssc = new Scanner(System.in);
        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = sssc.nextDouble();
        System.out.print("Ingrese el número de actividades extracurriculares: ");
        int actividades = sssc.nextInt();
        System.out.print("Ingrese los ingresos familiares en COP: ");
        double ingresosFamiliares = sc.nextDouble();

        boolean elegible2 = promedio >= 85 && actividades >= 3 && ingresosFamiliares < 30000000;
        System.out.println("Elegible para beca: " + elegible);
    //Ejercicio 94//
    Scanner ssssc = new Scanner(System.in);
        System.out.print("Ingrese el estado de inicio de sesión (true/false): ");
        boolean inicioSesion = ssssc.nextBoolean();
        System.out.print("Ingrese el rol del usuario (admin o null): ");
        String rol = ssssc.next();

        if (rol.equals("admin")) {
            System.out.println("Clasificación: Administrador");
        } else if (inicioSesion) {
            System.out.println("Clasificación: Usuario registrado");
        } else {
            System.out.println("Clasificación: Visitante");
        }
    //Ejercicio 95//
    Scanner sssssc = new Scanner(System.in);
        System.out.print("Ingrese el capital disponible en COP: ");
        double capital = sssssc.nextDouble();
        System.out.print("Ingrese la tasa de retorno esperada (en %): ");
        double retorno = sssssc.nextDouble();
        System.out.print("Ingrese el riesgo asociado (en %): ");
        double riesgo = sssssc.nextDouble();

        boolean viable = capital > 100000000 && retorno >= 10 && riesgo < 20;
        System.out.println("Inversión viable: " + viable);
    //Ejercicio 96//
    Scanner scc = new Scanner(System.in);
        System.out.print("Ingrese el salario bruto en COP: ");
        double salarioBruto = scc.nextDouble();

        double impuestos = salarioBruto * 0.20;
        double seguridadSocial = salarioBruto * 0.05;
        double otrosDescuentos = 200000;

        double salarioNeto = salarioBruto - impuestos - seguridadSocial - otrosDescuentos;
        System.out.printf("El salario neto es: $%.2f\n", salarioNeto);
    //Ejercicio 97//
    Scanner sccc = new Scanner(System.in);
        System.out.print("Ingrese la urgencia (crítica, alta, baja): ");
        String urgencia = sccc.next();
        System.out.print("Ingrese el impacto (alto, medio, bajo): ");
        String impacto = sccc.next();

        String prioridad;
        if (urgencia.equals("crítica") || impacto.equals("alto")) {
            prioridad = "Alta";
        } else if (urgencia.equals("alta") || impacto.equals("medio")) {
            prioridad = "Media";
        } else {
            prioridad = "Baja";
        }

        System.out.println("Prioridad del ticket: " + prioridad);
    //Ejercicio 98//
    Scanner scccc = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad2 = scccc.nextInt();
        System.out.print("Ingrese si tiene enfermedades crónicas (true/false): ");
        boolean enfermedadesCronicas = scccc.nextBoolean();
        System.out.print("Ingrese si fuma (true/false): ");
        boolean fuma = scccc.nextBoolean();

        boolean elegible3 = edad2 == 30 && !enfermedadesCronicas && !fuma;
        System.out.println("Elegible para seguro de salud premium: " + elegible);
    //Ejercicio 99//
    Scanner sccccc = new Scanner(System.in);
        System.out.print("Ingrese los ingresos proyectados en COP: ");
        double ingresos = sccccc.nextDouble();
        System.out.print("Ingrese los costos iniciales en COP: ");
        double costosIniciales = sccccc.nextDouble();
        System.out.print("Ingrese los costos operativos anuales en COP: ");
        double costosOperativos = sccccc.nextDouble();
        System.out.print("Ingrese el número de años: ");
        int años = sccccc.nextInt();

        double costosTotales = costosIniciales + (costosOperativos * años);
        boolean rentable = ingresos > costosTotales;
        System.out.println("El proyecto es rentable: " + rentable);
    //Ejercicio 100//
    Scanner sscc = new Scanner(System.in);
        System.out.print("Ingrese el valor de la propiedad (residencial o comercial): ");
        double valor = sscc.nextDouble();
        double tasa;

        if (valor <= 250000000) {
            tasa = 0.012; // residencial
        } else {
            tasa = 0.02; // comercial
        }

        double impuestos2 = valor * tasa;
        System.out.printf("Los impuestos de la propiedad son: $%.2f\n", impuestos2);
    //Ejercicio 101//
    Scanner ssscc = new Scanner(System.in);
        System.out.print("Ingrese las toneladas de CO2 emitidas: ");
        double co2 = ssscc.nextDouble();
        System.out.print("Ingrese los m³ de agua usados: ");
        double agua = ssscc.nextDouble();
        System.out.print("Ingrese las toneladas de residuos sólidos generadas: ");
        double residuos = ssscc.nextDouble();

        boolean cumple = co2 <= 100 && agua <= 40000 && residuos <= 150;
        System.out.println("Cumple con los estándares ambientales: " + cumple);
   
    //Ejercicio 102//
    Scanner sssscc = new Scanner(System.in);
        System.out.print("Ingrese los años de servicio: ");
        int añosServicio = sssscc.nextInt();
        System.out.print("Ingrese el salario promedio en COP: ");
        double salarioPromedio = sssscc.nextDouble();
        double contribuciones = salarioPromedio * 0.10 * añosServicio;

        System.out.printf("La pensión de jubilación es: $%.2f\n", contribuciones);
    //Ejercicio 103//
    Scanner ssssscc = new Scanner(System.in);
        System.out.print("Ingrese el monto de la inversión en COP: ");
        double inversion = ssssscc.nextDouble();
        System.out.print("Ingrese la volatilidad (en %): ");
        double volatilidad = ssssscc.nextDouble();

        String clasificacion;
        if (volatilidad < 5) {
            clasificacion = "Bajo riesgo";
        } else if (volatilidad <= 15) {
            clasificacion = "Medio riesgo";
        } else {
            clasificacion = "Alto riesgo";
        }

        System.out.println("Clasificación de la inversión: " + clasificacion);
    //Ejercicio 104//
       Scanner ssccc = new Scanner(System.in);
        System.out.print("Ingrese el número de pisos: ");
        int pisos = ssccc.nextInt();
        System.out.print("Ingrese si usa materiales resistentes al fuego (true/false): ");
        boolean materialesResistentes = ssccc.nextBoolean();
        System.out.print("Ingrese si soporta terremotos de magnitud 8 (true/false): ");
        boolean disenoSismoResistente = ssccc.nextBoolean();

        boolean cumple1 = pisos <= 10 && materialesResistentes && disenoSismoResistente;
        System.out.println("Cumple con las normativas locales: " + cumple1);
    //Ejercicio 105//
    Scanner ssccccc = new Scanner(System.in);
        double costoInternet = 150000;
        double costoCable = 120000;
        double costoTelefono = 90000;

        System.out.print("¿Desea contratar todos los servicios? (true/false): ");
        boolean todosServicios = sc.nextBoolean();

        double costoTotal = costoInternet + costoCable + costoTelefono;
        if (todosServicios) {
            costoTotal *= 0.85; // Descuento del 15%
        }

        System.out.printf("El costo total es: $%.2f\n", costoTotal);
    //Ejercicio 106//
     Scanner sssccc = new Scanner(System.in);
        System.out.print("Ingrese si tiene un historial de adopción positivo (true/false): ");
        boolean historialAdopcion = sssccc.nextBoolean();
        System.out.print("Ingrese si tiene un entorno doméstico adecuado (true/false): ");
        boolean entornoAdecuado = sssccc.nextBoolean();
        System.out.print("Ingrese el ingreso mensual en COP: ");
        double ingresoMensual = sssccc.nextDouble();

        boolean elegible1 = historialAdopcion && entornoAdecuado && ingresoMensual > 2000000;
        System.out.println("Elegible para adoptar una mascota: " + elegible1);
    
    //Ejercicio 107//
     Scanner ssscccc = new Scanner(System.in);
        System.out.print("Ingrese el valor del producto en COP: ");
        double valor1 = ssscccc.nextDouble();
        double tarifa;

        if (valor1 <= 1000000) {
            tarifa = 0.05; // 5%
        } else {
            tarifa = 0.15; // 15%
        }

        double impuestos3 = valor1 * tarifa;
        System.out.printf("Los impuestos de importación son: $%.2f\n", impuestos3);
    //Ejercicio 108//
    Scanner ssssccc = new Scanner(System.in);
        System.out.print("Ingrese el consumo total en kWh: ");
        double consumoTotal = ssssccc.nextDouble();
        System.out.print("Ingrese el porcentaje de consumo solar: ");
        double consumoSolar = ssssccc.nextDouble();
        System.out.print("Ingrese el porcentaje de ahorro energético: ");
        double ahorroEnergetico = ssssccc.nextDouble();

        double consumoReducido = consumoTotal * (1 - ahorroEnergetico / 100);
        double consumoFinal = consumoReducido * (1 - consumoSolar / 100);
        System.out.printf("Consumo final del edificio: %.2f kWh\n", consumoFinal);
    //Ejercicio 109//
    Scanner sssscccc = new Scanner(System.in);
        System.out.print("Ingrese el total de ventas en COP: ");
        double ventas = sssscccc.nextDouble();

        double bonificacion;
        if (ventas <= 50000000) {
            bonificacion = ventas * 0.05;
        } else {
            bonificacion = (50000000 * 0.05) + ((ventas - 50000000) * 0.10);
        }

        System.out.printf("La bonificación del vendedor es: $%.2f\n", bonificacion);
    //Ejercicio 110//
    Scanner sssssccccc = new Scanner(System.in);
        System.out.print("Ingrese el número de personas beneficiadas: ");
        int beneficiadas = sssssccccc.nextInt();
        System.out.print("Ingrese el número de personas afectadas: ");
        int afectadas = sssssccccc.nextInt();
        System.out.print("Ingrese el costo de implementación en COP: ");
        double costo = sssssccccc.nextDouble();

        System.out.printf("Impacto social neto: %d personas beneficiadas - %d personas afectadas, Costo: $%.2f\n",
                beneficiadas, afectadas, costo);
   
        }*/
    
    


    
    
    //Ejercicio 111//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = sc.nextInt();
        double sumaSalarios = 0;

        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el salario del empleado " + (i + 1) + ": ");
            double salario = sc.nextDouble();
            sumaSalarios += salario;
        }

        double salarioPromedio = sumaSalarios / numEmpleados;
        System.out.printf("El salario promedio es: $%.2f\n", salarioPromedio);
    //Ejercicio 112//
     Scanner ssc = new Scanner(System.in);
        HashMap<String, Integer> inventario = new HashMap<>();
        String producto;

        while (true) {
            System.out.print("Ingrese el nombre del producto (o 'salir' para terminar): ");
            producto = sc.next();
            if (producto.equalsIgnoreCase("salir")) break;

            System.out.print("Ingrese la cantidad: ");
            int cantidad = sc.nextInt();
            inventario.put(producto, cantidad);
        }

        System.out.println("Inventario completo:");
        for (String key : inventario.keySet()) {
            System.out.println("Producto: " + key + ", Cantidad: " + inventario.get(key));
        }
    //Ejercicio 113//
    Scanner sssc = new Scanner(System.in);
        double totalVentas = 0;

        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingrese las ventas del día " + dia + ": ");
            double ventas = sssc.nextDouble();
            totalVentas += ventas;
        }

        System.out.printf("El total de ventas de la semana es: $%.2f\n", totalVentas);
    
    //Ejercicio 114//
    Scanner ssssc = new Scanner(System.in);
        System.out.print("Ingrese el número de clientes: ");
        int numClientes = ssssc.nextInt();
        double sumaCalificaciones = 0;

        for (int i = 0; i < numClientes; i++) {
            System.out.print("Ingrese la calificación del cliente " + (i + 1) + ": ");
            double calificacion = ssssc.nextDouble();
            sumaCalificaciones += calificacion;
        }

        double calificacionPromedio = sumaCalificaciones / numClientes;
        System.out.printf("La calificación promedio es: %.2f\n", calificacionPromedio);
    //Ejercicio 115//
    Scanner sssssc = new Scanner(System.in);
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados1 = sssssc.nextInt();
        String[] nombres = new String[numEmpleados1];
        int[] diasAsistidos = new int[numEmpleados1];

        for (int i = 0; i < numEmpleados1; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sssssc.next();
            System.out.print("Ingrese el número de días asistidos: ");
            diasAsistidos[i] = sssssc.nextInt();
        }

        System.out.println("Resumen de asistencia:");
        for (int i = 0; i < numEmpleados1; i++) {
            System.out.println("Empleado: " + nombres[i] + ", Días asistidos: " + diasAsistidos[i]);
        }
    //Ejercicio 116//
    Scanner sscc = new Scanner(System.in);
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados2 = sscc.nextInt();
        String[] nombres1 = new String[numEmpleados2];
        double[] salarios = new double[numEmpleados2];
        double[] rendimientos = new double[numEmpleados2];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sscc.next();
            System.out.print("Ingrese el salario: ");
            salarios[i] = sscc.nextDouble();
            System.out.print("Ingrese el rendimiento (0-100): ");
            rendimientos[i] = sscc.nextDouble();
        }

        System.out.println("Bonificaciones:");
        for (int i = 0; i < numEmpleados2; i++) {
            double bonificacion = salarios[i] * (rendimientos[i] / 100);
            System.out.printf("Empleado: %s, Bonificación: $%.2f\n", nombres1[i], bonificacion);
        }
    //Ejercicio 117//
    Scanner escaner = new Scanner(System.in);
        HashMap<String, String> proyectos = new HashMap<>();
        String nombreProyecto;

        while (true) {
            System.out.print("Ingrese el nombre del proyecto (o 'salir' para terminar): ");
            nombreProyecto = escaner.next();
            if (nombreProyecto.equalsIgnoreCase("salir")) break;

            System.out.print("Ingrese el estado del proyecto: ");
            String estado = escaner.next();
            proyectos.put(nombreProyecto, estado);
        }

        System.out.println("Estado de los proyectos:");
        for (String key : proyectos.keySet()) {
            System.out.println("Proyecto: " + key + ", Estado: " + proyectos.get(key));
        }
    }
}

