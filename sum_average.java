public class sum_average {
    public static void main(String[]args){
        int[] numbers = {10,20,30,40,50,60};
        int sum = 0;
        for (int num:numbers){
            sum+=num;

        }
        double average = (double) sum/numbers.length;
        System.out.println("sum: "+sum);
        System.out.println("Average: "+ average);
    }
}
