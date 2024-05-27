package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 6);
        int b = calc.minus.apply(5, 1);
        int c = calc.devide.apply(a, b); // В методе Calculator исправила функцию деления на 0, т.к. именно там может возникнуть ошибка

        /*calc.println.accept(a);
        calc.println.accept(b);*/
        calc.println.accept(c);
    }
}
