package array;


public class DoubleTheValue {

    //68.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayn.
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<numbers.length;i++){
            numbers[i]=numbers[i]*2;
            System.out.println(numbers[i]);
        }
    }
}
