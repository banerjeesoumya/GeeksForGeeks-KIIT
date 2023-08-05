public class Criminal extends Person
{
    static int SUCCESS_PERCENTAGE;
    Criminal(String name, String nickname, String expertIn, int yearOfBorn, Item[] items) 
    {
        super(name, nickname, expertIn, yearOfBorn, items);
    }
    
    public void printBioData()
    {
        System.out.println("Criminal person ");
        super.printBioData();
    }
}