package array;

public class Add2to50Nr {
    //69.En array med 50 inlästa tal finns. Addera talet 2 till talen på indexplats 0, 2, 4,… i
    //arrayn.

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<numbers.length;i++){
            if(i%2==0){
                numbers[i]=numbers[i]+2;
                System.out.println(numbers[i]);
            }
        }
    }
}
