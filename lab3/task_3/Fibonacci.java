package prometheus.week_3.task_3;
public class Fibonacci {
    Fibonacci(){};
    public  long getNumber(int position) {
            if(position > 0 && position < 93) {
                if (position > 2)
                    return getNumber(position - 1 ) + getNumber(position-2);
                else
                    return 1;
            }
            else
                return -1;

    }
}
