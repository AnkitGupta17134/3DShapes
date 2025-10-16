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

    // --- Rotation Functions ---

    /**
     * Rotates the hemisphere by a given number of degrees around each axis.
     * The rotation is added to its current orientation.
     *
     * @param degreesX Degrees to rotate around the X-axis.
     * @param degreesY Degrees to rotate around the Y-axis.
     * @param degreesZ Degrees to rotate around the Z-axis.
     */
    public void rotate(double degreesX, double degreesY, double degreesZ) {
        this.rotationX = (this.rotationX + degreesX) % 360;
        this.rotationY = (this.rotationY + degreesY) % 360;
        this.rotationZ = (this.rotationZ + degreesZ) % 360;
        System.out.println("\n--- Rotated Hemisphere ---");
        System.out.println("New Orientation: " + getRotationString());
    }
    
    /**
     * Sets the absolute rotation of the hemisphere to the specified degrees.
     *
     * @param degreesX The absolute rotation angle for the X-axis.
     * @param degreesY The absolute rotation angle for the Y-axis.
     * @param degreesZ The absolute rotation angle for the Z-axis.
     */
    public void setRotation(double degreesX, double degreesY, double degreesZ) {
        this.rotationX = degreesX % 360;
        this.rotationY = degreesY % 360;
        this.rotationZ = degreesZ % 360;
        System.out.println("\n--- Set Hemisphere Rotation ---");
        System.out.println("New Orientation: " + getRotationString());
    }
    
    /**
     * Helper method to get the current rotation as a formatted string.
     * @return A string representing the rotation (e.g., "[X: 90.0°, Y: 45.0°, Z: 0.0°]").
     */
    public String getRotationString() {
        return String.format("[X: %.1f°, Y: %.1f°, Z: %.1f°]", rotationX, rotationY, rotationZ);
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
