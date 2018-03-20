// Clase Dupla, el nombre de la clase debe ir en mayúsculas
class Dupla {

    // Datos miembro de la clase "dupla"
    private int a, b;

    // Funciones miembro de la clase "dupla. Deben de comenzas con minúscula
    // En Java no existe el paso por referencia para variables primitivas
    // La funcion Lee se divide en dos por lo mismo
    int leeA() {
        return a;
    }

    int leeB() {
        return b;
    }

    void guarda(int a2, int b2) {
        // Se almacenan los parámetros en los miembros del objeto
        a = a2;
        b = b2;
    }
}

// La clase se debe llamar al igual que el archivo *.java 
