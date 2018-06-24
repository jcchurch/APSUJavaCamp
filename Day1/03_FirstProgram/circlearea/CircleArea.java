package circlearea;

/**
 *
 * @author churchj
 */
public class CircleArea {

    public static void main(String[] args) {
        double diameter = 5;
        double radius = diameter / 2;
        double pi = 3.1415;
        double area = pi * radius * radius;
        System.out.println("The circle area is "
                           + Math.round(area*100)/100.0
                           + " units squared.");
    }
}

