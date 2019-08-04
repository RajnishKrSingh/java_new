package Vehicle;
public class Output
{
 public static void main(String []args)
{
 SportsCar s=new SportsCar();
 s.setPrice(40000);
 s.setCapacity(8);
 s.setColour("Blue");
 s.setFuel("Diesel");
 System.out.println("The price is "+s.getPrice());
 System.out.println("The Capacity is "+s.getCapacity());
 System.out.println("The Colour is "+s.getColour());
 System.out.println("The fuel used is "+s.getFuel());
}
 }
