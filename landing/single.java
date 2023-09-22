public class single
{
 int a=10,b=15;
 void sum()
 {
	 System.out.println("the sum is");
 }
}
 class bass extends single
 {
	 void add()
	 {
		 System.out.print("the addition is");
		 
	 }
	 public static void main(String[]args)
	 {
		 bass h=new bass();
         h.sum();
         h.add();
		 
		 
	 }
 }
 
