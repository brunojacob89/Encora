package br.com.encora;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Coins {

        public static final int pennie = 1;
        public static final int nickel = 5;
        public static final int dimes = 10;
        public static final int quarter = 25;


        public static void main(String[] args) {
            int n = 12;
            makeChange(n).forEach(s -> System.out.println(s));

        }

        public static Set makeChange(int n) {
            int resultPennies = n / pennie;
            int resultNickel = n / nickel;
            int resultDime = n / dimes;
            int resultQuarter = n / quarter;


            Set<List> result = new HashSet<>();
            result.add(Arrays.asList(0, 0, 0, resultPennies));
            result.add(Arrays.asList(0, 0, resultNickel, n - (resultNickel * nickel)));
            result.add(Arrays.asList(0, resultDime, resultNickel-(resultDime*2), n - (resultNickel * nickel)));
            result.add(Arrays.asList(resultQuarter, resultDime -(resultQuarter*2.5), resultNickel-(resultDime*2), n - (resultNickel * nickel)));


            return result;
        }



}
