package w7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){//calssName cl=new className();
    student s1= new student(); //object
    s1.collegeID="np014268";
    s1.name="Sirapa";
    s1.age = 18;
    s1.study();
    System.out.println(s1.collegeID);
    System.out.println(s1.name);
    System.out.println(s1.age);
    
    student s2= new student(); //object
    s2.collegeID="np014260";
    s2.name="Sworup";
    s2.age = 20;
    s2.study();
    System.out.println(s2.collegeID);
    System.out.println(s2.name);
    System.out.println(s2.age);
    
    student s3= new student(); //object
    s3.collegeID="np014290";
    s3.name="Samyak";
    s3.age = 21;
    System.out.println(s3.collegeID);
    System.out.println(s3.name);
    System.out.println(s3.age);
    
    House h1= new House();
    h1.location="tinkune";
    h1.houseNo=123;
    h1.ownerName="Sirapa";
    h1.area=123.87;
    
    House h2= new House();
    h1.location="kausaltar";
    h1.houseNo=1234;
    h1.ownerName="Sworup";
    h1.area=123.879;
    
    book b1=new book();
    b1.title="Rio";
    b1.author="Mona Lisa";
    b1.price=200;
    System.out.println("the title,author and price is: " + b1.title + b1.author + b1.price);
    
    book b2=new book();
    b2.title="Muna Madan";
    b2.author="Laxmi Devi";
    b2.price=400;
    System.out.println("the title,author and price is: " + b2.title + b2.author + b2.price); 
    
    rectangle r1=new rectangle();
    r1.length=20;
    System.out.println("the length is: " +r1.length);
    r1.breadth=10;
    System.out.println("the breadth is: " +r1.length);
    r1.area();
    
    rectangle r2=new rectangle();
    r2.length=10;
    System.out.println("the length is: " +r2.length);
    r2.breadth=30;
    System.out.println("the breadth is: " +r2.length);
    r1.area();
    
    employee e1=new employee();
    e1.ID=123;
    e1.name="sita";
    e1.salary=30000;
    System.out.println(e1.ID + e1.name + e1.salary);
    e1.displayDetails();
    
    employee e2=new employee();
    e2.ID=1234;
    e2.name="siya";
    e2.salary=40000;
    System.out.println(e2.ID + " " + " " + e2.name + " " + e2.salary);
    e2.displayDetails();
    
    employee e3=new employee();
    e3.ID=1235;
    e3.name="sita";
    e3.salary=50000;
    System.out.println(e3.ID + e3.name + e3.salary);
    e3.displayDetails();
    
    if(e1.salary>e2.salary && e1.salary>e3.salary){
        System.out.println("the highest is :" + e1.salary);
    }
    else if(e2.salary>e1.salary && e2.salary>e3.salary){
        System.out.println("the highest is : " + e2.salary);
    }
    else{
        System.out.println("the highest is : " + e3.salary);
    }
    
    laptop l1=new laptop("lenovo",8,40000);
    l1.display();
    laptop l2=new laptop("asus",16,50000);
    l2.display();
    laptop l3=new laptop("hp",32,60000);
    l3.display();
    
    
    mobile m1=new mobile("samsung",2000);
    m1.isAffordable();
    mobile m2=new mobile("iphone",6000000);
    m2.isAffordable();
    mobile m3=new mobile("1 plus",700000);
    m3.isAffordable();
    
    result re1=new result(12,31,14);
    result re2=new result(12,31,14);
    re1.total();
    re2.total();
    
    BankAccount ba1=new BankAccount(123, "sita",200000);
    BankAccount ba2=new BankAccount(1234, "siya",300000);
    ba1.deposit(900000);
    ba1.withdraw(1600000);
    ba1.total();
    ba2.deposit(1000000);
    ba2.withdraw(200000);
    ba2.total();
}
}