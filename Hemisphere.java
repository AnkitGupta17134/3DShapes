import java.util.*;

class Hemisphere
{
 int r;
 public Hemisphere(int r)
 {
  this.r = r;
 }
 
 
  public static void main (Strings[] args)
  {
   Scanner jk = new Scanner(System.in);
   System.out.print("Enter Radius of Hemisphere : ");
   int r = jk.nextInt();
   Hemisphere hm = new Hemisphere(r);
   System.out.println("Hemisphere Created");
  }
}
