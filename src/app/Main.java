package app;

public class Main {

    private static final double CONV_K = 1.60934;

    public static double convMilesToKm(double miles){
        return miles * CONV_K;
    }
    public static void main(String[] args) {
        double mls = 5;
        double kilometers = convMilesToKm(mls);
        System.out.println("This is distance converting app.\nVersion 1.0");
        System.out.printf("The result is: %.3f km.",kilometers);
    }
}
