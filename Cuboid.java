class Cuboid
{
  int l;
  int b;
  int h;
  
  public Cuboid(int l, int b, int h)
  {
    this.l = l;
    this.b = b;
    this.h = h;
  }
  public static int surfaceArea()
  {
    return 2*(this.l*this.b + this.l*this.h + this.b*this.h);
  }
  public static void main(Strings[] args)
  {
    Scanner jk = new Scanner(System.in);
    int l = jk.nextInt();
    int b = jk.nextInt();
    int h = jk.nextInt();
  }
  
}
