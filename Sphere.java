import java.awt.Color;
import java.util.Scanner;

public class Sphere {
    // --- Fields ---
    private double radius;
    private Color[] colors = new Color[2]; // [0] for top, [1] for bottom

    // --- Constructor ---
    public Sphere(double radius) {
        this.radius = Math.abs(radius); // Use double for precision
        setSingleColor(Color.GRAY); // Set a default uniform color
    }
	public boolean isSphere()
	{
		if (this.r>0)
		{
			return true;
		}
		return false;
	}
	public void eqnSphere()
	{
		String ans = "x^2 + y^2 + z^2 = r^2";
		System.out.println(ans);
	}
public double getArea() {
    return 4 * Math.PI * radius * radius;
}

public double getVolume() {
    // Use 4.0/3.0 to avoid integer division which would result in 1
    return (4.0 / 3.0) * Math.PI * radius * radius * radius;
}

public double getDiameter() {
    return 2 * radius;
}
    // --- Color Management Functions ---

    /**
     * Sets the entire sphere to a single, uniform color.
     * @param color The color to apply.
     */
    public void setSingleColor(Color color) {
        if (color == null) {
            color = Color.BLACK; // Avoid nulls
        }
        this.colors[0] = color;
        this.colors[1] = color;
    }

    /**
     * Sets different colors for the top and bottom hemispheres of the sphere.
     * @param topHemisphereColor The color for the top half.
     * @param bottomHemisphereColor The color for the bottom half.
     */
    public void setTwoColors(Color topHemisphereColor, Color bottomHemisphereColor) {
        this.colors[0] = topHemisphereColor != null ? topHemisphereColor : Color.BLACK;
        this.colors[1] = bottomHemisphereColor != null ? bottomHemisphereColor : Color.BLACK;
    }

    // --- Utility Method ---

    /**
     * Provides a string representation of the Sphere object.
     * @return A descriptive string of the sphere's state.
     */
    @Override
    public String toString() {
        String colorInfo;
        if (colors[0].equals(colors[1])) {
            colorInfo = "\n  Color: " + colors[0];
        } else {
            colorInfo = "\n  Colors: {" +
                        "\n    Top Hemisphere: " + colors[0] +
                        "\n    Bottom Hemisphere: " + colors[1] +
                        "\n  }";
        }
        return "Sphere {" +
               "\n  Radius: " + String.format("%.2f", radius) +
               colorInfo +
               "\n}";
    }
	
}
