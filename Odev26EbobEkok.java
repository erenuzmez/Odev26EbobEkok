package CDonguler;
import java.util.Scanner;
public class Odev26EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz:");
        int n1=input.nextInt();
        System.out.println("2.sayıyı giriniz:");
        int n2=input.nextInt();
        int i=1,ebob=1,x=1;
        while (i<=n1){
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("EBOB:"+ebob);
        while(x<=(n1*n2)){
            x++;
            if(x%n1==0 && x%n2==0){
                System.out.println("EKOK:"+x);
                break;
            }
        }
    }
}
