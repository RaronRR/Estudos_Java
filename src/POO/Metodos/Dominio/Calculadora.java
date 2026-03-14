package POO.Metodos.Dominio;

public class Calculadora {


    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num01, double num02){
        if (num02 == 0) {
            return 0;
        }
        return  num01 / num02;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumero:");
        System.out.println("Num1"+ num1);
        System.out.println("Num2"+ num2);

    }

    public void somaArray(int[] numero){
        int soma = 0;
        for (int num : numero){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }


}
