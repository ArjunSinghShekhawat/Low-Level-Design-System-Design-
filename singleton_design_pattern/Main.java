package singleton_design_pattern;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(()->{
            Student student1 = Student.createStudent();
            System.out.println(student1.hashCode());
        });
        Thread thread2 = new Thread(()->{
            Student student2 = Student.createStudent();
            System.out.println(student2.hashCode());
        });
        thread1.start();
        thread2.start();



    }
}
