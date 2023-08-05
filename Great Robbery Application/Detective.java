public class Detective extends Person
{
    static int SUCCESS_PERCENTAGE;
    Detective(String name, String nickname, String expertIn, int yearOfBorn, Item[] items) 
    {
        super(name, nickname, expertIn, yearOfBorn, items);
    }

    public void printBioData ()
    {
        System.out.println("Detective :");
        super.printBioData();
    }
    
}