class Guia2_act1 {

// Metodo Main    
    public static void main(String[] args) {

        // La parte a la izquierda de "=" declara el objeto
        // La parte a la derecha de "=" instancia el objeto
        Dupla primerPar = new Dupla();
        int x, y;

        // Guardar 2 enteros
        primerPar.guarda(12, 32);
        // Se leen los valores y se asignan a "x" y "y"
        x = primerPar.leeA();
        y = primerPar.leeB();

        // Salida en pantalla
        System.out.println("Valor del primerPar.a:" + x);
        System.out.println("Valor del primerPar.b:" + y);

        // No es necesario el return 0, la clase main de java no regresa valores
        //return 0;
    }
}