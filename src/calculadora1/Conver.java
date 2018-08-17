/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

/**
 *
 * @author davidvargas
 */
public class Conver {

    float grado = 0;
    float a = 0;

    float fahrent_cels() {

        float gradcel =  (float) (grado * 1.8000 +32);
        return gradcel;
    }

    float cels_fahrent() {
        float gradfah = (float) (grado -32/1.8000);
        return gradfah;
    }

    float centimetros_metro() {
        float metro = (float) (a / 100.00);
        return metro;
    }

    float centimetros_kilometro() {
        float kilometro = a / 100000;
        return kilometro;
    }

    float metro_centimetro() {
        float centimetro = a * 100;
        return centimetro;

    }

    float metro_kilometro() {
        float kilometro = a / 1000;
        return kilometro;
    }

    float kilometro_metro() {
        float metro = a * 1000;
        return metro;
    }

    float kilmetro_centimetro() {
        float centimetro = (float) (a /0.000010000);
        return centimetro;
    }

    float kilogramo_libra() {
        float libra = (float) (a * 2.2046);
        return libra;
    }

    float kilogramo_gramo() {
        float gramo = (float) (a * 1000 / 1.0);
        return gramo;
    }

    float libra_gramo() {
        float gramo = (float) (a / 0.0022046);
        return gramo;
    }

    float libra_kilogramo() {
        float kilogramo = (float) (a / 2.2046);
        return kilogramo;
    }

    float gramo_kilogramo() {
        float kilogramo = (float) (a / 1000.0);
        return kilogramo;
    }

    float gramo_libra() {
        float libra = (float) (a * 0.0022046);
        return libra;
    }

}
