package Programs2TM;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is string example";
		System.out.println(str.hashCode());         //Hashcode
		
		String str1 = "This is string example";
		System.out.println(str.hashCode());         //Hashcode
		
		String str7 = new String("This is new keyword example");
		System.out.println("This is new keyword example");
		System.out.println(str.hashCode());      //Hashcode
		System.out.println(str7.hashCode());     //Hashcode

		//To uppercase
		
		//String str2 = "This is string example";
		String str2 = str.toUpperCase();
		System.out.println(str2);
		System.out.println(str);

		
		String str3 = "This is string example";
		System.out.println(str3.hashCode());           //Hashcode

		String str4= "This is string example";
		System.out.println(str4.hashCode());        //Hashcode
		System.out.println("############################################");
		

		String str5 = "This is string example";
		String str6 = "This is string example";

	}

}
