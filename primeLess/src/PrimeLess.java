
public class PrimeLess {
    public static void main(String[] args) {
        int count = 0;
        int N =1 ;
        for (int i = 2;i<100;i++){
            for (int j=2;j<=Math.sqrt(N);j++){
                if(N%j==0){
                    count = 0;
                    break;
                }
            }
            if (count!=0&&N<100){
                System.out.println(N);
            }
            count++;
            N++;
        }
    }
}
