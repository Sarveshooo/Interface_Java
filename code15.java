interface  macdonalds
{
    default void burger()////////////DEFAULT KEYWORD GIVEN TO PARENT CLASS SO THAT CHILD CLASS CAN OVERRIDE PARENT CLASS METHOD 
    {
        System.out.println("FRANCHISE 3 BUGER ARE BEST ");
    }
    default void fries()
    {
        System.out.println("MACDONALDS FRIES ARE VERY TASTY");
    }
    void revenue();
}



class franchise1 implements macdonalds
{
    public void burger()
    {
        System.out.println("FRANCHISE 1 BURGER ARE GOOD");
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
        System.out.println("FRANCHISE 2 BURGER ARE BETTER ");
    }
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