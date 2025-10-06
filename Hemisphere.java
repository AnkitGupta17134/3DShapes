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

// --- Color Management Functions ---
public void setColor(int surfaceIndex, java.awt.Color color) {
    if (surfaceIndex >= 0 && surfaceIndex < colors.length) {
        this.colors[surfaceIndex] = color;
    } else {
        System.err.println("Error: Invalid surface index: " + surfaceIndex);
    }
}

public void setAllColors(java.awt.Color color) {
    if (color == null) {
        color = java.awt.Color.BLACK;
    }
    java.util.Arrays.fill(this.colors, color);
}

// --- Utility Method ---
@Override
public String toString() {
    return "Hemisphere {" +
            "\n  Radius: " + String.format("%.2f", radius) +
            "\n  Colors: {" +
            "\n    Dome Surface: " + colors[DOME] +
            "\n    Base Surface: " + colors[BASE] +
            "\n  }" +
            "\n}";
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
  System.out.println("\n--- Coloring the Hemisphere ---");  
  myHemisphere.setColor(Hemisphere.DOME, java.awt.Color.MAGENTA);
  System.out.println(myHemisphere);
 }
}
