package ro.romdev;

public class Main {
    public static void main(String[] args) {
    }

    public static float netPayment(int horulyRate, int numberOfHours) {

        int gross = numberOfHours * horulyRate;

        float net = (float)85/100 * gross;

        return  net;

    }

}
