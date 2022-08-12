

public class Shot {
    public static void main (String[] args){
        int x = 99;
        double z = 21.1;
        String y = "Yes";

        System.out.println(add(x,x));
        System.out.println(add(z,z));
        System.out.println(add(y,y));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static String add(String a, String b){
        return a+b;
    }
}
