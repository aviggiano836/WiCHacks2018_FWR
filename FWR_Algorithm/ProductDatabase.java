
public class ProductDatabase extends Product{
	static Product[] FruitProd = new Product[5];
	static Product[] Vegetables = new Product[5];
	static Product[] Baked = new Product[5];
	static Product[] Canned = new Product[5];
	static Product[] Meat = new Product[5];
	
	public ProductDatabase(String upc, String expDate, String aName, String aCategory) {
		super(upc, expDate, aName, aCategory);
	}

	public static Product[] addFruit() {
		Product Apples = new Product("00", "031118", "Apples", "Fruit"); //4 weeks
		Product Bananas = new Product("01", "021318", "Bananas", "Fruit"); // 1 week "EXP Soon"
		Product Pears = new Product("02", "022218", "Pears", "Fruit"); //12 days
		Product Oranges = new Product("03", "030418", "Oranges", "Fruit"); //3 weeks
		Product Pineapples = new Product("04", "021618", "Pineapples", "Fruit"); //5 days

		FruitProd[0] = Apples;
		FruitProd[1] = Bananas;
		FruitProd[2] = Pears;
		FruitProd[3] = Oranges;
		FruitProd[4] = Pineapples;
		
		return FruitProd;
	}
	
	public static Product[] VegProd() {
		Product Broccoli = new Product("10", "022518", "Broccoli", "Vegetables"); //2 weeks
		Product Carrots = new Product("11", "032518", "Carrots", "Vegetables"); //5 weeks
		Product Spinach = new Product("12", "021318", "Spinach", "Vegetables"); //1 week "EXP soon"
		Product Corn = new Product("13", "021318", "Corn", "Vegetables"); //1 week "EXP Soon"
		Product Potatoes = new Product("14", "032518", "Potatoes", "Vegetables"); //5 weeks

		Vegetables[0] = Broccoli;
		Vegetables[1] = Carrots;
		Vegetables[2] = Spinach;
		Vegetables[3] = Corn;
		Vegetables[4] = Potatoes;
		return Vegetables;
	}
	
	public static Product[] BakedProd() {
		Product Bread = new Product("20", "021418", "Bread", "Baked"); //3 days
		Product Bagels = new Product("21", "021318", "Bagels", "Baked"); //3 days "EXP Soon"
		Product Muffins = new Product("22", "022518", "Muffins", "Baked"); //2 days
		Product Biscuits = new Product("23", "022518", "Biscuits", "Baked"); //2 weeks
		Product Crackers = new Product("24", "092518", "Crackers", "Baked"); //8 months

		Baked[0] = Bread;
		Baked[1] = Bagels;
		Baked[2] = Muffins;
		Baked[3] = Biscuits;
		Baked[4] = Crackers;
		return Baked;
	}
	
	public static Product[] CannedProd() {
		Product Beans = new Product("30", "022523", "Canned Beans", "Canned"); //6 years
		Product Soup = new Product("31", "022523", "Canned Soup", "Canned"); //7 years
		Product Pasta = new Product("32", "022523", "Canned Pasta", "Canned"); //5 years
		Product Peaches = new Product("33", "021318", "Canned Peaches", "Canned"); //4 years "EXP Soon"
		Product Tuna = new Product("34", "022523", "Canned Tuna", "Canned"); //5 years

		
		Canned[0] = Beans;
		Canned[1] = Soup;
		Canned[2] = Pasta;
		Canned[3] = Peaches;
		Canned[4] = Tuna;
		return Canned;
	}
	
	public static Product[] MeatProd() {
		Product Chicken = new Product("40", "021318", "Chicken", "Meat"); //1 week "EXP Soon"
		Product Fish = new Product("41", "021718", "Fish", "Meat"); // 6 days
		Product Beef = new Product("42", "022018", "Beef", "Meat"); //9 days
		Product Pork = new Product("43", "021318", "Pork", "Meat"); //4 days "EXP Soon"
		Product Turkey = new Product("44", "021318", "Turkey", "Meat"); //1 week "EXP Soon"


		Meat[0] = Chicken;
		Meat[1] = Fish;
		Meat[2] = Beef;
		Meat[3] = Pork;
		Meat[4] = Turkey;
		return Meat;
	}
	
}
