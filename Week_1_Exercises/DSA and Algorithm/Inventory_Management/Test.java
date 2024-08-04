
public class Test {

	public static void main(String[] args) {

		Product pd1 = new Product(100, "Pencils", 5000, 7);
		Product pd2 = new Product(101, "Pen", 10000, 10);

		Inventory inventory = new Inventory();

		inventory.add(pd1);
		inventory.add(pd2);

		inventory.showInventory();

		inventory.remove(pd2);

		inventory.showInventory();

		Product pd3 = new Product(101, "Cello tape", 120, 25.50);
		inventory.update(pd3);

		inventory.showInventory();

	}

}
