package w7;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class laptop
{
    String brand;
    int RAM;
    int price;
    
    public laptop(String brand, int RAM, int price){
    this.brand=brand;
    this.RAM=RAM;
    this.price=price;
    
    }
    
    void display(){
    if(RAM>8){
    System.out.println("it has RAM greater than 8GB");
    }
    else {
    System.out.println("it has RAM less than 8GB");
    }
    }
}