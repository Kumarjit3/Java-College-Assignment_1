
class Rectangle
{
   private double width;
   private double length;
   private double area;
   private String colour;

   public void set_width(double width)
   {
      this.width = width;
   }

   public void set_length(double length)
   {
      this.length = length;
   }
  
   public void set_colour(String colour)
   {
      this.colour = colour;
   }
  
   public double get_area()
   {
      this.area = this.width*this.length;
      return this.area;
   }

   public String get_colour()
   {
      return colour;
   }

}

public class Question29
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.set_width(13.33);
        r1.set_length(33.35);
        r1.set_colour("Navy Blue");

        Rectangle r2 = new Rectangle();
        r2.set_width(13.33);
        r2.set_length(33.35);
        r2.set_colour("Navy Blue");

        if(r1.get_area() ==  r2.get_area() && r1.get_colour() == r1.get_colour())
        {
            System.out.print("\nMatching Rectangle\n");
        }
        else
        {
           System.out.print("\nNon-Matching Rectangle\n");
        }

    }
}