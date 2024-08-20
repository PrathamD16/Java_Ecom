import java.util.*;
class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }
}
public class Com_Java {
    public static void main(String[] args) {
        ArrayList<Student>st = new ArrayList<>();

        st.add(new Student("B", 10));
        st.add(new Student("C", 50));
        st.add(new Student("A", 21));
        Collections.sort(st);
        
//      ** Anonymous Class
//        Collections.sort(st, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.marks - o1.marks;
//            }
//
//        });

        for(Student x: st){
            System.out.println(x);
        }
    }
}
