import java.util.*;
import java.lang.*; //For support of MATH library

public class Cylinder
{
 
 int r;
 int l;
 String sideC;
public Cylinder(double radius, double height)
{
    this.radius = Math.abs(radius); // Ensure radius is non-negative
    this.height = Math.abs(height); // Ensure height is non-negative
    setAllColors(Color.GRAY); // Initialize with a default color
}
public void setColor(int surfaceIndex, Color color) {
    if (surfaceIndex >= 0 && surfaceIndex < colors.length) {
        this.colors[surfaceIndex] = color;
    } else {
        System.err.println("Error: Invalid surface index: " + surfaceIndex);
    }
}

public void setAllColors(Color color) {
    if (color == null) {
        color = Color.BLACK; // Avoid nulls
    }
    Arrays.fill(this.colors, color);
}

    /**
     * Flips the cylinder upside down by swapping the colors of the top and bottom faces.
     */
    public void flipUpsideDown() {
        // Use a temporary variable to hold the top color
        Color tempTopColor = this.colors[TOP_FACE];
        
        // Set the top color to the bottom color
        this.colors[TOP_FACE] = this.colors[BOTTOM_FACE];
        
        // Set the bottom color to the original top color
        this.colors[BOTTOM_FACE] = tempTopColor;
        
        System.out.println("\n--- Cylinder has been flipped upside down! ---");
    } 
 
public Color getColor(int surfaceIndex) {
    if (surfaceIndex >= 0 && surfaceIndex < colors.length) {
        return colors[surfaceIndex];
    }
    System.err.println("Error: Invalid surface index: " + surfaceIndex);
    return null; // Or throw an exception
}
 public static int surfaceArea()
 {
  if (r==0)
  {
   System.out.println("Its a stick");
   return 0;
  }
  else if (l==0)
  {
   System.out.println("Its a button");
   return 0;
  }
  else
  {
   return 2*Math.pi*r*l;
  }
 }
 public static int volume()
 {
  return 2*Math.pi*r*l;
 }
 public static int totalSA()
 {
  return 2*Math.pi*r*l + 2 * Math.pi*r*r;
 }
 public staic int flatOrNot()
 {
  if (this.r>this.l)
  {
   System.out.println("Cylinder is lying flat");
  }
  else if (this.r==this.l)
  {
   System.out.println("This ain't a cylinder");
  }
  else
  {
   System.out.print("Cylinder is standing");
  }
 }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Radius of Cylinder: ");
    double r = scanner.nextDouble();
    System.out.print("Enter Height of Cylinder: ");
    double l = scanner.nextDouble();

    Cylinder myCylinder = new Cylinder(r, l);
    System.out.println("\n--- Initial Cylinder Created ---");
    System.out.println(myCylinder);

    System.out.println("\n--- Coloring the Cylinder ---");
    myCylinder.setColor(Cylinder.TOP_FACE, Color.RED);
    myCylinder.setColor(Cylinder.BOTTOM_FACE, Color.BLUE);
    System.out.println(myCylinder);

    System.out.println("\n--- Calculations ---");
    System.out.println("Volume           : " + String.format("%.2f", myCylinder.getVolume()));
    System.out.println("Total Surface Area : " + String.format("%.2f", myCylinder.getTotalSurfaceArea()));
    myCylinder.printOrientation();

    scanner.close();
}
}

