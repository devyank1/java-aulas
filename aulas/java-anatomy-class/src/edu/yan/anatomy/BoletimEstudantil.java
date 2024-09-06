package edu.yan.anatomy;
public class BoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 8;
        if (mediaFinal < 6)
            System.out.print("Reprovado");
        else if (mediaFinal == 6)
            System.out.print("PROVA MINERVA");
        else if (mediaFinal > 7)
            System.out.print("APROVADO");
    }
}