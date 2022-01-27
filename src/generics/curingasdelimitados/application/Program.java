package generics.curingasdelimitados.application;

import generics.curingasdelimitados.entities.Cicle;
import generics.curingasdelimitados.entities.Rectangle;
import generics.curingasdelimitados.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Cicle(2.0));

        List<Cicle> myCircles = new ArrayList<>();
        myCircles.add(new Cicle(2.0));
        myCircles.add(new Cicle(3.0));


        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
        //list.add(new Rectangle(3.0, 4.0)); não é possível adicionar elementos na lista de tipo curinga delimitado
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
