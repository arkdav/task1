package maintask2.first;

import java.util.Scanner;

public class Runner{

    private static boolean isTriangle(int xA,int yA,int xB,int yB,int xC, int yC) {

        if ((xA == xB && yA == yB) || (xB == xC && yB == yC) || (xC == xA && yC == yA)) {
            System.out.println("У вас есть одинаковые точки.");
            return false;
        }
        double lineAB = Math.sqrt(sqr(xA - xB) + sqr(yA - yB));
        double lineBC =  Math.sqrt(sqr(xB - xC) + sqr(yB - yC));
        double lineAC =  Math.sqrt(sqr(xA - xC) + sqr(yA - yC));

        if (lineAB >= lineBC + lineAC || lineBC >= lineAB + lineAC || lineAC>=lineAB+lineBC) {
            System.out.println("Точки лежат на одной прямой.");
            return false;
        }
        return true;
    }

    private static int sqr(int a){
        return a*a;
    }

    private static boolean isRectangularTriangle(int xA,int yA,int xB,int yB,int xC, int yC) {

        return ((xA==xB&&yA==yC)||(xA==xB&&yB==yC)||(xB==xC&&yB==yA)||(xB==xC&&yC==yA)||(xC==xA&&yC==yB)||(xC==xA&&yA==yB));
    }

    public static void main(String[] args) {

           int xA, yA;
           int xB, yB;
           int xC, yC;
           Scanner scan=new Scanner(System.in);
           System.out.println("Введите координаты: ");
           xA = scan.nextInt();
           yA=scan.nextInt();
           xB = scan.nextInt();
           yB=scan.nextInt();
           xC = scan.nextInt();
           yC=scan.nextInt();
           if(isTriangle(xA, yA, xB, yB, xC, yC))
           {
               System.out.println("Треугольник может быть.");
               if(isRectangularTriangle(xA, yA, xB, yB, xC, yC)){
                   System.out.println("Треугольник прямоугольный.");
               }
           }
           else{
               System.out.println("Невозможно.");
           }
    }
}
