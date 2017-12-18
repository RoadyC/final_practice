import java.util.Scanner;
/**
 * Write a description of class PersonWithZip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonWithZip
{
    // instance variables - replace the example below with your own
    private int x;
    private String firstName;
    private String lastName;
    private int zipCode;
    /**
     * Constructor for objects of class PersonWithZip
     */
    public PersonWithZip(String f, String l, int zip)
    {
        this.firstName = f ;
        this.lastName = l;
        this.zipCode = zip;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public int getZip()
    {
        return this.zipCode;
    }
    
    public String toString()
    {
        String string = "Name: "+firstName + " " + lastName;
        string += "Zip Code: "+ zipCode;
        
        return string;
    }
    
    public String getName()
    {
        String string = this.firstName + " "+ this.lastName;
        
        return string;
    }
    
    public static void main (String[] args)
    {
        PersonWithZip[] array = new PersonWithZip[3];
        PersonWithZip person1 = new PersonWithZip("Roady","Choi",60563);
        PersonWithZip person2 = new PersonWithZip("Roady","Choi",60563);
        PersonWithZip person3 = new PersonWithZip("Roady","Choi",60563);
        
        Scanner s = new Scanner(System.in);
        
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print("Enter the first name: ");
            String first = s.next();
            System.out.print("Enter the last name: ");
            String last = s.next();
            System.out.print("Enter the zip code: ");
            int zip = s.nextInt();
            
            PersonWithZip person  = new PersonWithZip(first,last,zip);
            array[i] = person;    
        }
        
        for(PersonWithZip person : array)
        {
            person.toString();
        }
        
        int min = 100000;
        String lowestPerson ="";
        System.out.println("The following person has the least numbered zip code");
        for(int i =0 ; i < array.length; i++) 
        {
            int num = array[i].getZip();
            if(num < min)
            {
                min = num;
                lowestPerson = array[i].getName();
            }
        }
        System.out.println("Name: "+lowestPerson+" "+"Zipcode: "+ min);
        
        
    }
}



