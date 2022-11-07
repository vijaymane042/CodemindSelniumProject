package packagesnew;

public class ThisAndSuper {
	
	//int a=10 ;    //Instance variable = a
	//public void test ( int a ) ; // Local Variable = a
	
	int a = 10 ; //called as  Instance /Object member bcz it not belongs to class but belongs to object 
    public void test () 
    {
    
    }
    
    static int b = 20 ;                // Class member 
    public static void test1()
    {
    
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = ThisAndSuper.b ; 
		ThisAndSuper t = new ThisAndSuper();
		
	    System.out.println(t.a);
		System.out.println(t.b);
		
		ThisAndSuper t1 = new ThisAndSuper();
        int d = t1.a;
        System.out.println(d);
        
        int e = t1.b;
        System.out.println(e);
       
		
		
		
		
		
		
		
	}

}
