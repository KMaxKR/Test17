package entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {
    private List<String> productList = new ArrayList<>();
    public void AllProductList(){
        productList.add("ASUS");
        productList.add("SAMSUNG");
        productList.add("LENOVO");
        productList.add("DELL");
        productList.add("MSI");
        productList.add("APPLE");
        productList.add("ACER");
        productList.add("HP");
    }
    public boolean UserProductNameAcceptance(String userProductName){
        AllProductList();
        boolean cont = productList.contains(userProductName);
        if (cont){
            return true;
        }else {
            return false;
        }
    }

}
