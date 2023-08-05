public class City 
{
    private Building[] building = new Building[4];
    
    public City ()
    {
        Item[] Bank_items = new Item[] {new Item("Letter Opener", 1.5), new Item("Stamp", 2.5)};
        this.building[0] = new Building("Bank", Bank_items);
        
        Item[] Mansion_items = new Item[] {new Item("Pair of fancy shoes", 25), new Item("Broken glass", 0.1)};
        this.building[1] = new Building("Mansion", Mansion_items);

        Item[] PostOffice_items = new Item[] {new Item("Letter to Jenny", 1.5), new Item("Pencil", 2.0)};  
        this.building[2] = new Building("Post Office", PostOffice_items);
        

        Item[] Supermarket_items = new Item[] {new Item("A loaf of Bread", 2.5), new Item("A bag of tea", 6.5)};
        this.building[3] = new Building("Supermarket", Supermarket_items);
    }
    
    public Building[] getBuilding()
    {
        return this.building;
    }
}
