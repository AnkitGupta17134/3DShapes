import java.util.*;
class Cuboid
{
  int l;
  int b;
  int h;
  int x0;
  int y0;
  public Cuboid(int l, int b, int h)
  {
    this.l = l;
    this.b = b;
    this.h = h;
    this.x0 = 0;
    this.y0 = 0;
  }
  public static int surfaceArea()
  {
    return 2*(this.l*this.b + this.l*this.h + this.b*this.h);
  }
  public static int volume()
  {
    return this.l*this.b*this.h;
  }
  public static moveXY(int x, int y)
  {
    this.x0 += x;
    this.y0 += y;
  }
  public static void main(Strings[] args)
  {
    Scanner jk = new Scanner(System.in);
    int l = jk.nextInt();
    int b = jk.nextInt();
    int h = jk.nextInt();
  }
  
}
