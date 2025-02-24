package exercicioProgFuncional;

public class Product {
	private String name;
	private String email;
	private double price;
	public Product(){		
	}
	public Product(String name, String email, double price) {
		this.name = name;
		this.email = email;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", email=" + email + ", price=" + price + "]";
	}
	
}
