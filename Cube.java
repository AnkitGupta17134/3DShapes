import java.utils.*;
//import java.util.*; //For case of Java 14

public class Cube
{
  int a;
  int[] org;
// MODIFIED: Use the CubeColor enum for type safety and clarity instead of int[].
  CubeColor[] sides;

  public Cube(int a)
  {
    this.a = a;
    this.org = new int[2];
    // MODIFIED: Initialize the array to hold CubeColor objects.
    this.sides = new CubeColor[6];
    // ADDED: Set a default color for all sides on creation.
    java.util.Arrays.fill(this.sides, CubeColor.WHITE);
  }
  public void tArea()
  {
    long sd = this.a * this.a;
    long sd2 = 6*this.a;
    System.out.println("Total Surface area of cube is "+sd2);
  }
  public void colorCheck()
  {
    if (this.sides[0]==1)
    {
      System.out.println("Red");
    }
    else if (this.sides[1]==2)
    {
      System.out.println("Blue");
    }
    else if (this.sides[1]==3)
    {
      System.out.println("Green");
    }
    else
    {
      System.out.println("Rainbow");
    }
  }
  public void colorBlue()
  {
    if (this.sides[0]=="Blue")
    {
      System.out.println("Cube has blue top")
    }
  }
  public void sArea()
  {
    long sd = this.a * this.a;
    System.out.println("Surface area of cube is "+sd);
  }
  public void volume()
  {
    long vol = this.a*this.a*this.a;
  }
  public void displacement(int a, int b)
  {
    double dist = Math.sqrt(Math.pow(a-this.org[0],2) + Math.pow(b-this.org[1],2));
    this.org[0] += a;
    this.org[1] += b;
    System.out.println("System of cube is displaced by this amount "+dist);
  }
    // --- New Flip and Rotate Functions ---

    /**
     * Flips the cube along a specified axis by swapping the colors of the opposite faces.
     * @param axis The axis to flip along (e.g., FlipAxis.VERTICAL).
     */
    public void flip(FlipAxis axis) {
        System.out.println("\n--- Flipping cube along " + axis + " axis ---");
        CubeColor temp;
        switch (axis) {
            case VERTICAL: // Swap top and bottom
                temp = sides[TOP_FACE];
                sides[TOP_FACE] = sides[BOTTOM_FACE];
                sides[BOTTOM_FACE] = temp;
                break;
            case HORIZONTAL_DEPTH: // Swap front and back
                temp = sides[FRONT_FACE];
                sides[FRONT_FACE] = sides[BACK_FACE];
                sides[BACK_FACE] = temp;
                break;
            case HORIZONTAL_WIDTH: // Swap left and right
                temp = sides[LEFT_FACE];
                sides[LEFT_FACE] = sides[RIGHT_FACE];
                sides[RIGHT_FACE] = temp;
                break;
        }
    }

    /**
     * Rotates the cube by a given number of degrees around each axis.
     * @param degreesX Degrees to rotate around the X-axis.
     * @param degreesY Degrees to rotate around the Y-axis.
     * @param degreesZ Degrees to rotate around the Z-axis.
     */
    public void rotate(double degreesX, double degreesY, double degreesZ) {
        this.rotationX = (this.rotationX + degreesX) % 360;
        this.rotationY = (this.rotationY + degreesY) % 360;
        this.rotationZ = (this.rotationZ + degreesZ) % 360;
        System.out.println("\n--- Rotating cube ---");
    }  
// --- CODE TO BE ADDED ---

  /**
   * Constants to make side selection easier and more readable.
   * 0: Top face
   * 1: Bottom face
   * 2: Front face
   * 3: Back face
   * 4: Left face
   * 5: Right face
   */
  public static final int TOP_FACE = 0;
  public static final int BOTTOM_FACE = 1;
  public static final int FRONT_FACE = 2;
  public static final int BACK_FACE = 3;
  public static final int LEFT_FACE = 4;
  public static final int RIGHT_FACE = 5;

  /**
   * Sets the color of a single specified side of the cube using the CubeColor enum.
   *
   * @param sideIndex The index of the side to color (e.g., Cube.TOP_FACE).
   * @param color The CubeColor to apply to the side.
   */
  public void setSideColor(int sideIndex, CubeColor color) {
    if (sideIndex >= 0 && sideIndex < this.sides.length) {
      this.sides[sideIndex] = color;
      System.out.println("Successfully set side " + sideIndex + " to " + color);
    } else {
      System.err.println("Error: Invalid side index '" + sideIndex + "'. Must be between 0 and 5.");
    }
  }

  /**
   * Sets the color of a single specified side of the cube using a string name.
   * This is a convenient helper method that uses your existing selectColorByName function.
   *
   * @param sideIndex The index of the side to color (e.g., Cube.FRONT_FACE).
   * @param colorName The name of the color (e.g., "BLUE", "red").
   */
  public void setSideColorByName(int sideIndex, String colorName) {
    CubeColor colorToSet = selectColorByName(colorName);
    setSideColor(sideIndex, colorToSet);
  }
  
    public enum CubeColor {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        WHITE,
        ORANGE
    }
    /**
     * Selects and returns a random color from the CubeColor enum.
     * This is useful when you want to assign a random color to a cube.
     *
     * @return A random CubeColor value.
     */
    public CubeColor selectRandomColor() {
        // Get all possible values from the CubeColor enum.
        CubeColor[] colors = CubeColor.values();

        // Create a random number generator.
        Random random = new Random();

        // Pick a random index from the array of colors.
        int randomIndex = random.nextInt(colors.length);

        // Return the color at the randomly selected index.
        return colors[randomIndex];
    }

    /**
     * Selects a color by its string name (case-insensitive).
     * If the provided color name is not valid, it prints an error and returns a default color (WHITE).
     *
     * @param colorName The name of the color to select (e.g., "RED", "blue").
     * @return The corresponding CubeColor enum value, or CubeColor.WHITE if the name is invalid.
     */
    public CubeColor selectColorByName(String colorName) {
        try {
            // valueOf() is case-sensitive, so we convert the input string to uppercase first.
            return CubeColor.valueOf(colorName.toUpperCase());
        } catch (IllegalArgumentException e) {
            // This block executes if the colorName does not match any of the enum constants.
            System.err.println("Error: Invalid color name '" + colorName + "'. Defaulting to WHITE.");
            return CubeColor.WHITE;
        }
    }  
  public static void main(Strings[] args)
  {
    Scanner jk = new Scanner(System.in);
    System.out.println("Enter Size of side of Cube");
    int a = jk.nextInt();
    System.out.println("Enter which side will have Blue color");
    int colorB = jk.nextInt();
    # System always at origin intially.
  }

}
