package prometheus.week_6.task_1;

public class TestRle {
    public static void main(String [] args){
        System.out.println("\tMY ANSWERS:\t");

        String[] testString = {"Hhhhhhhhhhhhhheeeellooooo"};
        System.out.println("test1 string - " + testString[0]);
        RLE.main(testString);
        testString[0] = "";
        System.out.println("mytest2 string - " + testString[0]);
        RLE.main(testString);
        testString[0] = "hh44tttti";
        System.out.println("mytest3 string - " + testString[0]);
        RLE.main(testString);
        testString[0] = "hh44+ttti";
        System.out.println("mytest4 string - " + testString[0]);
        RLE.main(testString);


        System.out.println("\tRIGHT ANSWERS:");
            String[]testString2 = {"Hhhhhhhhhhhhhheeeellooooo"};
            System.out.println("rtest1 string - " + testString2[0]);
            ApplicationRLE.main(testString2);
            testString[0] = "";
            System.out.println("test2 string - " + testString[0]);
            ApplicationRLE.main(testString);
            testString[0] = "hh44tttti";
            System.out.println("test3 string - " + testString[0]);
            ApplicationRLE.main(testString);
            testString[0] = "hh44+ttti";
            System.out.println("test4 string - " + testString[0]);
            ApplicationRLE.main(testString);

    }
}
