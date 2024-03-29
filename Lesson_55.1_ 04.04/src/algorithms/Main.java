package algorithms;

public class Main {

    // Алгоритмы, Анализ сложности алгоритмов
    /*
    Алгоритм - это программа, последовательность шагов, которая представляет
    исключительно вычисление и не учитывает особенности реализации "компьютерного железа" на котором она запущена
    Анализ сложности позволяет узнать насколько быстро работает эта программа , когда она совершает вычисления
     */

    public int max ( int[]ints,int n){
        int max = ints[0]; // 2 Aktionen werden hier gemacht

        // еще до запуска цикла происходит его инициализация i=0, i<n  +2 операции
        for(int i = 0;i<n;i++){ //после запуска for  на каждой итерации выполняется еще 2 инструкции: i++ и i<n
            if(ints[i]>max){
                max = ints[i];
            }
        }
        return max;
    }
    // количество инструкций для метода (при этом for c пустым телом) f(n)=4+2n

    //В теории алгоритмов рассмаьриваются наихудшие сценарии, т.е. в нашем случае это означает массив, упорядоченный
    // по возрастанию и перезаписывание max  при каждой итерации.
    //  f(n)= 4 +2n+4n=4+6n

    // когда n  ,большое - константы не важны.. поэтому 4 отбрасываем
    // f(n) = 6n
    //множитель перед n  также отбрасывается
    //  f(n)=n
    // асимптотическое поведение функции f(n) = 4+ 6n описывается функцией f(n)

    // f(n) = 5n +16   f(n)=n
    // f(n)=25*1   f(n) = 1;
    //f(n) = n^2 +4n+236     f(n)=n^2

    public boolean linSearch ( int[]arr, int elementToFind){
        for (int i=0;i < arr.length; i++){
            if (arr[i] == elementToFind )
                return true;
        }
        return false;
    }

    public int sum (int a, int b){
        int res = a+b;

        return res;
    }

    public static void drawTriangle(int n){ // Diese Methode zeichnet einen Dreieck in der Console
        for ( int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //  f(n)=n^2



    public static void main(String[] args) { // Da es keinen Main im Packege gibt, machen wir ein Main genau hier
        // so wird die Methode aufgerufen durch Erzeugung eines Mains mit ***psvm*** dann ***drawTriangle***
        drawTriangle(6);
        int n =100;
        // for(int i=0;i<n;i++){
        //     drawTriangle(6);

        for(int i=0;i<n;i++){}

        for(int i=0;i<n;i++){}

        char theta = '\u03f4';
        System.out.println(theta);
    }
    // ϴ(f(n)
    //ϴ(1) , ϴ(n) , ϴ(n^2)
    //ϴ(1) - алгоритм с константным временем
    //ϴ(n) - линейный алгоритм
    // ϴ(n^2) - квадратичный
    // ϴ(log(n)) - логарифмический

    // O(1) , O(n) , O(n^2)
    //O(1) - алгоритм с константным временем
    //O(n) - линейный алгоритм
    // O(n^2) - квадратичный
    // O(log(n)) - логарифмический

}


