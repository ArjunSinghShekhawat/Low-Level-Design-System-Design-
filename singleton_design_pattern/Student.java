package singleton_design_pattern;

public class Student {

    private Student(){
        System.out.println("Constructor invoked !");
    }
    private static class Holder{
        private static final Student INSTANCE = new Student();
    }
    public static Student createStudent(){
        return Holder.INSTANCE;
    }
}
