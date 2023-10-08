package product;

import interfaceArea.productInterface;

public class product implements productInterface {

   protected int productId;
   protected String productName;
   protected double productCategory,  productPrice, productTax,  productDiscount;

    @Override
    public void setProduct(int productId, String productName, double productCategory, double productPrice, double productTax, double productDiscount) {
        this.productId=productId;
        this.productName=productName;
        this.productCategory=productCategory;
        this.productPrice=productPrice;
        this.productTax=productTax;
        this.productDiscount=productDiscount;
    }

    @Override
    public void getProduct() {
        System.out.println("Product ID:"+productId);
        System.out.println("Product Name:"+productName);
        System.out.println("Product Category:"+productCategory);
        System.out.println("Product Price:"+productPrice);
        System.out.println("Product Tax:"+productTax);
        System.out.println("Product Discount:"+productDiscount);
    }
}
