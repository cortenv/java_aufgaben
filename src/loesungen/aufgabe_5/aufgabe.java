package loesungen.aufgabe_5;

public class aufgabe {

    public static void main(String[] args){
        /*
        FizzBuzz ist eine bekannte Aufgabe im Programmierumfeld.
        Ziel dieser Aufgabe ist es jede Zahl von 1 bis 20 auszugeben.
        Ist die Zahl durch 3 teilbar, gibt dein Programm "Fizz" aus.
        Ist die Zahl durch 5 teilbar, gibt dein Programm "Buzz" aus.
        Somit fallen "Fizz" und "Buzz" bei der 15. Stelle zusammen. Dabei soll "FizzBuzz" ausgegeben werden.
        Verwende das Operationszeichen %, welches den Rest einer Division zurückgibt.


        int test = 15 % 3; //in test würde jetzt 0 stehen.
        int test2 = 5 % 3; //in test2 würde jetzt 2 stehen.
        */

        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

}
