/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package clases.calculadora;

public class Calculadora {

    private float numero_1;
    private float numero_2;

    public Calculadora(float numero_1, float numero_2) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
    }
    public float getNumero_1() {
        return numero_1;
    }
    public void setNumero_1(float numero_1) {
        this.numero_1 = numero_1;
    }
    //
    public void setNumero_2(float numero_2) {
        this.numero_2 = numero_2;
    }
    public float getNumero_2() {
        return numero_2;
    }
    
    public float sumar(){
       return this.numero_1 + this.numero_2;
    }
    public float restar(){
       return this.numero_1 - this.numero_2;
    }
    public float multiplicar(){
       return this.numero_1 * this.numero_2;
    }
    public float dividir(){
       return this.numero_1 / this.numero_2;
    }
    
}
