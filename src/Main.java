import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;



    public class Main{
        public static void main(String[] args) {
            int a = 5;
            int b = 4;
            int c = 9;

            if (isRightTriangle(a, b, c)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
            }else if (isEquilateralTriangle(a, b, c)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");}

            else if (isIsoscelesTriangle(a, b, c)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
            }

            else if (isValidTriangle(a,b,c)){
                System.out.println(a +","+b+"и"+c + "не являются сторонами треугольника");
            } else  {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
            }
        }

        public static boolean isRightTriangle(int a, int b, int c) {
            return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b);
        }

        public static boolean isIsoscelesTriangle(int a, int b, int c) {
            return (a == b) || (b == c) || (c == a);
        }

        public static boolean isEquilateralTriangle(int a, int b, int c) {
            return (a == b) && (b == c);
        }

        public static boolean isValidTriangle(int a, int b, int c) {
            return (a + b <= c) && (b + c <= a) && (c + a <= b);
        }
    }



