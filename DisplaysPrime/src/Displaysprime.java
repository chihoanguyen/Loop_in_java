import java.util.Scanner;
public class Displaysprime {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int N = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố: ");
        number = sc.nextInt();
        System.out.println(2);
        for (int i = 1;i<number;){
            for (int j=2;j<=Math.sqrt(N);j++){
                if(N%j==0){
                    count = 0;
                    break;
                }
            }
            if (count!=0){
                System.out.println(N);
                i++;
            }
            count++;
            N++;
        }
    }
}
