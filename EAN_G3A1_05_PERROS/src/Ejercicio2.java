import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ronald Base de dato de perros
 */
public class Ejercicio2 {

    public static void main(String[] args) throws IOException {

        //Buffer para entrada de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Declaraci�n de base de datos de Perros, guarda 100 perros
        //Arreglo de tipo Perro
        Perro[] basePerros = new Perro[100];

        //Para empezar se simula una base de datos de 10 perros
        //A cada registro del array se le asigna un perro (un objeto de la clase Perro)
        basePerros[0] = new Perro("Beethoven", "bulldog", "Teusaquillo", "1001", "Ronald", "3222647115", "lunes");
        basePerros[1] = new Perro("Laika", "pastor aleman", "Suba", "1002", "Juan", "3008094069", "martes");
        basePerros[2] = new Perro("Rex", "gran danes", "Usaquen", "1003", "Maria", "3156789343", "miercoles");
        basePerros[3] = new Perro("Pluto", "beagle", "Chapinero", "1004", "Jose", "3218973245", "jueves");
        basePerros[4] = new Perro("Lassie", "caniche", "Teusaquillo", "Ana", "Ronald", "3008082345", "viernes");
        basePerros[5] = new Perro("Pancho", "bulldog", "Suba", "1006", "Gilberto", "3224563452", "lunes");
        basePerros[6] = new Perro("Max", "rottweiler", "Usaquen", "1007", "Pedro", "3176543985", "martes");
        basePerros[7] = new Perro("Valkiria ", "bulldog", "Teusaquillo", "Carlos", "Ronald", "3205789345", "miercoles");
        basePerros[8] = new Perro("Odie", "chihuahua", "Chapinero", "Natalia", "Ronald", "3008082367", "jueves");
        basePerros[9] = new Perro("Lobo", "labrador", "Suba", "1010", "Alex", "3108762134", "viernes");

        //Declaraci�n de variables a usar
        int opcion;
        boolean exit = false;
        String localidad1;        
        String nombre;
        String raza;
        String localidad;
        String cedula;
        String nombreDueno;
        String telefono;
        String diaAsistencia;
        
        //Validaci�n de datos ingresados con try/catch
        try {

            //Bandera de salida
            while (exit == false) {
                System.out.println("EJERCICIO 2: BASE DE DATOS DE PERROS");
                System.out.println("-------------------------");

                //Menu
                System.out.println("Seleccionar opcion:");
                System.out.println("1 - Ingresar nuevo perro:");
                System.out.println("2 - Mostrar perro por localidad:");
                System.out.println("3 - Mostrar todos los perros:");
                System.out.println("4 - Salir:");
                opcion = Integer.parseInt(br.readLine());

                //Se usa switch para manejar las opciones
                switch (opcion) {
                    case 1:
                        //Ingresar nuevo perro
                        System.out.println("-------------------------");
                        System.out.println("Ingresar nombre:");
                        nombre = (String) br.readLine();
                        System.out.println("Ingresar raza:");
                        raza = (String) br.readLine();
                        System.out.println("Ingresar localidad:");
                        localidad = (String) br.readLine();
                        System.out.println("Ingresar cedula:");
                        cedula = (String) br.readLine();
                        System.out.println("Ingresar nombre del duegno:");
                        nombreDueno = (String) br.readLine();
                        System.out.println("Ingresar telefono:");
                        telefono = (String) br.readLine();
                        System.out.println("Ingresar dia de asistencia:");
                        diaAsistencia = (String) br.readLine();
                        for (int i = 0; i < basePerros.length; i++) {
                            //Se encuentra la primera posicion vacia dentro de la base de datos y se inserta el nuevo perro
                            if (basePerros[i] == null) {
                                basePerros[i] = new Perro(nombre, raza, localidad, cedula, nombreDueno, telefono, diaAsistencia);
                                break;
                            };
                        }
                        System.out.println("-------------------------");
                        break;
                    case 2:
                        //Se consulta la localidad para agrupar los perros
                        System.out.println("-------------------------");
                        System.out.println("Ingresar localidad:");
                        localidad1 = (String) br.readLine();
                        for (int i = 0; i < basePerros.length; i++) {
                            if (basePerros[i] == null) {
                                break;
                            };
                            //Si la localidad del perro es igual a la localidad ingresada, se muestra en la salida
                            if (localidad1.equals(basePerros[i].localidad) ) {
                                basePerros[i].mostrarPerro();
                            }
                        }
                        System.out.println("-------------------------");
                        break;
                    case 3:
                        System.out.println("-------------------------");
                        //Se muestran todos los perros en el arreglo
                        for (int i = 0; i < basePerros.length; i++) {
                            if (basePerros[i] == null) {
                                break;
                            };
                            basePerros[i].mostrarPerro();
                        }
                        System.out.println("-------------------------");
                        break;
                    case 4:
                        //Se marca la bandera para salir
                        exit = true;
                        break;
                    default:
                        exit = true;
                        break;
                }

                //exit = true;
            }

            //Mostrar excepcion si algun dato es incorrecto
        } catch (NumberFormatException nfe) {
            System.err.println("Valor ingresado valido");
        }
    }
}