package prometheus.week_5.task1_2;

class Help implements Command{
    public void execute(){
        System.out.println("Help executed");
    }
}
class Echo implements Command{
    String str;
    public void execute(){
        System.out.println(str);
    }
}
class Date_now implements Command{
    public void execute(){
        System.out.println(System.currentTimeMillis());
    }
}
class Exit implements Command{
    public void execute(){
        System.out.println("Goodbye!");
    }
}