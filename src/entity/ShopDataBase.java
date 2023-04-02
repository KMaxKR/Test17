package entity;

import Exceptions.*;
import Services.ShopService;

import java.util.List;


public class ShopDataBase {
    ProductList productList = new ProductList();
    private String name;
    private ShopList specs;
    private int price;

    public void setName(String name) {
        if (productList.UserProductNameAcceptance(name.toUpperCase())){
            this.name = name;
        }else{
            throw new NameException("UserProductName is not in our database");
        }
    }

    public void setSpecs(ShopList specs) {
        try {
            this.specs = specs;
        }catch (FullNameException e){
            System.out.println(e.getMessage());
        }catch (CpuException e){
            System.out.println(e.getMessage());
        }catch (GpuException e){
            System.out.println(e.getMessage());
        }catch (DiagonalException e){
            System.out.println(e.getMessage());
        }catch (RamException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public ShopDataBase(String name,String fullName, String Cpu, String Gpu, double Diagonal, int Ram, int price){
        setName(name);
        setSpecs(new ShopList(fullName, Cpu, Gpu, Diagonal, Ram));
        setPrice(price);
    }

    public void setPrice(int price) {
        if(price >= 1){
            this.price = price;
        }else {
            throw new PriceException("Price can not by less than 1");
        }
    }

    public void getProduct(){
            System.out.println(name + "\n" + specs.getProductSpecs() + "\n" + price + "$");
    }

}
