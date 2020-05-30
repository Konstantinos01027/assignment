package assignment;

public class ProductLines {
	private String productLine = null;
	private String textDescription = null;
	private String htmlDescription = null;
	private String image = null;
	
	
	
	public ProductLines(String productLine, String textDescription, String htmlDescription, String image) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}
	public String getProductLine() {
		return productLine;
	}
	public String getTextDescription() {
		return textDescription;
	}
	public String getHtmlDescription() {
		return htmlDescription;
	}
	public String getImage() {
		return image;
	}

	

}
