/**
 * Created by Евгений on 11.04.2017.
 */
public class Main {

    public static  void  main(String [] arg) {
    System.out.println("Hello world!!!");
    Student studentEugene=new Student();
        studentEugene.name="Eugene";
        studentEugene.age=20;
        studentEugene.sayHello();
    Student studentMax;
    studentMax=new Student();
        studentMax.name="Max";
        studentMax.age=20;
        studentMax.sayHello();
    Classs classJava= new Classs();
    classJava.name="Class Java";
        System.out.println(""+classJava.name);
    }

}
