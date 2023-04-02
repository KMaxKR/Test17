package Services;

import Exceptions.NameException;
import Exceptions.PriceException;
import entity.ShopDataBase;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
        ShopDataBase product = null;
        private List<ShopDataBase> shopDataBaseList = new ArrayList<>();
        public ShopDataBase addProductToSell(String name,String fullName, String Cpu, String Gpu, double Diagonal, int Ram,int price){
                try {
                        product = new ShopDataBase(name, fullName, Cpu, Gpu, Diagonal, Ram, price);
                        shopDataBaseList.add(product);
                }catch (NameException e){
                        System.out.println(e.getMessage());
                }catch (PriceException e){
                        System.out.println(e.getMessage());
                }catch (Exception e){
                        System.out.println(e.getMessage());
                }
                return product;
        }
        public void getShopList(){
                for (ShopDataBase product: shopDataBaseList) {
                        product.getProduct();
                }
        }
}
