package programsCJ;

class Paraconstructor{
	
	int i;
	String str;
	float f;
	
	Paraconstructor(){
		i=10;
		str="India";
		f=99.99f;
	}
		
	Paraconstructor (int i1,String str1,float f1) {
		i=i1;
	    str=str1;
	    f=f1;
	}
	Paraconstructor (int j,String str2) {
        i=j;
        str=str2;
        
	}
	Paraconstructor (int k) {
		i=k;
	}
	public void show() {
		
		System.out.println("\nIntiger Value : " + i);
		
		System.out.println("String Value : " + str);
		
		System.out.println("float Value : " + f);

	}
	
}
public class ParameterisedConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Paraconstructor pc1 =new Paraconstructor (10,"India",100.100f) ;
		pc1.show();
		
		Paraconstructor pc2 =new Paraconstructor(20,"India")  ;
		pc2.show();

		Paraconstructor pc3 =new Paraconstructor(30) ; 
		pc3.show();
		
		Paraconstructor pc4 =new Paraconstructor() ; 
		pc4.show();

	}
		
	}


