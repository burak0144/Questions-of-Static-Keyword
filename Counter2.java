package day29_staticKeyword;

public class Counter2 {

    int count=0;

    Counter2(){                                  //3             //7              //11
        count++;                                 //4 c1 count=1  //8 cs2 count=1  //12 cs3 count=1
        System.out.println(count);               //5 1 yazdirir  //9 1 yazdirir   //13 1 yazdirir
    }

    public static void main(String[] args) {      //1
        Counter2 c1=new Counter2();               //2
        Counter2 c2=new Counter2();               //6
        Counter2 c3=new Counter2();               //10
    }
    // SONUC
    // 1
    // 1
    // 1
}
