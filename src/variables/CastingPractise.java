package variables;

public class CastingPractise {

    public static void main(String[] args) {


        short samsung=1000;
        short apple=900;
        //int samsung+apple;

        //Casting primitive data types
        //integral without decimal points

        short totalPrice=(short)(samsung+apple);

        //byte,short,int and long is called integral values
        //float and double is called floating point numbers

        long studentNumber=1200l;
        //we need to cast the longer values to smaller values
        int studentNumber1=(int)studentNumber;

        long num=studentNumber1;

        double st=num;

        double K=800.7d;

        int L=(int)K;
        System.out.println("The L is " +L);

        int x=10;
        int y=5;
        x*=y; //compound assignments x=x*y; 50 x=x+y
        x/=y;  //10/5=2
        x%=y ; //5+5=0

        System.out.println(x);

        long l=5;
        int h=8;

        //long ln=l*h; //40

        h=(int)l*h; //40

        //differences between "l*h"  and h*=l;
        //1-if you are using l*h you need to explicity cast the value
        //2-if you are using h*=l you don't need to cast explicity

        h*=l;


        byte bookNumber=15;
        int bookPrice=5;

        bookNumber=(byte)(bookNumber*bookPrice);
        //-128 -127
        //150


        //bookNumber*=bookPrice;


        System.out.println(bookNumber); //page 60,61,62






    }
}
