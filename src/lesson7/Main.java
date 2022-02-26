package lesson7;

public class Main {

    public static void main(String[] args) {
        ExcellentStudent excellentStudent1 = new ExcellentStudent(23, "Vasya");
        ExcellentStudent excellentStudent2 = new ExcellentStudent(23, "Vasya");

        Student student1 = new Student(24, "Kirill");
        Student student2 = new Student(24, "Kirill");

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1);

        excellentStudent1.perimetrTriangle(1, 2, 5);

        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = excellentStudent1;
        students[3] = excellentStudent2;

        // for each
        for (Student s:students) {
            System.out.println(s.perimetrTriangle(2, 4, 20)); //полиморфизм
        }

    }
}
