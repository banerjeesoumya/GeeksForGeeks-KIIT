import java.util.Scanner;
public abstract class Person 
{
    Scanner sc = new Scanner(System.in);
    private String name, nickname, expertIn;
    private int yearOfBorn;
    Item[] items;
    
    //Definng constructor

    Person (String name, String nickname, String expertIn, int yearOfBorn, Item[] items)
    {
        this.name = name;
        this.nickname = nickname;
        this.expertIn = expertIn;
        this.yearOfBorn = yearOfBorn;
        this.items = items;
    }

    public void printBioData ()
    {
        System.out.println("Name : " + name);
        System.out.println("Nickname : " + nickname);
        System.out.println("Date of Birth : " + yearOfBorn);
        System.out.println("Expertise : " + expertIn);
        for (Item item : items)
        {
            System.out.println("," + item.getName());
        }
    }
    
    public String getName ()
    {
        //System.out.println("Enter the name of the person");
        //name = sc.nextLine();
        return name;
    }

    public String getNickname ()
    {
        //System.out.println("Enter the nickname of the person");
        //nickname = sc.nextLine();
        return nickname;
    }
}

