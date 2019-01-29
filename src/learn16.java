
/*
constructor
 */


public class learn16 {
     public static void main(String[] args){

         Phone p = new Phone("ADCALDJS",122.11);
         p.getPrice();
         p.show();
     }

}
class Phone{
    private String brand;
    private double price;

    public Phone(){}

    public Phone(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(double price) {
        this.price = price;

    }
    public double getPrice(){
        return price;
    }
    public void show(){
        System.out.println(brand+price);
    }
}
