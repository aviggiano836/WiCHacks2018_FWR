import java.util.ArrayList;

public class ExpDateTracker extends ProductDatabase{
	
	 
	static ArrayList<String> donateList = new ArrayList<String>();
	
	public ExpDateTracker(String upc, String expDate, String aName, String aCategory) {
		super(upc, expDate, aName, aCategory);
	}
	
	//should iterate through the list of input category (so that loop doesn't have to be made for each category)
	public static void prodIterator(String prodCategory, int curDay) { 
		Product[] prodList = new Product[5];
		if(prodCategory.equals("Fruit")) 
			prodList = addFruit();
		else if (prodCategory.equals("Vegetables"))
			prodList = VegProd();
		else if (prodCategory.equals("Baked"))
			 prodList = BakedProd();
		else if (prodCategory.equals("Canned"))
			prodList = CannedProd();
		else
			prodList = MeatProd();
		
		for(int i=0; i < prodList.length; i++) {
			String prodName = prodList[i].name;
			String expDate = prodList[i].lotNum;
			boolean expResult = prodChecker(prodList[i], curDay);
			System.out.println(prodName + " " + expDate);
			System.out.println("Is " + prodName + " expiring soon? " + expResult);
			System.out.println();
			if (expResult == true)
				addDonate(prodList[i]);
		}

		
	}
	
	public static boolean prodChecker(Product curProduct, int curDay) {
		int day = Integer.parseInt(curProduct.lotNum.substring(curProduct.lotNum.length()-4 ,curProduct.lotNum.length()-2));
		int warningDay = day - 2;
		if(curDay == warningDay) {
			return true;
		}
		return false;
	} 
	
	public static void addDonate(Product expProd) {
		donateList.add(expProd.name);
	}
	//Main method
		public static void main(String[] args) {
			prodIterator("Fruit", 11);
			prodIterator("Vegetables", 11);
			prodIterator("Baked", 11);
			prodIterator("Canned", 11);
			prodIterator("Meat", 11);
			System.out.println("Things to donate: " + donateList);
			
		}
}
