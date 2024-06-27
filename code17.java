interface  macdonalds
{
    static void burger()//////////////////////////IT IS USED WHEN WE DONT WANR CHILD CLASS TO OVERRRISE THE PARENT CLASS METHOD BURGER WE USE STATIC KEYWORD
    {
        System.out.println("TASTY BUGERS ");
    }
    default void fries()
    {
        System.out.println("MACDONALDS FRIES ARE VERY TASTY");
    }
    void revenue();
}



class franchise1 implements macdonalds
{
    void burger()
    {
        System.out.println("FRANCHISE 1 BURGER ARE TASTY");
    }
    public void revenue()
    {
        System.out.println("2 crores ");
    }

}




class franchise2 implements macdonalds
{
    public void revenue()
    {
        System.out.println("3  crores ");
    }
}



class franchise3 implements macdonalds
{
    public void revenue()
    {
        System.out.println("5  crores ");
    }
}



class client
{
    public static void main(String[] args) {
        macdonalds obj1 = new franchise1();
        macdonalds obj2 = new franchise2();
        macdonalds obj3 = new franchise3();


       macdonalds.burger(); //////obj1.burger();
        obj1.fries();
        obj1.revenue();


        macdonalds.burger();// obj2.burger();
        obj2.fries();
        obj2.revenue();


        macdonalds.burger(); ///////////// obj3.burger();
        obj3.fries();
        obj3.revenue();
    }

}