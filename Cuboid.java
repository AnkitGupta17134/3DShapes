import java.util.*;
public class Cuboid
{
  int l;
  int b;
  int h;
  String color;

      /**
     * An array to hold the color of each of the 6 sides.
     * The mapping of index to side is as follows:
     * 0: Front face
     * 1: Back face
     * 2: Top face
     * 3: Bottom face
     * 4: Left face
     * 5: Right face
     */
    private Color[] sideColors = new Color[6];

    // --- Constants for side indices for better readability ---
    public static final int FRONT_FACE = 0;
    public static final int BACK_FACE = 1;
    public static final int TOP_FACE = 2;
    public static final int BOTTOM_FACE = 3;
    public static final int LEFT_FACE = 4;
    public static final int RIGHT_FACE = 5;

      /**
     * Sets the color of all six sides of the cuboid to the specified color.
     *
     * @param color The java.awt.Color to apply to all sides.
     */
    public void setColorOfAllSides(Color color) {
        if (color == null) {
            // Avoid null pointer exceptions, use a default instead.
            color = Color.BLACK;
        }
        for (int i = 0; i < sideColors.length; i++) {
            sideColors[i] = color;
        }
    }
    // --- Helper Functions for Color Management ---

    /**
     * Sets the color of a specific side using its index.
     *
     * @param sideIndex The index of the side (e.g., Cuboid.FRONT_FACE).
     * @param color     The color to set for that side.
     */
    public void setSideColor(int sideIndex, Color color) {
        if (sideIndex >= 0 && sideIndex < sideColors.length) {
            sideColors[sideIndex] = color;
        } else {
            System.err.println("Error: Invalid side index: " + sideIndex);
        }
    }

    /**
     * Gets the color of a specific side.
     *
     * @param sideIndex The index of the side.
     * @return The Color of the specified side.
     */
    public Color getSideColor(int sideIndex) {
        if (sideIndex >= 0 && sideIndex < sideColors.length) {
            return sideColors[sideIndex];
        } else {
            System.err.println("Error: Invalid side index: " + sideIndex);
            return null; // Or throw an exception
        }
    }
  public Cuboid(int l, int b, int h)
  {
    this.l = l;
    this.b = b;
    this.h = h;
    this.color = "White";
  }
      /**
     * An enumeration to define the axis for the flip operation.
     */
    public enum FlipAxis {
        /** Flips the cuboid upside down (swaps top and bottom). */
        VERTICAL,
        /** Flips the cuboid front to back. */
        HORIZONTAL_DEPTH,
        /** Flips the cuboid left to right. */
        HORIZONTAL_WIDTH
    }

    /**
     * Flips the cuboid along a specified axis by swapping the colors of the opposite faces.
     *
     * @param axis The axis to flip along (e.g., FlipAxis.VERTICAL).
     */
    public void flip(FlipAxis axis) {
        System.out.println("\n--- Flipping cuboid along " + axis + " axis ---");
        Color temp;
        switch (axis) {
            case VERTICAL: // Swap top and bottom
                temp = sideColors[TOP_FACE];
                sideColors[TOP_FACE] = sideColors[BOTTOM_FACE];
                sideColors[BOTTOM_FACE] = temp;
                break;
            case HORIZONTAL_DEPTH: // Swap front and back
                temp = sideColors[FRONT_FACE];
                sideColors[FRONT_FACE] = sideColors[BACK_FACE];
                sideColors[BACK_FACE] = temp;
                break;
            case HORIZONTAL_WIDTH: // Swap left and right
                temp = sideColors[LEFT_FACE];
                sideColors[LEFT_FACE] = sideColors[RIGHT_FACE];
                sideColors[RIGHT_FACE] = temp;
                break;
        }
    }

    /**
     * Rotates the cuboid by a given number of degrees around each axis.
     *
     * @param degreesX Degrees to rotate around the X-axis.
     * @param degreesY Degrees to rotate around the Y-axis.
     * @param degreesZ Degrees to rotate around the Z-axis.
     */
    public void rotate(double degreesX, double degreesY, double degreesZ) {
        this.rotationX = (this.rotationX + degreesX) % 360;
        this.rotationY = (this.rotationY + degreesY) % 360;
        this.rotationZ = (this.rotationZ + degreesZ) % 360;
        System.out.println("\n--- Rotating cuboid ---");
    }
  public int surfaceArea()
  {
    return 2*(this.l*this.b + this.l*this.h + this.b*this.h);
  }
  public boolean isCuboid()
  {
    if (this.l != this.b != this.h)
    {
      return true
    }
    return false
  }
  public int volume()
  {
    return this.l*this.b*this.h;
  }
  public String getColor()
  {
    return this.color;
  }
  public void setColor(String color)
  {
    this.color = color;
  }
  public static void main(Strings[] args)
  {
    Scanner jk = new Scanner(System.in);
    System.out.print("Input Length of Cuboid ");
    int l = jk.nextInt();
    System.out.println();
    System.out.print("Input Breadth of Cuboid ");
    int b = jk.nextInt();
    System.out.println();
    System.out.print("Input Height of Cuboid ");
    int h = jk.nextInt();
    System.out.println();
    System.out.println("Enter color of cuboid");
    String colr = jk.nextLine();
    System.out.println();
    // Printing Surface Area and Volume
    Cuboid cuba = new Cuboid(2,3,4);
    System.out.println(cuba.surfaceArea());
    System.out.println(cuba.volume());
  }

}
