package ro.romdev;

public class Main {

    public static void main(String[] args) {

    }

    public static int myFunction(int x) {
        System.out.println(x);
        int rez = -1;
        if (x > 10 && x < 15) {
            rez = 1;
        }else if(x > 100 && x % 5 == 0){
            rez = 10;
        }else if(x > 15 && x % 2 == 0){
            rez = 2;
        }else if (x < 0){
            rez = 0;
        }else {

            rez = 3;
        }


        System.out.println(rez);
        return rez;
    }
}
