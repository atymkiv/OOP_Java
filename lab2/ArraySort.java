package prometheus.week2;


public class ArraySort {

    public static void main(String[] args) {
        int[] array = {1, 1, 0};
        int length = array.length;
        int tempo;
        //PUT YOUR CODE HERE
        for (int i =0; i<length-1; i++) {
            for (int s = 0; s < length-1; s++) {


                for (int j = i + 1; j < length; j++) {
                    if (array[i] > array[j]) {
                        tempo = array[j];
                       // System.out.println(tempo);
                        array[j] = array[i];
                        array[i] = tempo;
                        break;
                    }
                }
               /* for (int k = 0; k < length; k++) {
                    System.out.print(array[k] + " ");

                }*/
             //   System.out.println();
                tempo = 0;
            }
        }
                //PUT YOUR CODE HERE

                for (int i = 0; i < length; i++) {
                    System.out.print(array[i] + " ");
                }
            }
        }



