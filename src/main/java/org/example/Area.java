package org.example;

public class Area {
    public int calcularArea(int base, int altura){
        return base*altura;
    }
    public int calcularComp(int base,int altura){
        return base+base+altura+altura;
    }
    public boolean isTriangle(int a,int b, int c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
