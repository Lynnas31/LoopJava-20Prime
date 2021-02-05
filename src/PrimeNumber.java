import java.util.Scanner;

public class PrimeNumber {
    public static boolean kiemtranguyento(int N){
            for(int i =2; i<=Math.sqrt(N);i++){
                if(N%i == 0){
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao so luong so nguyen duong");
            int n = input.nextInt();
            int count = 0;
            int N = 2;
            while (count <= n){
                if (kiemtranguyento(N)){
                    System.out.println(N);
                    count++;
                }
                N ++;
            }

        }
}


