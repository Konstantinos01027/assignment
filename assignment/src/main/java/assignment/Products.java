package assignment;

public class Products {
	private String productCode = null ; 
	private String productName = null;
	private String productScale = null;
	private String productVendor = null;
	private String productDescription = null;
	private int quantityInStock = 0;
	private double buyPrice = 0;
	private double MSRP = 0;
	private String productLine = null;
	
	
	public Products(String productCode, String productName, String productScale, String productVendor,
			String productDescription, int quantityInStock, double buyPrice, double mSRP, String productLine) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.MSRP = mSRP;
		this.productLine = productLine;
	}
	public String getProductCode() {
		return productCode;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductScale() {
		return productScale;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public double getMSRP() {
		return MSRP;
	}
	public String getProductLine() {
		return productLine;
	}
}
