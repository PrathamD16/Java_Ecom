import java.util.*;
class Student {
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Marks: " + marks;
    }
}
public class Com_Java {
    public static void main(String[] args) {
        ArrayList<Student>st = new ArrayList<>();
        st.add(new Student("C", 50));
        st.add(new Student("A", 21));
        st.add(new Student("B", 10));

        Collections.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for(Student x: st){
            System.out.println(x);
        }
    }
}
