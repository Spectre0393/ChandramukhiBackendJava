package entities;

import java.util.Date;

public class Sales {
    private int salesId;
    private String productName;
    private int price;
    private int quantity;
    private int total;
    private String sellerName;
    private Date todayDate;

    // setters
    public void setSalesId(int id) {
        this.salesId = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setTodayDate(Date todayDate) {
        this.todayDate = todayDate;
    }
}
