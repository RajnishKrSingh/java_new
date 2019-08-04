import java.util.*;
public class hotel_management
{
    Scanner sc=new Scanner (System.in);
    int days,room;
    boolean type[];
    String date,name, occp,add,pur,rname;
    int adults,child,no;
    double bill; 
    boolean breakfast;
    public static void main()
    {
        System.out.println("         *    *           *            *        *********    *          *********          ");
        System.out.println("         *    *           *      ***   *            *       *  *            *              ");
        System.out.println("         ******  .****. *****   *   *  *            *      *     *          *              ");
        System.out.println("         *    *  *    *   *     * * *  *            *     * * * * *     *   *              ");
        System.out.println("         *    *  *    *   *   * *      *            *     *       *     *   *              ");
        System.out.println("         *    *  .****.    ***  * ***  * **         *     *       *     * * *              ");
        System.out.println("      :..:::..:.....:::..::.....:..:::..:::..:.....::.....::::.....:::..::.....:.:::::     ");
        System.out.println("      ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::     ");
        System.out.println("      ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::     ");
        System.out.println("");
        hotel_management ob=new hotel_management();
        ob.input();
        ob.roomBook();
        ob.registration();
        ob.billcalc();
    }

    public void input()
    {
        System.out.println("         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^          ");
        System.out.println("                      Apollo Bandra, Colaba, Mumbai, Maharashtra 400001                    ");
        System.out.println();
        System.out.println("Dear customer");
        System.out.println("A warm welcome to our online booking site for the most glorious and prestigious hotel in Mumbai.");
        System.out.println("Built in the year 1903.One of the most beautiful and prestigious hotels in the country");
        System.out.println("At Hotel TAJ, we bring to you absolutely modern living with cultural colaboration in utmost comfort.");
        System.out.println("Admist the fragrance of our glorious heritage");
        System.out.println();
        System.out.println("Be you a native weekend tourist,or be you BAN International tourists coming");
        System.out.println("to witness the wonder of INDIA,be assured that we will take up the");
        System.out.println("responsibility of making your stay a memorable one");
        System.out.println();
        System.out.println("Do you want to book a room in our Grand Hotel");
        System.out.println("Please reply in yes or no");
        if((sc.nextLine()).equalsIgnoreCase("yes"))
        {
            System.out.println();
            System.out.println("Please enter your date of visit,and the number of days you intend to stay");
            System.out.print("Date: ");
            date=sc.nextLine();
            System.out.println("Number of Days: ");
            days=sc.nextInt();
        }
        else
            System.exit(0);
    }
    
    public void roomBook()
    {
        boolean king[]=new boolean[5];
        boolean queen[]=new boolean[5];
        boolean AC[]=new boolean[15];
        boolean Non[]=new boolean[15];
        king=randomFiller(king);
        queen=randomFiller(queen);
        AC=randomFiller(AC);
        Non=randomFiller(Non);
        int f1=0;
        while(f1!=1)
        {   
            System.out.println();
            System.out.println("Plese select the type of room you prefer");
            System.out.println("1.King suit");
            System.out.println("2.Queen suite");
            System.out.println("3.AC deluxe");
            System.out.println("4.Non AC deluxe"); 
            System.out.print("Enter your choice to view:");
            int ch=sc.nextInt();
            boolean tmp;
            switch(ch)
            {
                case 1:tmp=RoomDescript.king();
                if (tmp)
                {
                    type=king;
                    rname="king suite";f1=1;
                }
                break;
                case 2:tmp=RoomDescript.queen();
                if (tmp)
                {
                    type=queen;
                    rname="queen suite";f1=1;
                }
                break;
                case 3:tmp=RoomDescript.AC();
                if (tmp)
                {
                    type=AC;
                    rname="AC deluxe";f1=1;
                }
                break;
                case 4:tmp=RoomDescript.non();
                if (tmp)
                {
                    type=Non;
                    rname="Non Ac deluxe";f1=1;
                }
                break;
                default:
                System.out.println("INPUT IS INVALID!!!PLEASE RE-ENTER YOUR CHOICE.");
                roomBook();
            }
        }
        String bed="double";
        if(rname.equals("AC deluxe")||rname.equals("Non AC deluxe"))
        {
            System.out.println("Single bed or double bed?");
            sc.nextLine();
            bed=sc.nextLine();
        }
        System.out.println("checking rooms for availability.....");
        for(long i=0;i<1;i++)//time consuming loop
        System.out.println("DONE!!");
        int cn;
        System.out.println("rooms available=");
        for(int i=0;i<type.length;i++)
        {
        if(bed.equalsIgnoreCase("single")||bed.equalsIgnoreCase("single bed"))
        {
            if(type[i]==true&&i<=(type.length/2))
            {
                System.out.println("room"+(i+1));
                room =i;
            }
        }
        if(bed.equalsIgnoreCase("double")||bed.equalsIgnoreCase("double bed"))
        {
            if(type[i]==true&&i<=(type.length/2))
            {
                System.out.println("room"+(i+1));
                room =i;
            }
        }
    }
    System.out.println ("We have assigned room "+(room +1)+"for you") ;
    System.out.println("Let us now proceed towards to the registration");
}
public boolean[]randomFiller(boolean A[])
{
for(int i=0;i<A.length;i++)
{
int rand=(int)(Math.random()+0.5);
if(rand==1)
A[i]=true;
else if(rand==1)
A[i]=false;
}
return A;
}
void registration()
{
System.out.println();
System.out.println("____________________________________________________________");
System.out.println(" REGISTRATION ");
System.out.println(" ``````````````");
System.out.println("_____________________________________________________________");
System.out.println("             ");
System.out.print("Name: ");
name=sc.nextLine();
System.out.print("Residential address: ");
add=sc.nextLine();
System.out.print("Occupaion:");
occp=sc.nextLine();
System.out.print("Purpose of visit: ");
pur=sc.nextLine();
System.out.print("Number of rooms booked:");
no=sc.nextInt();
System.out.print("Total number of adults:");
adults=sc.nextInt();
System.out.print("Total number of childrens(below 18): ");
child=sc.nextInt();
System.out.println("THANK YOY");
System.out.println("Do you wish to have complementary breakfast(yes/no))");
sc.nextLine();
String bk=sc.nextLine();
breakfast=bk.equalsIgnoreCase("yes");
}
public void billcalc()
{
int rate=0;
if(rname.equals("king suite"))
rate=8000;
else if(rname.equals("queen suite"))
rate=5000;
else if(rname.equals("AC deluxe"))
rate=3000;
else if(rname.equals("non AC deluxe"))
rate=2500;
int add=0,rent=rate*days;
if(adults>(no*2))
add=200*days;
if(child>(no))
add+=100*days;
if(breakfast)
{
add+=days*(adults+child)*200;
}
int gross=rent+add;
display(gross);
}
void display(int n)
{
System.out.println();
System.out.println("                 ");
System.out.println("    ____            ");
System.out.println("     ~___)  *  ~  ~  ");
System.out.println("     ~___)  ~  ~__~__");
System.out.println();
System.out.println("Room type:"+rname);
System.out.println("Room number:"+room);
System.out.println("Customer name:"+name);
System.out.println("Total number of people:"+(adults+child));
System.out.println("Date of check-in:"+date);
System.out.println("Days stayed:"+days);
System.out.println();
System.out.println("Gross amount:"+n);
double servtax=(5.0/100)*n;
double vat=(14.5/100)*(servtax+n);
bill=servtax+vat+n;
System.out.println("Taxes:"+vat);
System.out.println("Net amount:"+bill);
System.out.println();
System.out.println("Please enter mode of payement");
String mode=sc.nextLine();
System.out.println("THANKYOU!!!!");
}
}
class RoomDescript
{
    /**
     * will contain the description of the room.When the user inputs his choice , a description will be available,
     *which will be accesible through this class.
     */
    static Scanner sc=new Scanner(System.in);
    static boolean king()
    {
        boolean a=false;
        System.out.println("king suite");
        System.out.println("");
        System.out.println("The king suite is for the best of our guests.With world class");
        System.out.println("features,and excellent room decor,this suite is nothing short of");
        System.out.println("perfection,which is desired by many.The room is spacy, and the");
        System.out.println("cosiness of it makes one feel at home,albeit  more comfortable and");
        System.out.println("more exquisite one.We assure you,that if this shall be your choice ,you");
        System.out.println("shall regret the day of departure.");
        System.out.println("");
        System.out.println("features");
        System.out.println("^^^^^^^^^");
        System.out.println("");
        System.out.println(">350x200ft. room, large, spacy and comfortable");
        System.out.println("matress, for a good night's sleep.");
        System.out.println(">air conditioned , with two split A/Cs");
        System.out.println(">42 inch LG smart TV");
        System.out.println("> two large sofas,a bedside table, and a coffee table");
        System.out.println(">a long balcony,with a stunning view of the juche tower,as well as the");
        System.out.println("rest of Mumbai");
        System.out.println(">a mini bar,with an assortment of finest elixirs of India");
        System.out.println(">a huge bathroom , fit for a king");
        System.out.println("");
        System.out.println("the cost of thus room (exclusive of taxes) is=rs. 8000/day");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Do you want to choose this type?");
        System.out.println("Enter 'yes'to book or'no' to go back to the menu:");
        if(sc.nextLine().equalsIgnoreCase("yes"))
        a=true;
        System.out.println("");
        return a;
    }
    static boolean queen()
    {
        boolean a=false;
        System.out.println("QUEEN SUITE");
        System.out.println("");
        System.out.println("The queen suite has an extra touch of comfort.the features available");
        System.out.println("are generally associated with cosy lifestyle.The rooms are such made");
        System.out.println("that we assure you that you shall have no problem in blending in with");
        System.out.println("the feel of it.The atmosphere created by this room is calm and");
        System.out.println("peaceful one,in contrast to the loudness of the king suite.Iif a quite ");
        System.out.println("stay is hat you desire,we take pleasure in welcoming you to the");
        System.out.println("grandeur of this room");
        System.out.println("");
        System.out.println("features");
        System.out.println("^^^^^^^^^");
        System.out.println("");
         System.out.println(">350x200ft. room, cosy with a home-made feel");
        System.out.println("a perfectly home-like double bed,with a plush kamarov-protocol.");
        System.out.println("custom made matress");
         System.out.println(">air conditioned , with a split A/C and a bedside A/C");
          System.out.println(">42 inch LG smart TV");
        System.out.println("> two large sofas,two bedside tables.");
        System.out.println(">a round balcony,with a spectacular view of Mumbai ");
        System.out.println(">a wine conter,with an vintage wine of India");
        System.out.println(">a cosy, marble-and-graphite bathroom .");
        System.out.println("");
        System.out.println("the cost of thus room (exclusive of taxes) is=rs. 5000/day");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Do you want to choose this type?");
        System.out.println("Enter 'yes'to book or'no' to go back to the menu:");
        if(sc.nextLine().equalsIgnoreCase("yes"))
        a=true;
        System.out.println("");
        return a;
    }
    static boolean AC()
    {
        boolean a=false;
     System.out.println("A/C deluxe");   
      System.out.println("");
       System.out.println("The A/C deluxe is the standard room for our hotel. With an affordable");
        System.out.println("price,and an unbelieveabe comfort,the room will exceed your");
         System.out.println("expectations.The ambience is a very tourists friendly one,and the room ");
          System.out.println("will surely make your stay at Hotel Taj,a memorable one");
           System.out.println("");
    System.out.println("features");
        System.out.println("^^^^^^^^^");
        System.out.println("");
         System.out.println(">200x150 ft. room, fully air conditioned");
        System.out.println(">choice of single or doulble bed,wth soft,comfortable matress.");
          System.out.println(">32 inch LG LED TV");
        System.out.println("> One large sofas,one bedside tables,one centre table.");
        System.out.println(">a  balcony,with a spectacular view of Mumbai ");
        System.out.println(">a well furnished bathroom.");
        System.out.println("");
        System.out.println("the cost of thus room (exclusive of taxes) is=rs.3000/day");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("do you want to choose this type?");
        System.out.println("enter 'yes'to book or'no' to go back to the menu:");
        if(sc.nextLine().equalsIgnoreCase("yes"))
        a=true;
        System.out.println("");
        return a;
    }       
      static boolean non()
    {
        boolean a=false;
     System.out.println(" Non-A/C deluxe");   
      System.out.println("");
       System.out.println("Dont like canned air?Feeling natural?Don't worry!!Hotel TAJ");
        System.out.println("offers you with a spcial non A/C deluxe suite with open windows to enjoy");
         System.out.println("the scenic beauty of India.The air here is as fresh as it can be,and the ");
          System.out.println("natural way of life will surely make you feel like a part of India.");
           System.out.println("");
    System.out.println("features");
        System.out.println("^^^^^^^^^");
        System.out.println("");
         System.out.println(">150x150 ft. room.");
         System.out.println("four large open-able windows");
        System.out.println(">choice of single or doulble bed,wth soft,comfortable matress.");
          System.out.println(">32 inch LG LED TV");
        System.out.println("> One large sofas,one bedside tables,one centre table.");
        System.out.println(">a  balcony,with a spectacular view of Mumbai ");
        System.out.println(">a well furnished bathroom.");
        System.out.println("");
        System.out.println("the cost of thus room (exclusive of taxes) is=rs.2500/day");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("do you want to choose this type?");
        System.out.println("enter 'yes'to book or'no' to go back to the menu:");
        if(sc.nextLine().equalsIgnoreCase("yes"))
        a=true;
        System.out.println("");
        return a;
    }
    } 
   
    
    
        

        
