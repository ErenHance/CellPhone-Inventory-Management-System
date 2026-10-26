import java.util.Scanner;

public class Application 
{
public static void main (String[]args)
{
    Scanner keyboard= new Scanner (System.in);
    String manufact;
    int model;
    double retailPrice;

    System.out.print("Enter manufacturer: ");
    manufact= keyboard.nextLine();

    System.out.print("Enter model: ");
    model= keyboard.nextInt();

    System.out.print("Enter retail price: ");
    retailPrice= keyboard.nextDouble();

    CellPhone e = new CellPhone(manufact, model, retailPrice);

    System.out.println(e.toString());

    keyboard.close();
}
}
