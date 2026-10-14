class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Amaan", 22);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setAge(25);
        System.out.println("Updated age: " + student.getAge());

        student.setAge(-5);
        System.out.println("Final age: " + student.getAge());
    }
}