package praticando.application;

import praticando.entities.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        System.out.println("SET");
        Set<Produto> produtos = new HashSet<>();

        Produto p1 = (new Produto("TV", 2000.00));
        Produto p2 = (new Produto("Notebook", 5000.00));
        Produto p3 = (new Produto("Video Game", 3000.00));
        Produto p4 = (new Produto("TV", 2000.00));
        Produto p5 = (new Produto("Video Game", 3000.00));

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        System.out.println("Tamanho:" + produtos.size());

        Produto prod = new Produto("Notebook", 5000.0);

        System.out.println(produtos.contains(prod));

        produtos.forEach(System.out::println);


        System.out.println();
        System.out.println("Map");

        Map<Produto, Double> stock = new HashMap<>();

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        stock.put(p4, 5000.00);    //Sobrescreve a chave que já tinha com o novo valor

        Produto ps = new Produto("TV", 2000.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
        System.out.println("Valor da chave TV: " + stock.get(p1));
        System.out.println("Tamanho do Map: " + stock.size());

        System.out.println("ALL STOCK|: ");
        for (Produto key : stock.keySet()) {
            System.out.println(key + ": " + stock.get(key));
        }

        System.out.println();
        System.out.println("Interfaces Funcionais:");

        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 1000.00));
        list.add(new Produto("Mouse", 85.00));
        list.add(new Produto("Notebook", 2500.00));

        System.out.println("PREDICATE"); //retorna um bolean
        list.removeIf(p -> p.getPrice() < 100.0);

        for (Produto p: list) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("FUNCTION - FUNÇÃO MAP");

        List<String> lista = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        lista.forEach(System.out::println);

        System.out.println();
        System.out.println("CONSUMER"); //vai receber um valor generico como parametro e processa, porém não retorna nada

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));   //Expressão lambda inline
        list.forEach(System.out::println);

    }
}
