/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import generico.Boton;
import generico.EntradaTextoAdapter;
import generico.Ventana;
import logica.Cliente;

/**
 *
 * @author SAUL
 */
public class Prueba extends Ventana {

    Boton sumaBtn;
    Boton restaBtn;
    Boton multiplicaBtn;
    Boton divideBtn;
    Boton igualBtn;

    EntradaTextoAdapter inOp;
    EntradaTextoAdapter inOp1;
    String x;

    Boton[] numeros;

    @Override
    public void loopAction() {
        System.out.println("lol");
    }

    public Prueba() {
        x = "nel";

        numeros = new Boton[10];

        inOp1 = new EntradaTextoAdapter(10, 10, 20, 100, this);

        for (int i = 0; i < 10; i++) {
            numeros[i] = new Boton(String.valueOf(i), 20 + (i * 60), 40, this) {
                @Override
                public void action() {
                    inOp.setText(inOp.getText() + this.getText());
                }
            };
        }
        inOp = new EntradaTextoAdapter(10, 200, 20, 100, this);

        for (int i = 0; i < 10; i++) {
            numeros[i] = new Boton(String.valueOf(i), 20 + (i * 60), 40, this) {
                @Override
                public void action() {
                    inOp.setText(inOp.getText() + this.getText());
                }
            };
        }

        sumaBtn = new Boton("+", 20, 100, this) {
            @Override
            public void action() {
                x = "suma";
            }
        };

        restaBtn = new Boton("-", 60, 100, this) {
            @Override
            public void action() {
                x = "resta";
            }
        };

        multiplicaBtn = new Boton("*", 100, 100, this) {
            @Override
            public void action() {
                x = "multiplica";
            }
        };

        divideBtn = new Boton("/", 140, 100, this) {
            @Override
            public void action() {
                x = "divide";
            }
        };

        igualBtn = new Boton("=", 200, 100, this) {
            @Override
            public void action() {

                System.out.println(new Cliente().run(x + "/" + inOp.getText() + "/" + inOp1.getText()));
            }
        };
    }

}
