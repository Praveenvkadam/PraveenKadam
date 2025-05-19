import java.util.Scanner;

public class Problem_1 {

   private double a;
   private double b;
   private String operation;

   public Problem_1(double a, double b, String operation) {
       this.a = a;
       this.b = b;
       this.operation = operation=operation.toLowerCase();
   }
   public double Calculate() {
       switch (operation) {
           case "add":
               return a + b;
           case "sub":
               return a - b;
           case "mul":
               return a * b;
           case "div":
               if(b==0){
                   System.out.println("cannot divide by zero");
               }
               return a / b;
           default:
               System.out.println("Invalid operation");
               return 0;
       }

   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number and operation");
       System.out.print("a = ");
       double a = sc.nextDouble();
       System.out.print("b = ");
       double b = sc.nextDouble();
       System.out.print("write operation = ");
       String operation = sc.next();
       Problem_1 problem = new Problem_1(a, b, operation);
       System.out.println("Answer="+problem.Calculate());
   }
}
