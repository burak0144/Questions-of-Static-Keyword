package day29_staticKeyword;

public class Student {
    int number;
    String name;
    static String college="ITS";
    Student(int r,String n,String college){   //3 r=111 n=Karan college=MIT    //8  r=222 n=Aryan college=Harvard
        this.number = r;                      //4 r=111 s1 instance            //9 r=222 s2 instance
        this.name = n;                        //5 n=Karan s1 instance          //10 n=Aryan instance
        this.college = college;               //6 college=MIT static        //11 college=Harvard static

    }

    public static void main(String[] args) {                          //1
        Student s1=new Student(111,"Karan","MIT");      //2
        Student s2=new Student(222,"Aryan","Harvard");   //7

        System.out.println(s1.number);  //8  111
        System.out.println(s2.number);  //9  222

        System.out.println(s1.name);    //10 Karan
        System.out.println(s2.name);    //11 Aryan

        System.out.println(s1.college); //12 Harvard (static oldugundan burada son halini yansitir)
        System.out.println(s2.college); //13 Harvard
    }
}
