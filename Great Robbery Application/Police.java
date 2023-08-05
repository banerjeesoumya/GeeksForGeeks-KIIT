public class Police 
{
    Detective detectives [] = new Detective[1];    
    Item Adam [] = new Item[1];

    public Police (Detective[] detectives)
    {
        Adam[0] = new Item("Pistol", 1);
        this.detectives [0] = new Detective("Adam Palmer", "Adam", "Detective", 1944, Adam);
    }

    public boolean areCriminalsCaught ()
    {
        int n;
        int max = 100, min = 0;
        n = min + (int)(Math.random() * ((max - min) + 1));
        Detective.SUCCESS_PERCENTAGE = Detective.SUCCESS_PERCENTAGE + detectives.length;
        if (n < Detective.SUCCESS_PERCENTAGE)
            return true;
        else
            return false;
    }

    public boolean catchCriminals(Gang [] gangs)
    {
        if ((areCriminalsCaught()) == true)
        {
            for (Detective dt : detectives)
            {
                System.out.println(dt.getName() + "managed to catch the gang");
            }

            for (Gang gg : gangs)
            {
                if (gg.sumRobbedValue > 0)
                {
                    System.out.println("The stolen items are recovered. Their overall value is estimated to be $" + gg.sumRobbedValue);
                }
                else
                {
                    System.out.println("The gang couldn't steal anything");
                }
            }
            return true;
        }
        else
        {
            for (Detective dt : detectives)
            {
                System.out.println (dt.getName() + " managed to catch the gang");
            }
            
            for (Gang gg : gangs) 
            {
                System.out.println("They managed to steal items valued $" + gg.sumRobbedValue);    
            }
            return false;
        }
    }
    
}
