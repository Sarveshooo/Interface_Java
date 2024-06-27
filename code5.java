interface demo
{
    void show();

    void fun();

}
class client
{
    public static void main(String[] args) {
        demo obj=new demo();
    }
}

/*   demo is abstract; cannot be instantiated
demo obj=new demo();
^   */