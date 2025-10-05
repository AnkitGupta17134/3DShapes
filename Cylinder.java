import java.util.*;
import java.lang.*; //For support of MATH library

public class Cylinder
{
 
 int r;
 int l;
 String sideC;
 public Cylinder(int r, int l, String sideC)
 {
  this.r = r;
  this.l = l;
  this.sideC = sideC;
 }
 public void setColour(String color)
 {
  this.sideC = color;
 }
 public String getColor(String color)
 {
  return this.sideC;
 }
public double getVolume() {
    return Math.PI * radius * radius * height;
}

public double getLateralSurfaceArea() {
    return 2 * Math.PI * radius * height;
}

public double getTotalSurfaceArea() {
    return getLateralSurfaceArea() + (2 * getTopBottomArea());
}
public void printOrientation() {
    double diameter = 2 * this.radius;
    if (this.height > diameter) {
        System.out.println("Orientation: Cylinder is standing upright.");
    } else if (diameter > this.height) {
        System.out.println("Orientation: Cylinder is lying flat.");
    } else {
        System.out.println("Orientation: Cylinder height is equal to its diameter.");
    }
}
 public static void main(Strings[] args)
 {
   Scanner jk = new Scanner(System.in);
   System.out.print("Enter Radius of Cylinder");
   int r = jk.nextInt();
   System.out.print("Enter Length of Cylinder");
   int l = jk.nextInt();
   Cylinder cyc = new Cylinder(r,l);
   System.out.println("Enter color of Cylinder");
   String color = jk.nextLine();
   System.out.println("Surface Area "+cyc.surfaceArea());
   System.out.println("Total Surface Area "+cyc.totalSA());
   System.out.println("Volume of Cylinder "+cyc.volume());
 }
}

