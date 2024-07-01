import java.util.Scanner;
/* 
class HelloWorld {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s= a.nextLine();
        System.out.println("you entered string"+s);
        int x = a.nextInt();
        System.out.println("you entered integer"+x);
        float f = a.nextFloat(); 
        System.out.println("yo");
    }
    
}

class HelloWorld{
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int n = sum.nextInt();
        int  add = n*(n+1)/2;
        System.out.println(add);
    }
}
*/
class HelloWorld {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int n = sum.nextInt();
        int  y=Math.abs(n);
        int add =y%10;
        System.out.println(add);
    }
}