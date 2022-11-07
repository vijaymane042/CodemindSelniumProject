package Programs2TM;

public class StringClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt() (//05/09/2022)

		//int i=2;
        System.out.println("CharAt");
        
		String str = "this is first string ";
		System.out.println(str.charAt(3));
		        System.out.println("");

		//Compare To
	    System.out.println("Compare to ");

		String str2 = "this is string";
		System.out.println(str2.compareTo("this is string"));  //By using Ascii value
		System.out.println(str.compareTo("this is string"));
		        System.out.println("");

		
		String str3 = "This is sstring";
		System.out.println(str3.compareTo("This is sstring"));
		System.out.println(str.compareTo (str3));
        System.out.println("");

		//Compare to ignore
        System.out.println("CompareToIgnore");

		
		String str4 = "This is string ";
		System.out.println(str4.compareToIgnoreCase("this is string"));
		        System.out.println("");

		
		//Concat
		        System.out.println("Concat");

		
		String str5 = "This is string";
		System.out.println(str5.concat(" example "));
		        System.out.println("");

		
		//contains (Boolean value)
		        System.out.println("Contains");

		String str6 = "This is string";                
		System.out.println(str6.contains(" is "));               //True
		System.out.println(str6.contains(" is  a "));            //False
		        System.out.println("");


		//Starts with
		        System.out.println("StartsWith");

		String str7 = "This is string";   
		System.out.println(str.startsWith("is"));                //False
		System.out.println(str.startsWith("This"));              // False
		        System.out.println("");

		
		//Ends with
		        System.out.println("EndsWith");

		String str8 = "This is string";
		System.out.println(str8.endsWith("string"));            //True
		System.out.println(str8.endsWith("is"));                //False
        System.out.println("");

		
		
		//(06/09/2022)

		//equals
        System.out.println("equals");

		String str9= "This is string";
		String str10 = "This is string";
        System.out.println(str9.equals(str10));
        
        String str22= "This is string";
		String str23 = "This string ";
        System.out.println(str22.equals(str23));
        System.out.println("");

		
		//equals Ignore case
        System.out.println("equlasIgnore");

		String str11= "This is string11";
		String str12 = "This is string11";
        System.out.println(str11.equalsIgnoreCase(str12));

		//equals Ignore case
		String str24= "This is string24";
		String str25 = "This is string25";
        System.out.println(str24.equalsIgnoreCase(str25));
        System.out.println("");


		//IsEmpty
        System.out.println("Isempty");

        String str13 = " ";
        System.out.println(str13.isEmpty( ));
        System.out.println("");

		
		//Length
        System.out.println("Length");

		String str14="This is string 14";
        System.out.println(str14.length());
        
		String str26="This is string example 14";
        System.out.println(str26.length());
        System.out.println("");
		
		//Replace
        System.out.println("Replace");

		String str15="This is string ";
        System.out.println(str15.replace("is", "Is"));
		System.out.println(str15.replace("string 15", "string 16"));

        
		String str27="Ahis is IAring 107$%^&*";
        System.out.println(str27.replace("A", "T" ));
        System.out.println(str27.replace("IA", "st" ));
		System.out.println(str15.replace("string 15", "string 27"));
        System.out.println("");
		
		//Replace all
        System.out.println("ReplaceAll");

		String str16="This is string ";
		System.out.println(str15.replaceAll("[^i]","").length());
		System.out.println(str15.replaceAll("[i]","").length());
		System.out.println(str15.replaceAll("[^A,E,I,O,U]", "").length());
		System.out.println(str15.replaceAll("[^0-9a-zA-Z ]", ""));
        System.out.println("");


		//Split
        System.out.println("Split");

		String str17="This is string 17";
        String[] arr = str17.split("  ");
		for (String str18:arr)
		{
	    System.out.println(str17);
		}
		
        String[] arr1 = str17.split("  str17  ");
		for (String str18:arr1)
		{
	    System.out.println(str17);
		}
        System.out.println("");

		
		//Substring
        System.out.println("Substring");

        String str19="This is string 19";
        System.out.println(str19.substring(5));
        System.out.println(str19.substring(0,4));
        System.out.println("");

        
        //Trim  Remove starting & ending spaces
        System.out.println("Trim");

        
        String str20 = "             This is a string of 20               ";
        System.out.println(str20.trim());
        String str28 = "             This is         a      string  of                   20          ";
        System.out.println(str28.trim());
        System.out.println("");

        

        // toUpperCase toLowerCase
        System.out.println("Uppercase & Lowercase");

        String str21="This is string";
        System.out.println(str21.toUpperCase());
        System.out.println(str21.toLowerCase());
        System.out.println("");
		
	}

}
