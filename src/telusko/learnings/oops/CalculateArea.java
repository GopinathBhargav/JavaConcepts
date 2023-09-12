package telusko.learnings.oops;

import java.util.Scanner;

class AreaOfRectangle{

     double length, breadth, area;

    public double input(){

        Scanner sc = new Scanner(System.in);
         length = sc.nextDouble();
         breadth = sc.nextDouble();
        System.out.println("Enter length is " + length);
        System.out.println("Enter breadth is " + breadth);

        return length + breadth;

    }
    public double compute(){


        area = length * breadth;
        return area;

    }

    public void display(){

        System.out.println("value of area is " + area);

    }
}

class AreaOfSquare{

    double length, area;

    public double input(){

        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        System.out.println("Enter length for square is " + length);
        return length;

    }
    public double compute(){


        area = length * length;
        return area;

    }

    public void display(){

        System.out.println("value of area for sqaure is " + area);

    }

}

class AreaOfCircle{

    double radius, area;
    final double pi = 2.14;

    public double input(){

        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        System.out.println("Enter radius for circle is " + radius);
        return radius;

    }
    public double compute(){


        area = pi * radius * radius;
        return area;

    }

    public void display(){

        System.out.println("value of area for circle is " + area);

    }
}
public class CalculateArea {

    public static void main(String[] args) {

        AreaOfRectangle rect = new AreaOfRectangle();
        rect.input();
        rect.compute();
        rect.display();

        AreaOfSquare square = new AreaOfSquare();
        square.input();
        square.compute();
        square.display();

        AreaOfCircle circle = new AreaOfCircle();
        circle.input();
        circle.compute();
        circle.display();

    }
}
