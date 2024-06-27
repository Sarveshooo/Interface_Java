interface parent
{
    void marry();

    void career();
}
 abstract class child1 implements parent
{
   public  void marry()
    {

    }

   
}
abstract class child2 extends child1 implements parent
{
    public void career()
    {

    }

}
class client
{
    public static void main(String[] args) {
        
    }

}