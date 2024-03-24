/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
  */
public class ExemploSobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoInt = calculadora.somar(5, 3);
        System.out.println("Soma (int): " + resultadoInt);  // Saída: 8

        double resultadoDouble = calculadora.somar(5.5, 3.5);
        System.out.println("Soma (double): " + resultadoDouble);  // Saída: 9.0

        String resultadoString = calculadora.somar("Hello", " World");
        System.out.println("Concatenacao (String): " + resultadoString);  // Saída: Hello World
    }
}