import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if(num%i ==0){
                sum+=i;
            }
        }
        if(num == sum)System.out.printf("%d Bir Mükemmel Sayıdır",num);
        else System.out.printf("%d Bir Mükemmel Sayı DEĞİLDİR",num);
        sc.close();
    }            
}