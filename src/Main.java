import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        //Java Stdin and Stdout II
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Bir int değer giriniz: " );
        int i=scan.nextInt();
        System.out.println("Bir double değer giriniz: " );
        double d=scan.nextDouble();
        System.out.println("Bir string değer giriniz: " );

        String s=scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
*/

        //Java Loops I
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<11;i++){
            System.out.println(N +" x "+ i+" ="+ N*i);

        }
        bufferedReader.close();*/


        //Java Loops II
        /*Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int n;
        int a;
        double b;
        for (int i=0; i < t; i++) {
            a=in.nextInt();
            b=in.nextInt();
            n=in.nextInt();
            double sum=a;
            for (int j=0; j < n; j++) {
                double temp=(Math.pow(2,j)*b);
                sum+=temp;
                System.out.print((int)sum+" ");
            }
            System.out.println();

        }
        in.close();*/

        //Java End-of-file
        Scanner scanner=new Scanner(System.in);
        int i=1;
        while(scanner.hasNext()){
            System.out.println(i+" "+scanner.nextLine());
            i++;
        }








    }
}
