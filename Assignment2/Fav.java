public class Fav{
    public static void main(String[] args) {
        IceCream i = new IceCream();  // object create
        i.setFlavour("Chocolate");    // setter দিয়ে মান দিচ্ছি
        System.out.println("Favourite ice cream: " + i.getFlavour()); // getter দিয়ে নিচ্ছি
    }
}