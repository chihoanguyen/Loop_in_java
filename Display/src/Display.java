import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        int choice = 5;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Print the retangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print the square triangle");
            System.out.println("4.Print isosceles triangle");
            System.out.println("5.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the retangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j=1;j<=7;j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for(int i=1;i<=5;i++){
                        for (int j=1;j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print the square triangle");
                    for (int i=1;i<=5;i++){
                        for (int j=5;j>=i;j--){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Print isosceles triangle");
                    for(int i=1;i<=5;i++){
                        for (int j=5;j>i;j--) {
                            System.out.print(" ");
                        }
                        for (int k=1;k<=i;k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                }
            }
        }
    }

