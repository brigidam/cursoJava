package exemplocomparator.expressaolambda.application;

import exemplocomparator.classeanonima.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //Comparator objeto de expressão lambda com chaves
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        /*Comparator objeto de expressão lambda sem chaves
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());*/


        /*Comparator expressão lambda "direto no argumento"
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));*/

        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
