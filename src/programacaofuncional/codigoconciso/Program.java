package programacaofuncional.codigoconciso;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(11);

        Integer sum = 0;

        for (Integer x : list) {
            sum += x;
        }

        System.out.println(sum);

        //Programação Funcional
        Integer sum2 = list.stream().reduce(0, Integer::sum);

        System.out.println(sum2);
    }
}



