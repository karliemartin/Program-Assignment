/*
 *com210 work
 */
package pkg210com;

public class Main {

    public static void main(String[] args) 
    {
        System.out.println("Life is good"); //Q1
        
        //this is a single comment Q2
        /**
         * this is a multiple line comment.Q2
         */
        
        String carName = "Volvo"; //Q3
        
        int x1 = 5;
        int y1= 10;
        System.out.println(x1+y1); //Q4
        
        double myDouble = 9.78d;//Q5
        int myInt = (int)myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);
        
        
        int x = 6;
        int y = 6;
        if (x==y)
        {
          System.out.println("values are equal");
        }//Q6
 
        if(x==y){
           System.out.println("1");
         } else if(x>y)
        {
          System.out.println("2");
         }else{
          System.out.println("3");
         } //Q7
 
        for(int i = 0; i<5;i++){
        System.out.println("Yes");
        }//Q8
 
        String carBrands[] = new String [5];
        carBrands[1]="Honda";
        System.out.println(carBrands.length);
        System.out.println(carBrands[1]);
        
        String numbers [] []={
            {"1","2","3","4",},
            {"5","6","7"}
        };
        System.out.println(numbers[0][1]);
        
        
         
    }

    
}
