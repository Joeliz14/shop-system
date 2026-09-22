// GROUP MEMBERS - BBC 2
// 1. KAIHURA 
// 2. WAFULA JOEL 25/U/24171
// 3. Add name 3
// 4. Add name 4
// 5. Add name 5

import java.util.Scanner;

public class ShopSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        
        // for loop
        for(int i=1; i<=3; i++){
            System.out.println("Enter price for item "+i);
            int price = input.nextInt();
            total = total + price;
        }
        
        System.out.println("Your total is "+total);
        
        // ternary operator
        String message = (total > 15000) ? "you have discount" : "no discount";
        System.out.println(message);
        
        int discount = 0;
        if(total > 15000){
            discount = 1000;
        }
        
        int finalPrice = total - discount;
        System.out.println("Final price is "+finalPrice);
        
        // while loop
        System.out.println("Enter your money");
        int money = input.nextInt();
        
        while(money < finalPrice){
            System.out.println("Money is small, add more");
            int add = input.nextInt();
            money = money + add;
        }
        
        System.out.println("Balance is "+(money - finalPrice));
        
        // do while loop
        String answer;
        do{
            System.out.println("Do you want receipt? yes/no");
            answer = input.next();
            
            if(answer.equals("yes")){
                System.out.println("****RECEIPT****");
                System.out.println("Item 1 bought");
                System.out.println("Item 2 bought");
                System.out.println("Item 3 bought");
                System.out.println("Total paid "+finalPrice);
                System.out.println("Thanks for shopping");
            }
            if(answer.equals("no")){
                System.out.println("Ok no receipt");
            }
            
        }while(answer.equals("no"));
        
        System.out.println("Bye");
    }
}
