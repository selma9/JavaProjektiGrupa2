
package one;


public class UnaryDemo {
    public static void main(String[] args) {
        int result1=+4;
        result1=result1+1; 
        System.out.println(result1++);
        System.out.println(result1);
        System.out.println(++result1);
        int result=3;
        result=result-2;
        System.out.println(result--);
        System.out.println(result);
        System.out.println(--result);
        boolean uspio=false;
        System.out.println(!uspio);
        boolean nijeUspio=true;
        System.out.println(!nijeUspio);
    }
}
