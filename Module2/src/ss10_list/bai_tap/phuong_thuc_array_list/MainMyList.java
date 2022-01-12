package ss10_list.bai_tap.phuong_thuc_array_list;


public class MainMyList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Tuan");
        Student student2 = new Student(2, "Tu");
        Student student3 = new Student(3, "Tung");
        Student student4 = new Student(4, "Trung");
        Student student5 = new Student(5, "Thanh");
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.get(i).getName());
        }
    }
}
