/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appendixb_page4;

import java.util.Scanner;

/**
 *
 * @author hjones2368
 */
public class AppendixB_page4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Scanner keyboard = new Scanner(System.in);
      //System.out.println("Hello out there.");
      //System.out.println("Want to talk some more?"); 
      //System.out.println("Answer yes or no.");

      //String answer = keyboard.next();
      //if (answer.equals("yes"))
      //   System.out.println("Nice weather we are having.");
      //System.out.println("Good-bye.");
      
       double[] array = {0.1, 0.2, 0.3};
       System.out.println("array[0]" + array[0]);
       incrementByTwo(array);
       System.out.println("array[0]" + array[0]);
       
       int x = 10;
       System.out.println("after x=" + x);
       x = incrementByThree(x);
       System.out.println("after x=" + x);
       
       AutoMobile marcsCar = new AutoMobile();
       AutoMobile henrysCar = new AutoMobile();
       
       marcsCar.Make = "nissan";
       marcsCar.Mileage = 1800000;
       marcsCar.Model = "Versa";
       marcsCar.Year = 1996;
       
       henrysCar.Make = "nissan";
       henrysCar.Mileage = 1800000;
       henrysCar.Model = "Versa";
       henrysCar.Year = 1996;
       
       henrysCar.increaseMileage(100);
       
       System.out.println(henrysCar);
       System.out.println(marcsCar.setMileage(1000));
    
    
    
    
    }
    public static void incrementByTwo(double[] arr){
        for(int index=0; index<arr.length; index++){
            arr[index] =arr[index] + 2;
        }
    }
    public static int incrementByThree(int val){ 
        val = val + 3;
        //System.out.println("after val=" + val);
        return val;
    }
    public static class AutoMobile{
        public AutoMobile(){
            autoCount = autoCount + 1;
        }
        
        
        public AutoMobile (String make, String model)
        {
            Make = make;
            Model = model;        
            autoCount = autoCount + 1;
        }
        
        
        
        String Type;
        String Make;
        String Model;
        int Year;
        int Mileage;
        static int autoCount = 0;
    
        public void increaseMileage(int mileage){
            Mileage = Mileage + mileage;
        }
        public String toString(){
        return Make + " " + Model + " " + Year;
        }
        
        public AutoMobile setMileage(int mileage)
        {
            Mileage = mileage;
            return this;
        }
    }
    
}

