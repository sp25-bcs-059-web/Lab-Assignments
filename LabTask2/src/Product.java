class Product{
	String name;
	int id;
	double price;
	boolean isStockAvailable;
	
	public Product(){
	
		this.name="Book";
		this.id=1;
		this.price=250;
		this.isStockAvailable=true;
	}
	public Product(String name,int id,double price,boolean isStockAvailable){
		
		this.name=name;
		this.id=id;
		this.price=price;
		this.isStockAvailable=isStockAvailable;
	}
	
	public void display(){
		System.out.println("Product name: "+name);
		System.out.println("Product id: "+id);
		System.out.println("Product price: "+price);
		System.out.println("Product Stock Availabilty: "+isStockAvailable);
	
	}
	public void setName(String name){
		if (name!=null)
			this.name=name;
	}
	public void setId(int id){
		if (id >0)
			this.id=id;
	}
	public void setPrice(double price){
		if (price >0)
			this.price=price;
	}
	public void setIsStockAvailable(boolean isStockAvailable){

			this.isStockAvailable=isStockAvailable;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public double getPrice(){
		return price;
	}
	public boolean getIsStockAvailable(){
		return isStockAvailable;
	}
	
	
	
}