package prometheus.week2;

public class BinarySearch {

    public static void main(String[] args) {

        int data[] = {  3, 48, 63, 73, 79, 80, 83, 84, 91, 98};
        int numberToFind = 48;
        int length = data.length;
        int middle;
        int low = 0;
        int guess;
        boolean flag =false;
        int high = length - 1;
        while (low<=high){
            middle = (low+high)/2;
            guess = data[middle];
            System.out.println("guess "+guess);

            if (guess==numberToFind){
                flag =  true;
                System.out.println(middle);
                break;
            }
            else if (guess>numberToFind){
                high = middle-1;
                System.out.println("Your guess is higher:\nlow = "+middle);
            }else{
                low = middle+1;
                System.out.println("Your guess is lower:\nhigh = "+middle);
            }
        }
        if (flag==false){
            System.out.println(-1);
        }
    }
}
