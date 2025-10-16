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
}
