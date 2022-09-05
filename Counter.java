package day29_staticKeyword;

public class Counter {

        int count;
        static int stCount;
        public Counter(){                    //3                         //7
            count++;                         //4    count 0+1=1 cs1      //8  count 0+1= cs2
            stCount++;                       //5    stCount 0+1=1 static //9  stCount 1+1=2 static
        }public int getCount(){
            return count;
        }public static int getStCount(){
            return stCount;
        }


    public static void main(String[] args) {    //1
        Counter cs1=new Counter();              //2
        Counter cs2=new Counter();              //6
        Counter cs3=new Counter();              //10...
        Counter cs4=new Counter();
        Counter cs5=new Counter();
        Counter cs6=new Counter();
        System.out.println("count is: "+cs6.getCount());  //instance oldugundan cs6=1
        System.out.println("stCount is: "+cs6.getStCount()); //static oldugundan cs6=6
    }
}
