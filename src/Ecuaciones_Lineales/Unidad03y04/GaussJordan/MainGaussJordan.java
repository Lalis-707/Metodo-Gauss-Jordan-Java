package Ecuaciones_Lineales.Unidad03y04.GaussJordan;

public class MainGaussJordan {

    public static void main(String[] args) {
        double[][] matriz = DefMatriz.obtener();

        System.out.print("\n ^V^  MATRIZ ORIGINAL:  ^V^");
        DefMatriz.imprimirMatriz();

        GaussJordan.resolver(matriz);

        System.out.print("^.^  MATRIZ IDENTIDAD REDUCIDA: ^.^");
        DefMatriz.imprimirMatriz();

        DefMatriz.imprimirResultado();
    }
}
