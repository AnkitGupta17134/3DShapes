import java.util.*;
import java.lang.*;

class Hemisphere
{
 int r;
 
 //Constructor
 public Hemisphere(int r)
 {
  this.r = r;
 }
 //Funtion for Surface area
 public static int sA()
 {
  return 2*Math.pi*r*r;
 }
 
 public static int tsA()
 {
  return 3*Math.pi*r*r;
 }
 
 public static void main(Strings[] args)
 {
//   Taking Input
  Scanner jk = new Scanner(System.in);
  System.out.print("Enter Radius : ");
  int r = jk.nextInt();
  Hemisphere hms = new Hemisphere(r);
  System.out.println("Hemisphere Created");
  System.out.print("Surface Area of Hemisphere");
  hms.sA();
 }
}
