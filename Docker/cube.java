import java.util.*;
public class cube{
    public static void obj(int n){
             if(n>0){
                 int cuben =n*n*n;
                 System.out.println("cube Of given Number :"+cuben);
             }
    }
    public  static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    //int n=3;
    cube obj = new cube();
    obj(n);
}}


