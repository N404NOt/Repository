import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-04-19
 * Time: 22:23
 */
public class TestDemo {
    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
    }
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float n=scanner.nextFloat();
        System.out.println(n);
    }
    public static void main6(String[] args) {
        float a=0.0f;
        int b=5;
        System.out.println(b/a);
    }
    public static void main5(String[] args) {
        boolean a=true;
        boolean b=true;
        System.out.println(a==b);
    }
    public static void main4(String[] args) {
        double x=2.0; int y=4;
        x/=++y;
        System.out.println( x);
    }
    public static void main3(String[] args) {
        /*int a=1;
        String b=a+"hhhh";
        System.out.println(b+2+'5'+"aaa");
        System.out.println("最大值:"+String.MAX_VALUE);*/
        /*char a='a';
        int b=1;
        int c=a+b;
        System.out.println(c);*/
        /*String a="1234";
        a="456789";
        int b=Integer.parseInt(a)+2;
        System.out.println(a);
        System.out.println(b);*/
       /* StringBuilder sb=new StringBuilder("hello");
       // String sb="hello";

        System.out.println(sb);*/
        int a=4,b=6;
        System.out.println(b+"a"+a+b);
    }
    public static void main(String[] args) {
       // char b='高';
       // byte a=b;
        //long a=b;(
       // byte a=9;
       // byte b=(byte)(a+99999);
        //TODO:这里
       // int a=9;
//        boolean a=true;
//        System.out.println(a);
      //  System.out.println("a"+a);
        byte a=1;
        byte b=2;
        byte c=(byte)(a+b);
        //System.out.println(c);
        char d=97;
        //System.out.println(d+2);
        String ch="1abeeerdx";
        System.out.println(ch.length());
        System.out.println(ch.toUpperCase());
        System.out.println(ch);
        System.out.println(ch.toLowerCase());
        System.out.println(ch.replace("e","hhhhh"));
        System.out.println(ch);
        System.out.println(Integer.parseInt(ch)+9999);
        int e=1111111;
        String v=String.valueOf(e);
        System.out.println(v+"hhhhh"+"aaaa");
    }
    public static void main1(String[] args) {
        System.out.println("最大值:"+Integer.MAX_VALUE);
        System.out.println("最小值"+Integer.MIN_VALUE);
        System.out.println("最大值"+Long.MAX_VALUE);
        int a=1;
        System.out.println(a);
        double b=3.266f;
        long c=16l;
        System.out.println(c);
        System.out.println(b);
    }
}
