package com.campusdual.classroom;

public class Exercise {

    public static void main(String[] args) {
        whileLoop(10);
    }

    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        int x = 0;
        while (x < num) {
            System.out.println(x + " < " + num + ". El proximo ciclo valdra: " + (x + 1));
            x++;
        }
    }




    }
