package pro.sky.java.course2.calculator2;

public class calculatorService {


    public calculatorService() {

    }
    public static String sum (int num1, int num2){
        int sum=num1+num2;
        System.out.println(sum);
        return num1+"+"+num2+"="+sum;
    }
    public static String minus(int num1,int num2){
        int minus=num1-num2;
        System.out.println(minus);
        return num1+"-"+num2+"="+minus;
    }
    public static String multiply( int num1,int num2){
        int multiply= num1*num2;
        System.out.println(multiply);
        return num1+"*"+num2+"="+multiply;
    }

    public static String divide( int num1,int num2){
        if(num2==0){
            System.out.println("На ноль делить нельзя");
            return "На ноль делить нельзя";
        }else {
            float divide=num1/num2;
            System.out.println(divide);
            return num1+"/"+num2+"="+divide;
        }


    }




}
