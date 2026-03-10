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

}
