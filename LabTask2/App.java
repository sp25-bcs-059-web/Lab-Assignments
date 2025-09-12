public class App{
	public static void main(String args[]){

		
		Product p1=new Product();
		System.out.println("Before updation");
		p1.display();
		
		p1.setName("Book");
		p1.setId(1);
		p1.setPrice(500);
		p1.setIsStockAvailable(true);
		
		System.out.println("Using prametrized constructor");
	    Product p2=new Product("Pencil",2,50,false);
		p2.display();
		System.out.println("After updation");
		p2.setId(3);
		p2.setName("Marker");
		
		p2.display();
		
		
	
		
		
	}
}