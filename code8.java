interface  parent
{
    void career();
    void marry();
}
class child implements parent
{
    void marry()
    {
        System.out.println("LOVE MARRIAGE");
    }
    void career()
    {
        System.out.println("BUSNINESSMAN");
    }

}
class client
{
    public static void main(String[] args) {
        
    }

}
/* javac code8.java 
code8.java:8: error: marry() in child cannot implement marry() in parent
void marry()
     ^
attempting to assign weaker access privileges; was public
code8.java:12: error: career() in child cannot implement career() in parent
void career()
     ^
attempting to assign weaker access privileges; was public
2 errors
PS C:\Users\sarvesh sakpal\Desktop\interface> 
*/