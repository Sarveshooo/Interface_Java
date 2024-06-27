interface  macdonalds
{
    void burger();

    void fries();

    void revenue();
}



class franchise1 implements macdonalds
{
    public void burger()
    {
        System.out.println("FRANCHIDE 1 BURGER");
        
    }

    public void fries()
    {
        System.out.println("FRANCHISE 1 FRIES ");
    }

    public void revenue()
    {
        System.out.println("2 crores ");
    }

}



class franchise2 implements macdonalds
{
    public void burger()
    {
        System.out.println("FRANCHIDE 2 BURGER");
        
    }

    public void fries()
    {
        System.out.println("FRANCHISE 2 FRIES ");
    }
    public void revenue()
    {
        System.out.println("3crores ");
    }
}




class franchise3 implements macdonalds
{
    public void burger()
    {
        System.out.println("FRANCHIDE 3 BURGER");
        
    }

    public void fries()
    {
        System.out.println("FRANCHISE 3 FRIES ");
    }
    public void revenue()
    {
        System.out.println("5crores ");
    }
}



class client
{
    public static void main(String[] args) {
        macdonalds obj1 = new franchise1();
        macdonalds obj2 = new franchise2();
        macdonalds obj3 = new franchise3();


        obj1.burger();
        obj1.fries();
        obj1.revenue();


        obj2.burger();
        obj2.fries();
        obj2.revenue();


        obj3.burger();
        obj3.fries();
        obj3.revenue();
    }

}