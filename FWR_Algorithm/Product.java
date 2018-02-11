import java.util.*;

public class Product{
	String lotNum;
	String name;
	static String[] categoryList;
	String category;
	
	//Constructor
	public Product(String upc, String expDate, String aName, String aCategory) {
		lotNum = upc + validDate(expDate);
		name = aName;
		category = catValidate(aCategory);
		
	}
	
	//Adds the pre-determined categories to an Array
	public static void storeCategories() {
		categoryList[0] = "Fruit"; 
		categoryList[1] = "Vegetables";
		categoryList[2] = "Baked";
		categoryList[3] = "Canned";
		categoryList[4] = "Meat";
	}
	
	
	
	//Takes in a category, makes sure that it is one of OUR categories. Returns a correct string
	public String catValidate(String catChoice) {
		Scanner scan = new Scanner(System.in);
		categoryList = new String[5];
		storeCategories();
		String catList = convertList(categoryList);
		boolean inList = catList.contains(catChoice);
		while(!inList) {
			System.out.println("Must enter a category from the list: " + catList);
			catChoice = scan.next();
			inList = catList.toLowerCase().contains(catChoice.toLowerCase());
		}
		scan.close();
		return (catChoice);
	}
		
	//Puts the entire category list into a single string
	public String convertList(String[]  aList) {
		String listString = "";
		for(String i : aList)
			listString = listString + " " + i;
		return listString;
	}
	
	//Date input validation
	public String validDate(String date){
		Scanner scan = new Scanner(System.in);
		while(date.length()!= 6) {
			System.out.println("Invalid Date. Enter MMDDYY");
			date = scan.next();
		}
		int month = Integer.parseInt(date.substring(0,2));
		int day = Integer.parseInt(date.substring(2,4));
		int year = Integer.parseInt(date.substring(4,6));
			while(month>12 | month<1) {
				System.out.println("Invalid Month. Enter a number from 1-12");
				month = scan.nextInt();
			}
			while(month==2 && day<1 | day >28){
				System.out.println("Invalid Day. Enter a number from 1-28");
				day = scan.nextInt();
			}
			while((month==1 | month==5 | month==7 | month==8 | month==10 | month==12) && (day<1 | day>31)) {
				System.out.println("Invalid Day. Enter a number from 1-31");
				day = scan.nextInt();
			}
			while((month==3 | month==4 | month==6 | month==9 | month == 11) && (day<1 | day>30)) {
				System.out.println("Invalid Day. Enter a number from 1-30");
				day = scan.nextInt();
			}
			while(year<18 | year>23) {
				System.out.println("Invalid Year. Enter a number from 18-23");
				year = scan.nextInt();
			}
		scan.close();
		return Integer.toString(month) + Integer.toString(day) + Integer.toString(year);	
	}
	
	
	
}

