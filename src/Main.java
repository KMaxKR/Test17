import Services.ShopService;
public class Main {
    public static void main(String[] args) {
        ShopService service = new ShopService();
        service.addProductToSell("Asus","ROG Zephyrus g14 GA402RJ", "Ryzen 7 6800HS","Rx6700S", 14, 16, 1650);
        service.addProductToSell("Lenovo","Legion 15IMH6", "i5 10500h","RTX 3050", 15.6, 16, 800);
        service.getShopList();
    }
}