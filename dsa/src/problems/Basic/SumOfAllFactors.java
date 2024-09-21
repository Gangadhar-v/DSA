package problems.Basic;

public class SumOfAllFactors {

    public static int sumOfAllFactors(int number){
        int sum = 0;

        for(int i = 1;i<=number;i++){
            if(number%i == 0){
                sum+=i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAllFactors(6));
    }
}
