package Vehicle;
public class Car
{
 private int price,capacity;
 private String colour;
 public void setPrice(int p)
  {
    price=p;
  }
 public void setCapacity(int c)
  {
    capacity=c;
  }
 public void setColour(String a)
 {
  colour=a;
}
 
public int getPrice()
{
 return(price);
}
public int getCapacity()
{
 return(capacity);
}
public String getColour()
{
 return(colour);
}
}
