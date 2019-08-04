import java.applet.Applet;
import java.awt.*;
/* <applet code="MyApplet2" width="300" height="220"> <param name="Site" value="www.reydelanoche.com"/> </applet> */
public class MyApplet2 extends Applet
 {
  private String defaultMessage="Hello India!";
  
  public void paint(Graphics g)
   { 
    String s=getParameter("Site");
    if(s==null)
    s=defaultMessage;
   g.drawString(s,100,50);
   }
}
  