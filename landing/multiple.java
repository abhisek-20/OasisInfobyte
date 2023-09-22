interface A
{
    void add();
    

}
interface B
{
    void add();
    
}
class Multiple implements A,B
{
  public void add()
  {
    System.out.println("interface A & B");
  }
  public static void main(String[]args)
  {
    Multiple m=new Multiple();
    m.add();
  }

}
