package com.ecommerce;
public class Main1 {
	public class Main {
	    public static void main(String[] args) {
	        Product[] products = {
	            new Product(1, "Laptop", "Electronics"),
	            new Product(2, "Shirt", "Clothing"),
	            new Product(3, "Book", "Education"),
	            new Product(4, "Smartphone", "Electronics"),
	            new Product(5, "Shoes", "Footwear")
	        };

	        String searchTerm = "Smartphone";
	        Product resultLinear = SearchUtil.linearSearch(products, searchTerm);
	        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not Found"));
	        Product resultBinary = SearchUtil.binarySearch(products, searchTerm);
	        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not Found"));
	    }
	}
}
