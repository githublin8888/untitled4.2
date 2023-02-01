package lesson1;


import java.util.Scanner;

public class Number {
    public static void main(String[] args) {


        Tringel tringel=new Tringel();


        double c=tringel.hypo(3,4);
        System.out.println(c);

        String []name={"Tom","andy","may","sindy","owen"};
        System.out.println(name[0]);


        Scanner scan = new Scanner(System.in);

        String [] pupil=new String[5];

        for(int i=0; i< pupil.length; i++){
            pupil[i]=scan.nextLine();

        }
        System.out.println(pupil[0]+" "+pupil[pupil.length-1]);


    }

}
