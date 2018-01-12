package pkgwhile;

public class While {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println("input: " + i);
            i--;
        }
        // Целевая часть цикла может быть пустой
        int c = 100;
        int d = 200;

        // рассчитать среднее значение переменных i и j
        while (c++ < d--) {
            /*у этого цикла отсутствует тело*/
            System.out.println(c);
        }

        int a = 10;
        int b = 20;
        while (a > b) {
            System.out.println("Этa строка выводиться не будет ");
            break;
        }
    }
}
