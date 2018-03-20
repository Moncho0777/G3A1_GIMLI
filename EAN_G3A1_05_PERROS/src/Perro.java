class Perro {

    String nombre;
    String raza;
    String localidad;
    //Dependiendo del uso podrian ser letras o numeros
    String cedula;
    String nombreDueno;
    String telefono;
    String diaAsistencia;

    // Se usa un constructor para crear un nuevo perro
    public Perro(String nombre2, String raza2, String localidad2, String cedula2, String nombreDueno2, String telefono2, String diaAsistencia2) {
        nombre = nombre2;
        raza = raza2;
        localidad = localidad2;
        cedula = cedula2;
        nombreDueno = nombreDueno2;
        telefono = telefono2;
        diaAsistencia = diaAsistencia2;

    }

    //Funcion para mostrar un perro
    void mostrarPerro() {
        System.out.println("[Perro: " + nombre + "][Raza: " + raza + "][Localidad: " + localidad + "][Cedula: " + cedula + "][Duegno: " + nombreDueno + "][Telefono: " + telefono + "][Dia de asistencia: " + diaAsistencia + "]");
    }

}