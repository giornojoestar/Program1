import java.util.Scanner;



class Program1{
    public static void main (String [] arg) {    
       String name="Kye Joestar",
             major="I.T.",
         className="FrostU";
       int taken= 666;
       int semester= 13;
       System.out.println("Your name: "+name+"\n"
       + "Your major: "+ major + "\n"+
       "Your class name: "+className + "\n"
       +"Total credits taken: "+taken + "\n"
       +"Credits this semester: "+semester);
          
       System.out.println("R.I.P. Iggy");
       numericalComputations();
       sumOfNumbers();
    }  
    public static void numericalComputations(){
        int num=100;
        for(int i=1;i<11; i++){
          
             
            System.out.printf("%s %d %s %d %n","maximunNumber + ",i , " = ", (num+i));
            System.out.printf("%s %d %s %d %n","maximunNumber - ",i , " = ", (num-i));
            System.out.printf("%s %d %s %d %n","maximunNumber * ",i , " = ", (num*i));
            System.out.printf("%s %d %s %d %n","maximunNumber / ",i , " = ", (num/i));
            System.out.printf("%s %d %s %d %n","maximunNumber % ",i , " = ", (num%i));
            
        }
    }
    public static void sumOfNumbers(){
       int num=100; 
       int n =0;
       while(n<=100){
          num+= ((1+ n)*(n/2));
          n++; 
       }
       System.out.println(num);
       
       
    } 
}
