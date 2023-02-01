package array;

public class Personnummer {
    /*66.I en array finns ett personnummer. Skapa ett program som kontrollerar att födelsedatum och
           de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett felmeddelande om så ej är fallet.

           67.Om den näst sista siffran är jämn i personnumret är det en kvinna, om den är ojämn är det
   en man. Avgör om personen i föregående uppgift är man eller kvinna.
            */
    public static void main(String[] args) {



        String[] personnumber = {"20220115-1089","2201151234"};

        for (int i = 0; i < personnumber.length; i++) {

            if (personnumber[i].charAt(8) != '-') {
                System.out.println("personnumret "+ i+" saknas ett bindestreck.");
            }

            if(personnumber[i].charAt(11)%2==0){
                System.out.println("En kvinna");
            } else if (personnumber[i].charAt(12)%2!=0) {
                System.out.println("En man");

            }

        }


    }
}
