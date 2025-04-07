package app;


public class Main {

    private static final double CONV_K = 1.60934;

    public static double convMilesToKm(double miles){
        return miles * CONV_K;
    }
    public static double convKmToMiles(double kilometers){
        return kilometers / CONV_K;
    }
    public static void main(String[] args) {
        double mls = 5;
        double km = 3;
        double kilometers = convMilesToKm(mls);
        double miles = convKmToMiles(km);
        System.out.println("This is distance converting app.\nVersion 1.0");
        System.out.printf("The result is: %.3f km and %.3f miles.",kilometers, miles);
    }
}
