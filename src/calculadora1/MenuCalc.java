/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import java.util.Scanner;

/**
 *
 * @author davidvargas
 */
public class MenuCalc {

    Scanner sc = new Scanner(System.in);
    Operaciones Oper = new Operaciones();
    Trigonomet tri = new Trigonomet();
    Conver con = new Conver();
    int a, b;
    int grado;
    public MenuCalc() {
        a = 0;
        b = 0;
        grado=0;

    }

    public void Menu() {
        int option = 0;
        do {
            System.out.println("escoger una opcion");
            System.out.println("1) seleccione para ingresar los datos ");
            System.out.println("2) sumar ");
            System.out.println("3)restar");
            System.out.println("4)multiplicar");
            System.out.println("5)dividir");
            System.out.println("6)selecione para calc tri ");
            System.out.println("7) seno es ");
            System.out.println("8)coseno es ");
            System.out.println("9)tangente es  ");
            System.out.println("10) ingrear grados centigrados para pasar a fahrent ");
            System.out.println("11) ingrear grados fahrent para pasar a centigrados ");
            System.out.println("12)selecione para convertir masa ");
            System.out.println("13) gramo a libra y kilogramo ");
            System.out.println("14) libra a gramo y kilogramo ");
            System.out.println("15) kilogramo a libra y gramo ");
            System.out.println("16)selecione para convertir longitudes ");
            System.out.println("17) metro a kilometro y centimetro ");
            System.out.println("18) kilomtro a metro y centimetro");
            System.out.println("19) centimetro a metro y kilometro ");
            System.out.println("20)selecione para salir ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Oper.a = IngresarA();
                    Oper.b = IngresarB();
                    break;
                case 2:
                    System.out.println("la Suma es :" + Oper.Sumar());
                    break;
                case 3:
                    System.out.println("la Resta es :" + Oper.Restar());
                    break;
                case 4:
                    System.out.println("la Multiplicasion es :" + Oper.Multiplicar());
                    break;
                case 5:
                    System.out.println("la division :" + Oper.Dividir());
                    break;

                case 6:
                  tri.a=IngresarA();
                    break;
                case 7:
                    System.out.println("Seno  es: " );
                    break;
                case 8:
                    System.out.println("Coseno es" );
                    break;
                case 9:
                    System.out.println("Tangente es ");
                    break;
                    case 10:
                    con.a = Ingresargrado();
                    System.out.println("la temperatura en centigrados es  :" + con.fahrent_cels());

                    break;
                    case 11:
                    con.a = Ingresargrado();
                    System.out.println("la temperatura en fahrent es :" + con.cels_fahrent());
                    break;
                    case 12:
                    con.a = IngresarA();
                    break;
                    case 13:
                    System.out.println("libras son :" + con.gramo_libra());
                    System.out.println("kilogramos son"+con.gramo_kilogramo());
                    break;
                   case 14:
                    System.out.println("gramos  son :" + con.libra_gramo());
                    System.out.println("kilogramos son"+con.libra_kilogramo());
                    break;
                    case 15:
                    System.out.println("gramos y libra son"+con.kilogramo_gramo()  );
                    System.out.println("libras son"+con.kilogramo_libra());
                    break;
                    case 16:
                    con.a = IngresarA();
                    break;
                    case 17:
                    System.out.println("kilometros son :" + con.metro_kilometro());
                    System.out.println("centimetros son"+con.metro_centimetro());
                    break;
                    case 18:
                    System.out.println("metros son:" + con.kilometro_metro());
                    System.out.println("centimetros son"+con.kilmetro_centimetro());
                    break;
                    case 19:
                    System.out.println("metros son :" + con.centimetros_metro());
                     System.out.println("kilometros son"+con.centimetros_kilometro());
                    break;
                case 20:
                    option = 20;
                    break;
            }
        } while (option != 20);

    }

    public int IngresarA() {

        System.out.println("Ingresar el primer valor");
        a = sc.nextInt();
        return a;
    }

    public int IngresarB() {

        System.out.println("Ingresar el segundo valor");
        b = sc.nextInt();
        return b;
    }
    public int Ingresargrado() {

        System.out.println("Ingresar el grado");
         grado = sc.nextInt();
        return grado;
    }
}

