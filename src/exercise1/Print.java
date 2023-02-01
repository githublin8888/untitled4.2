package exercise1;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {


           /* Scanner scan = new Scanner(System.in);
            for(int i=0;i<2;i++){
                int number = Integer.parseInt(scan.nextLine());
                System.out.println(number);
            }

        System.out.println(0);


            for(int i=1; i<100; i++){
                if (i%2==0){
                    System.out.println(i);
                }

            }

        for(int i=100; i>0; i--){
            System.out.println(i);
        }

        String tecken="";
        while (!"*".equals(tecken)){
            Scanner scan = new Scanner(System.in);
            tecken=scan.nextLine();
            System.out.println(tecken);
        }

        int square = 0;
        for (int i = 1; i < 9; i++) {
            square = i * i;
            System.out.println(square);
        }


        Scanner scan = new Scanner(System.in);
        double interest = Double.parseDouble(scan.nextLine());

        double balance = 1000;
        System.out.println(balance);

        for (int i = 0; i < 9; i++) {
            balance = balance * (1+interest);
            System.out.println(balance);
        }


        int nr = 0;
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < count; i++) {
            nr = Integer.parseInt(scan.nextLine());
        }
        System.out.println(count);


        Scanner scan = new Scanner(System.in);
        int year = Integer.parseInt(scan.nextLine());
        double inhabitant=0;
        for (int i=2016; i<year;i++){
             inhabitant=26000*(1+0.7-0.6)+300-325;
        }
        System.out.println(inhabitant);


        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());
        while (price != 0) {
            price = price * (1 + 0.25);
            System.out.println(price);
            price = Double.parseDouble(scan.nextLine());
        }

        int answer = 0;
        for (int i = -10; i <= 10; i++) {
            answer=3*i;
            System.out.println(answer);

        }

        int sum=0;
        for(int i=0; i<50; i++){
            sum=sum+i;
        }
        System.out.println(sum);

  //42
        int sum1=0;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<20;i++){
            int number1 = Integer.parseInt(scan.nextLine());
            sum1=sum1+number1;
        }
        System.out.println(sum1);

        //43
        int sum2 = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 2; i < 31; i++) {
            if (i % 2 == 0) {
                sum2 = sum2 + i;
            }
        }
        System.out.println(sum2);

        //44
        int sum3=0;
        System.out.println("How much numbers do you want to add upp: ");
        Scanner scan = new Scanner(System.in);
        int count1 = Integer.parseInt(scan.nextLine());

        System.out.println("enter the numbers: ");

        for(int i=0; i<count1;i++){
            int number2 = Integer.parseInt(scan.nextLine());
            sum3=sum3+number2;
        }
        System.out.println(sum3);

        //45
        int sum4=0;
        double count2=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int nr3 = Integer.parseInt(scan.nextLine());

        while (sum4<100000){
            sum4=sum4+nr3;
            count2=sum4/nr3;
        }
        System.out.println(count2);

        //46
        int salary=1;
        int day=1;
        while (salary<1000000){
            salary=salary+salary*2;
            day++;
        }
        System.out.println(day);

        //47
        for(int i=1;i<16;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

        //49

        Scanner scan = new Scanner(System.in);
        System.out.println("enter x and n: ");
        int x = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int f=x*n;
        System.out.println(f);


        //48
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = Integer.parseInt(scan.nextLine());

        int product=1;
        for(int i=1; i<n; i++){
            product=product*(i+1);
            System.out.println(product+"="+product/(i+1)+"*"+(i+1));
        }



//50
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n1 = Integer.parseInt(scan.nextLine());

        int product = 0;
        for (int i = 0; i < n1; i++) {
            product= 1 * (i + 1);
            System.out.println(product / (i + 1) + "*" + (i + 1) + "=" + product);
        }

        System.out.println("------------");
        int product = 0;
        for (int j = 1; j < n1; j++) {
            product = 2 * (j + 1);
            System.out.println(product / (j + 1) + "*" + (j + 1) + "=" + product);

        }


        //51
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 100 numbers: ");

        int count=0;
        int n2=0;
        for(int i=0;i<100;i++){
            n2 = Integer.parseInt(scan.nextLine());

            if(n2==7){
                count++;
            }
        }
        System.out.println(count);

        //52
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 5 numbers: ");

        int nr = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            nr = Integer.parseInt(scan.nextLine());

            if (nr > 0) {
                sum = sum + nr;
            }
        }
        System.out.println(sum);

        //55
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 6 numbers: ");
        int nr1 = Integer.parseInt(scan.nextLine());

        int nr = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 5; i++) {
            nr = Integer.parseInt(scan.nextLine());

            if (nr > nr1) {
                sum1 = sum1 + nr;
            } else if (nr<nr1) {
                sum2 = sum2 + nr;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);

        //58
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 5 numbers: ");

        int biggest = 0;

        for (int i = 0; i < 4; i++) {
            int nr = Integer.parseInt(scan.nextLine());

            if(nr>biggest){
                biggest=nr;
            }
        }
        System.out.println(biggest);

        //60
        Scanner scan = new Scanner(System.in);

        int nr1 = Integer.parseInt(scan.nextLine());
        int count = 0;
        while (nr1 != 0) {
           int nr2 = Integer.parseInt(scan.nextLine());
            if (nr2 == nr1) {
                count++;
            }
            nr1=nr2;
        }
        System.out.println(count+" times two adjacent numbers are equal.");

        //61
        Scanner scan = new Scanner(System.in);

        int nr1 = Integer.parseInt(scan.nextLine());
        int count = 0;
        while (nr1 != 0) {
            int nr2 = Integer.parseInt(scan.nextLine());
            if (nr2 == nr1) {
                count++;
            }
            nr1=nr2;
        }
        System.out.println(count+" times two adjacent numbers are equal.");*/
    }
}
