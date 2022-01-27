package generics.curingasdelimitados.principiogetput;

import java.util.ArrayList;
import java.util.List;

public class ProgramCovariancia {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);
        System.out.print(x);
        //list.add(20);  erro de compilacao
    }
}
