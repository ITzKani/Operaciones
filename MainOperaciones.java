import java.util.Scanner;
class MainOperaciones{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        // inicio del do while, este sera la entrada para elegir una opcion del menu 
        do{

        System.out.println("********Elige una opcion************");
	    System.out.println("1) Suma");
	    System.out.println("2) Resta");
	    System.out.println("3) Multiplicacion");
	    System.out.println("4) Division");
        System.out.println("5) Salir");

        opt = sc.nextInt();
        // declaracion de variables
        double n1, n2;
        // inicio del menu, el switch lee el valor de la opcion elegida con la variable opt 
        switch (opt) {
            //  programa suma
            case 1:

            System.out.println("**Suma**");
            System.out.print("Ingresa un valor: ");
            n1 = sc.nextDouble();
            System.out.print("Ingresa otro valor: ");
            n2 = sc.nextDouble();
            Suma sm = new Suma(n1, n2);
            sm.sumar();
            sm.MostrarRes();
                // el break indica una pausa en las opciones
                break;
                // programa resta
            case 2:

            System.out.println("**Resta**");
            System.out.print("Ingresa un valor: ");
            n1 = sc.nextDouble();
            System.out.print("Ingresa otro valor: ");
            n2 = sc.nextDouble();
            Resta rs = new Resta(n1, n2);
            rs.restar();
            rs.MostrarRes();

                break;
                // programa multiplicacion
            case 3:

            System.out.println("**Multiplicacion**");
            System.out.print("Ingresa un valor: ");
            n1 = sc.nextDouble();
            System.out.print("Ingresa otro valor: ");
            n2 = sc.nextDouble();
            Multiplicacion mp = new Multiplicacion(n1, n2);
            mp.multiplicar();
            mp.MostrarRes();

                break;
                // programa division
            case 4:

            System.out.println("**Division**");
            System.out.print("Ingresa un valor: ");
            n1 = sc.nextDouble();
            System.out.print("Ingresa otro valor: ");
            n2 = sc.nextDouble();
            Division dv = new Division(n1, n2);
            dv.dividir();
            dv.MostrarRes();
                break;
                // opcion para salir del menu
            case 5:
            System.out.println("Saliendo...");
                break;
                // el default reconoce una opcion fuera del menu
            default:
            System.out.println("Error: Opcion invalida.");
                break;
        }

        System.out.println("----------------------------");
        // el while genera el bucle cundo la variable opt es diferente (!) a 5
    }while(!(opt==5));
}
}
