import java.utils.*;
//import java.util.*; //For case of Java 14

public class Cube
{
  int a;
  int[] org;
  int[] sides;
  public Cube(int a)
  {
    this.a = a;
    this.org = new int[2];
    this.sides = new int[6];
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
