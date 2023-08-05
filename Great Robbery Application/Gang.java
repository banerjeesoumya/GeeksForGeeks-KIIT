public class Gang 
{
    Criminal[] criminals = new Criminal[2];
    //int num;
    double sumRobbedValue = 0;
    Item RobItem[] = new Item[1];
    Item BobItem [] = new Item[1];
    
    public Gang (Criminal[] criminals)
    {
        RobItem[0] = new Item("Gun", 1);
        BobItem[0] = new Item("Knife", 2);
        this.criminals[0] = new Criminal("Rob", "R", "Thief", 1955, RobItem);
        this.criminals[1] = new Criminal("Bobby", "B", "Thief", 1954, BobItem);
    }

    public double getSumRobbedValue()
    {
        return sumRobbedValue;
    }

    public void getGangInfo ()
    {
        for (Criminal criminal : criminals)
        {
            criminal.printBioData();
        }
    }

    public boolean isSuccessfulRobbery (int mn, int mx)
    {
        int n;
        int max = mx, min = mn;
        n = min + (int)(Math.random() * ((max - min) + 1));
        Criminal.SUCCESS_PERCENTAGE = Criminal.SUCCESS_PERCENTAGE * criminals.length;
        if (n < Criminal.SUCCESS_PERCENTAGE)
            return true;
        else
            return false;
    }

    public void letsRob (Building[] building, Item[] items)
    {
        int length = building.length;

        if (isSuccessfulRobbery(0, length) == true)
        {
            for (Building bl : building)
            {
                System.out.print("The gang managed to rob the following items from the " + bl.getName() + ":");
            }

            for (Item itm : items)
            {
                sumRobbedValue = sumRobbedValue + itm.getValue();
            }
        }

        else
        {
            for (Building bl : building)
            {
                System.out.print("The gang tried to rob the " + bl.getName() + " but they failed");
            }
        }
    }
}
