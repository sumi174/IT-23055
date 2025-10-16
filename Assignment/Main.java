package mainpack;

import com.Mobile;
import com.Mobile1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mobile object ...set with setter\n");
        Mobile mobile = new Mobile();
        mobile.setBrand("Samsung");
        mobile.setPrice(25000);
        System.out.println("Brand: " + mobile.getBrand());
        System.out.println("Price: " + mobile.getPrice());
        mobile.MobileStatus();

        System.out.println("\nMobile1 object ...set with constructor\n");
        Mobile1 mobile1 = new Mobile1("iPhone", 90000);
        System.out.println("Brand: " + mobile1.getBrand());
        System.out.println("Price: " + mobile1.getPrice());
        mobile1.MobileStatus();
    }
}
