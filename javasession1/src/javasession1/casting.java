package javasession1;

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=8;
        byte b=(byte)a;//we use Downcasting as direct copying is not possible because of the size difference
        System.out.println("b is:"+b);
        
        int c=b;//upcasting is taken care by the complier
        System.out.println("c is : "+c);
        
        //here size is not concern type is concern
        int d=97;
        char e=(char)d;//this type casting we cannot copy directly because of difference in type
         System.out.println("e is"+e);
	}

}
