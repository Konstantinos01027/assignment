package assignment;

public class OrderDetails {
	private int orderNumber = 0;
	private String productCode = null ;
	private int quantityOrdered = 0;
	private double priceEach = 0;
	private int orderLineNumber = 0;
	
	
	
	public OrderDetails(int orderNumber, String productCode, int quantityOrdered, double priceEach,
			int orderLineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public double getPriceEach() {
		return priceEach;
	}
	public int getOrderLineNumber() {
		return orderLineNumber;
	}
	

}
