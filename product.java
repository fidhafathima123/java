public class product
{
	    int pcode;
	    String pname;
	    int price;
	    int lowest;
	    void data(int c, String n, int p){
	        pcode=c;
	        pname=n;
	        price=p;
	    }
	    void display(){
	         
	        System.out.println(pcode+"\t\t"+pname+"\t\t "+price);
	        
	    }  
	    static void findLowest(int price1,int price2, int price3){
	    if(price1<=price2 && price1<=price3){
	        System.out.println("\nProduct 1 is of the lowest price!");
	        
	    }
	    else if(price2<=price1 && price2<=price3){
	        System.out.println("\nProduct 2 is of the lowest price!");
	        
	    }
	    else{
	        System.out.println("\nProduct 3 is of the lowest price!");
	        
	    }
	    
	   }
	  public static void main(String[] args){
	       System.out.println("Fidha Fathima Rollno:27 Q1- Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of 
the class and find the product having the lowest price.date: 14-feb-24 ");
	        product obj1 = new product();
	        product obj2 = new product();
	        product obj3 = new product();
	        obj1.data(101,"Product 1",1);
	        obj2.data(102,"Product 2",1);
	        obj3.data(103,"Product 3",7);
	       
	        System.out.println("Product Information:\n Product Code\tProduct_Name\tProduct Price");
	        obj1.display();
	        obj2.display();
	        obj3.display();
	        findLowest(obj1.price,obj2.price,obj3.price);    
	        
	    }
	}
