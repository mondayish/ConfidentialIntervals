package ru.mondayish;

public class Task2 {

    private static final int n = 150;
    private static final double sumX = 1623;
    private static final double sumXX = 17814.36;
    private static final double t = 2.054;

    public static void main(String[] args) {
        double average = sumX / n;
        double o = Math.sqrt(sumXX/n - average*average);
        double left = round(average - t*o/Math.sqrt(n));
        double right = round(average + t*o/Math.sqrt(n));
        System.out.println(left + " < m < " + right);
    }

    private static double round(double x){
        return Math.round(x*1000)/1000.0;
    }
}
