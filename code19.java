interface demo
{
    static void m1()
    {
        System.out.println("THIS IS SATIC METHOD");
    }
    void m2();
    void m3();

}
class child1 implements demo
{
    public void m1()
    {
        System.out.println("in child 1");
    }
    public void m2()
    {
        System.out.println("in child 1");
    }
    public void m3()
    {
        System.out.println("in child1");
    }
}
class child2 implements demo{
    public void m1()
    {
        System.out.println("in child 2");
    }
    public void m2()
    {
      System.out.println("in child2");
    }
    public void m3()
    {
        System.out.println("in child 2");
    }

}
class client
{
    public static void main(String[] args) {
        demo obj=new child1();
        child2 obj2=new child2();
        demo.m1();
        obj.m2();
        obj.m3();

        demo.m1();
    
        obj2.m2();
        obj2.m3();

    }
}