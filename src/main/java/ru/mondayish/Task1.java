package ru.mondayish;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    private static final List<Integer> data =
            Arrays.asList(154, 152, 146, 161, 148, 153, 159, 160, 154, 146, 150, 155, 161);
    private static final double t = 3.055;

    public static void main(String[] args) {
        double average = data.stream().mapToInt(Integer::intValue).average().orElse(-1);
        double dispersion = data.stream().mapToDouble(x -> x*x).sum()/data.size() - average*average;
        double s = Math.sqrt(data.size() * dispersion / (data.size() - 1));
        double left = round(average - t*s/Math.sqrt(data.size()));
        double right = round(average + t*s/Math.sqrt(data.size()));
        System.out.println(left + " < m < " + right);
    }

    private static double round(double x){
        return Math.round(x*1000)/1000.0;
    }
}
